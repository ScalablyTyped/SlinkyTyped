package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecord extends IObservable {
  /** [Property] (String) */
  var COMMIT: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var EDIT: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var REJECT: js.UndefOr[String] = js.native
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.native
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.native
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean Pass true to skip notification of the owning store of the change.
  		* @param modifiedFieldNames String[] Array of field names changed during sync with server if known. Omit or pass null if unknown. An empty array means that it is known that no fields were modified by the server's response. Defaults to false.
  		*/
  var commit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id, defaults to the id of the instance being copied. See id. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record Ext.data.Model.id(rec); // automatically generate a unique sequential id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IModel]] = js.native
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[String] = js.native
  /** [Method] Destroys the model using the configured proxy
  		* @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
  		* @returns Ext.data.Model The Model instance
  		*/
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.native
  /** [Method] Ends an edit
  		* @param silent Boolean True to not notify the store of the change
  		* @param modifiedFieldNames String[] Array of field names changed during edit.
  		*/
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of the given field
  		* @param fieldName String The field to fetch the value for
  		* @returns Object The value
  		*/
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets all of the data from this Models loaded associations
  		* @returns Object The nested data set for the Model's loaded associations
  		*/
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or commited
  		* @returns Object
  		*/
  var getChanges: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets all values for each field in this model and returns an object containing the current data
  		* @param includeAssociated Boolean True to also include associated data. Defaults to false.
  		* @returns Object An object hash containing all the values in this model
  		*/
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns the unique ID allocated to this model instance as defined by idProperty
  		* @returns Number/String The id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the configured Proxy for this Model
  		* @returns Ext.data.proxy.Proxy The proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.data.proxy.IProxy]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object/Ext.data.Field) */
  var idProperty: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var idgen: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var isModel: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
  		* @param fieldName String Ext.data.Field.name
  		* @returns Boolean
  		*/
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Checks if the model is valid
  		* @returns Boolean True if the model is valid.
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Tells this model instance that it has been added to a store
  		* @param store Ext.data.Store The store to which this model has been added.
  		*/
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var persistenceProperty: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Object/Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.native
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
  		* @param silent Boolean True to skip notification of the owning store of the change. Defaults to false.
  		*/
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Saves the model instance using the configured proxy
  		* @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
  		* @returns Ext.data.Model The Model instance
  		*/
  var save: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Sets the given field to the given value marks the instance as dirty
  		* @param fieldName String/Object The field to set, or an object containing key/value pairs
  		* @param newValue Object The value to set
  		* @returns String[] The array of modified field names or null if nothing was modified.
  		*/
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the model instance s id field to the given id
  		* @param id Number/String The new id
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the Proxy to use for this model
  		* @param proxy String/Object/Ext.data.proxy.Proxy The proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], typingsSlinky.extjs.Ext.data.proxy.IProxy]
  ] = js.native
  /** [Property] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Property] (Ext.data.Store[]) */
  var stores: js.UndefOr[Array] = js.native
  /** [Method] Tells this model instance that it has been removed from the store
  		* @param store Ext.data.Store The store from which this model has been removed.
  		*/
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Validates the current data against all of its configured validations
  		* @returns Ext.data.Errors The errors object
  		*/
  var validate: js.UndefOr[js.Function0[IErrors]] = js.native
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.native
}

object IRecord {
  @scala.inline
  def apply(): IRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecord]
  }
  @scala.inline
  implicit class IRecordOps[Self <: IRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMMIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCOMMIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMIT")(js.undefined)
        ret
    }
    @scala.inline
    def withEDIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEDIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDIT")(js.undefined)
        ret
    }
    @scala.inline
    def withREJECT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutREJECT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REJECT")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeginEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withBelongsTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belongsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelongsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belongsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: /* id */ js.UndefOr[String] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProxyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProxyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* options */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEndEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* fieldName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociatedData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChanges(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => typingsSlinky.extjs.Ext.data.proxy.IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMany(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMany")(js.undefined)
        ret
    }
    @scala.inline
    def withIdProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withIdgen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idgen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdgen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idgen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistenceProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantom")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: /* options */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.data.proxy.IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
    @scala.inline
    def withUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unjoin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnjoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unjoin")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => IErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validations")(js.undefined)
        ret
    }
  }
  
}

