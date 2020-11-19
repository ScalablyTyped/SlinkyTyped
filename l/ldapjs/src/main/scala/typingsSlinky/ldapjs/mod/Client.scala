package typingsSlinky.ldapjs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends EventEmitter {
  
  /**
    * Adds an entry to the LDAP server.
    *
    * Entry can be either [Attribute] or a plain JS object where the
    * values are either a plain value or an array of values.  Any value (that's
    * not an array) will get converted to a string, so keep that in mind.
    *
    * @param name the DN of the entry to add.
    * @param entry an array of Attributes to be added or a JS object.
    * @param controls (optional) either a Control or [Control].
    * @param callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def add(name: String, entry: js.Object, callback: ErrorCallback): Unit = js.native
  def add(name: String, entry: js.Object, controls: js.Array[Control], callback: ErrorCallback): Unit = js.native
  def add(name: String, entry: js.Object, controls: Control, callback: ErrorCallback): Unit = js.native
  
  /**
    * Performs a simple authentication against the server.
    *
    * @param dn the DN to bind as.
    * @param password the userPassword associated with name.
    * @param controls (optional) either a Control or [Control].
    * @param callback callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def bind(dn: String, password: String, callback: CallBack): Unit = js.native
  def bind(dn: String, password: String, controls: js.Array[Control], callback: CallBack): Unit = js.native
  def bind(dn: String, password: String, controls: Control, callback: CallBack): Unit = js.native
  
  /**
    * Compares an attribute/value pair with an entry on the LDAP server.
    *
    * @param name the DN of the entry to compare attributes with.
    * @param attr name of an attribute to check.
    * @param value value of an attribute to check.
    * @param controls (optional) either a Control or [Control].
    * @param callback of the form f(err, boolean, res).
    * @throws {TypeError} on invalid input.
    */
  def compare(name: String, attr: String, value: String, callback: CompareCallback): Unit = js.native
  def compare(name: String, attr: String, value: String, controls: js.Array[Control], callback: CompareCallback): Unit = js.native
  def compare(name: String, attr: String, value: String, controls: Control, callback: CompareCallback): Unit = js.native
  
  var connected: Boolean = js.native
  
  /**
    * Deletes an entry from the LDAP server.
    *
    * @param name the DN of the entry to delete.
    * @param controls (optional) either a Control or [Control].
    * @param callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def del(name: String, callback: ErrorCallback): Unit = js.native
  def del(name: String, controls: js.Array[Control], callback: ErrorCallback): Unit = js.native
  def del(name: String, controls: Control, callback: ErrorCallback): Unit = js.native
  
  /**
    * Disconnect from the LDAP server and do not allow reconnection.
    *
    * If the client is instantiated with proper reconnection options, it's
    * possible to initiate new requests after a call to unbind since the client
    * will attempt to reconnect in order to fulfill the request.
    *
    * Calling destroy will prevent any further reconnection from occurring.
    *
    * @param {Object} err (Optional) error that was cause of client destruction
    */
  def destroy(): Unit = js.native
  def destroy(err: js.Any): Unit = js.native
  
  /**
    * Performs an extended operation on the LDAP server.
    *
    * Pretty much none of the LDAP extended operations return an OID
    * (responseName), so I just don't bother giving it back in the callback.
    * It's on the third param in `res` if you need it.
    *
    * @param name the OID of the extended operation to perform.
    * @param value value to pass in for this operation.
    * @param controls (optional) either a Control or [Control].
    * @param callback of the form f(err, value, res).
    * @throws {TypeError} on invalid input.
    */
  def exop(name: String, value: String, callback: ExopCallback): Unit = js.native
  def exop(name: String, value: String, controls: js.Array[Control], callback: ExopCallback): Unit = js.native
  def exop(name: String, value: String, controls: Control, callback: ExopCallback): Unit = js.native
  
  def modify(name: String, change: js.Array[Change], callback: ErrorCallback): Unit = js.native
  def modify(name: String, change: js.Array[Change], controls: js.Array[Control], callback: ErrorCallback): Unit = js.native
  def modify(name: String, change: js.Array[Change], controls: Control, callback: ErrorCallback): Unit = js.native
  /**
    * Performs an LDAP modify against the server.
    *
    * @param name the DN of the entry to modify.
    * @param change update to perform (can be [Change]).
    * @param controls (optional) either a Control or [Control].
    * @param callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def modify(name: String, change: Change, callback: ErrorCallback): Unit = js.native
  def modify(name: String, change: Change, controls: js.Array[Control], callback: ErrorCallback): Unit = js.native
  def modify(name: String, change: Change, controls: Control, callback: ErrorCallback): Unit = js.native
  
  /**
    * Performs an LDAP modifyDN against the server.
    *
    * This does not allow you to keep the old DN, as while the LDAP protocol
    * has a facility for that, it's stupid. Just Search/Add.
    *
    * This will automatically deal with "new superior" logic.
    *
    * @param {String} name the DN of the entry to modify.
    * @param {String} newName the new DN to move this entry to.
    * @param {Control} controls (optional) either a Control or [Control].
    * @param {Function} callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def modifyDN(name: String, newName: String, callback: ErrorCallback): Unit = js.native
  def modifyDN(name: String, newName: String, controls: js.Array[Control], callback: ErrorCallback): Unit = js.native
  def modifyDN(name: String, newName: String, controls: Control, callback: ErrorCallback): Unit = js.native
  
  /**
    * Performs an LDAP search against the server.
    *
    * Note that the defaults for options are a 'base' search, if that's what
    * you want you can just pass in a string for options and it will be treated
    * as the search filter.  Also, you can either pass in programatic Filter
    * objects or a filter string as the filter option.
    *
    * Note that this method is 'special' in that the callback 'res' param will
    * have two important events on it, namely 'searchEntry' and 'end' that you can hook
    * to.  The former will emit a SearchEntry object for each record that comes
    * back, and the latter will emit a normal LDAPResult object.
    *
    * @param {String} base the DN in the tree to start searching at.
    * @param {SearchOptions} options parameters
    * @param {Control} controls (optional) either a Control or [Control].
    * @param {Function} callback of the form f(err, res).
    * @throws {TypeError} on invalid input.
    */
  def search(base: String, options: SearchOptions, callback: SearchCallBack): Unit = js.native
  def search(base: String, options: SearchOptions, callback: SearchCallBack, _bypass: Boolean): Unit = js.native
  def search(base: String, options: SearchOptions, controls: js.Array[Control], callback: SearchCallBack): Unit = js.native
  def search(
    base: String,
    options: SearchOptions,
    controls: js.Array[Control],
    callback: SearchCallBack,
    _bypass: Boolean
  ): Unit = js.native
  def search(base: String, options: SearchOptions, controls: Control, callback: SearchCallBack): Unit = js.native
  def search(
    base: String,
    options: SearchOptions,
    controls: Control,
    callback: SearchCallBack,
    _bypass: Boolean
  ): Unit = js.native
  
  def starttls(options: js.Object, controls: js.Array[Control], callback: CallBack): Unit = js.native
  def starttls(options: js.Object, controls: js.Array[Control], callback: CallBack, _bypass: Boolean): Unit = js.native
  /**
    * Attempt to secure connection with StartTLS.
    */
  def starttls(options: js.Object, controls: Control, callback: CallBack): Unit = js.native
  def starttls(options: js.Object, controls: Control, callback: CallBack, _bypass: Boolean): Unit = js.native
  
  /**
    * Unbinds this client from the LDAP server.
    *
    * Note that unbind does not have a response, so this callback is actually
    * optional; either way, the client is disconnected.
    *
    * @param {Function} callback of the form f(err).
    * @throws {TypeError} if you pass in callback as not a function.
    */
  def unbind(): Unit = js.native
  def unbind(callback: ErrorCallback): Unit = js.native
}
