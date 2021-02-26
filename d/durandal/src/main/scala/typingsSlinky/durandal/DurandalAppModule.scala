package typingsSlinky.durandal

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalAppModule extends DurandalEventSupport[DurandalAppModule] {
  
  /**
    * Closes the dialog associated with the specified object. via the dialog plugin.
    * @param {object} obj The object whose dialog should be closed.
    * @param {object} results* The results to return back to the dialog caller after closing.
    */
  def closeDialog(obj: js.Any, results: js.Any*): Unit = js.native
  
  /**
    * Configures one or more plugins to be loaded and installed into the application.
    * @method configurePlugins
    * @param {object} config Keys are plugin names. Values can be truthy, to simply install the plugin, or a configuration object to pass to the plugin.
    * @param {string} [baseUrl] The base url to load the plugins from.
    */
  def configurePlugins(config: js.Object): Unit = js.native
  def configurePlugins(config: js.Object, baseUrl: String): Unit = js.native
  
  /**
    * Sets the root module/view for the application.
    * @param {string} root The root view or module.
    * @param {string} [transition] The transition to use from the previous root (or splash screen) into the new root.
    * @param {string} [applicationHost] The application host element id. By default the id 'applicationHost' will be used.
    */
  def setRoot(root: js.Any): Unit = js.native
  def setRoot(root: js.Any, transition: js.UndefOr[scala.Nothing], applicationHost: String): Unit = js.native
  def setRoot(root: js.Any, transition: js.UndefOr[scala.Nothing], applicationHost: HTMLElement): Unit = js.native
  def setRoot(root: js.Any, transition: String): Unit = js.native
  def setRoot(root: js.Any, transition: String, applicationHost: String): Unit = js.native
  def setRoot(root: js.Any, transition: String, applicationHost: HTMLElement): Unit = js.native
  
  /**
    * Shows a dialog via the dialog plugin.
    * @param {object|string} obj The object (or moduleId) to display as a dialog.
    * @param {object} [activationData] The data that should be passed to the object upon activation.
    * @param {string} [context] The name of the dialog context to use. Uses the default context if none is specified.
    * @returns {Promise} A promise that resolves when the dialog is closed and returns any data passed at the time of closing.
    */
  def showDialog(obj: js.Any): DurandalPromise[_] = js.native
  def showDialog(obj: js.Any, activationData: js.UndefOr[scala.Nothing], context: String): DurandalPromise[_] = js.native
  def showDialog(obj: js.Any, activationData: js.Any): DurandalPromise[_] = js.native
  def showDialog(obj: js.Any, activationData: js.Any, context: String): DurandalPromise[_] = js.native
  
  /**
    * Shows a message box via the dialog plugin.
    * @param {string} message The message to display in the dialog.
    * @param {string} [title] The title message.
    * @param {string[]} [options] The options to provide to the user.
    * @param {boolean} [autoclose] Automatically close the the message box when clicking outside?
    * @param {Object} [settings] Custom settings for this instance of the messsage box, used to change classes and styles.
    * @returns {Promise} A promise that resolves when the message box is closed and returns the selected option.
    */
  /**
    * Shows a message box.
    * @param {string} message The message to display in the dialog.
    * @param {string} [title] The title message.
    * @param {DialogButton[]} [options] The options to provide to the user.
    * @param {boolean} [autoclose] Automatically close the the message box when clicking outside?
    * @param {Object} [settings] Custom settings for this instance of the messsage box, used to change classes and styles.
    * @returns {Promise} A promise that resolves when the message box is closed and returns the selected option.
    */
  def showMessage(message: String): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(message: String, title: js.UndefOr[scala.Nothing], options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String, options: js.UndefOr[scala.Nothing], autoclose: Boolean): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = js.native
  def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  
  /**
    * Starts the application.
    * @returns {promise}
    */
  def start(): DurandalPromise[_] = js.native
  
  /**
    * The title of your application.
    */
  var title: String = js.native
}
