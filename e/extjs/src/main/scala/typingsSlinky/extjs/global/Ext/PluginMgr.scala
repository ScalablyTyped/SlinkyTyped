package typingsSlinky.extjs.global.Ext

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IClass
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.util.IHashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.PluginMgr")
@js.native
class PluginMgr ()
  extends typingsSlinky.extjs.Ext.PluginMgr
/* static members */
@JSGlobal("Ext.PluginMgr")
@js.native
object PluginMgr extends js.Object {
  
  /** [Property] (Ext.util.HashMap) */
  var all: IHashMap = js.native
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new Plugin from the specified config object using the config object s ptype to determine the class to insta
    * @param config Object A configuration object for the Plugin you wish to create.
    * @param defaultType Function The constructor to provide the default Plugin type if the config object does not contain a ptype. (Optional if the config contains a ptype).
    * @returns Ext.Component The newly instantiated Plugin.
    */
  def create(): IComponent = js.native
  def create(config: js.UndefOr[scala.Nothing], defaultType: js.Any): IComponent = js.native
  def create(config: js.Any): IComponent = js.native
  def create(config: js.Any, defaultType: js.Any): IComponent = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  def each(): Unit = js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def each(fn: js.Any): Unit = js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns all plugins registered with the given type
    * @param type String The type to search for
    * @param defaultsOnly Boolean True to only return plugins of this type where the plugin's isDefault property is truthy
    * @returns Ext.AbstractPlugin[] All matching plugins
    */
  def findByType(): typingsSlinky.extjs.Ext.Array = js.native
  def findByType(`type`: js.UndefOr[scala.Nothing], defaultsOnly: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  def findByType(`type`: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  def findByType(`type`: java.lang.String, defaultsOnly: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  def get(): js.Any = js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  def getCount(): Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  def isRegistered(): Boolean = js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  def onAvailable(): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  def register(): Unit = js.native
  def register(item: js.Any): Unit = js.native
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type String The mnemonic string by which the class may be looked up.
    * @param cls Function The new instance class.
    */
  def registerType(): Unit = js.native
  def registerType(`type`: js.UndefOr[scala.Nothing], cls: js.Any): Unit = js.native
  def registerType(`type`: java.lang.String): Unit = js.native
  def registerType(`type`: java.lang.String, cls: js.Any): Unit = js.native
  
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  def unregister(): Unit = js.native
  def unregister(item: js.Any): Unit = js.native
}
