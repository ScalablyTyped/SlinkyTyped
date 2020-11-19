package typingsSlinky.extjs.global.Ext

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IClass
import typingsSlinky.extjs.Ext.fx.IAnim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.fx")
@js.native
object fx extends js.Object {
  
  @js.native
  class CubicBezier ()
    extends typingsSlinky.extjs.Ext.fx.CubicBezier
  /* static members */
  @js.native
  object CubicBezier extends js.Object {
    
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
    
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  @js.native
  class Easing ()
    extends typingsSlinky.extjs.Ext.fx.Easing
  
  @js.native
  class Manager ()
    extends typingsSlinky.extjs.Ext.fx.Manager
  /* static members */
  @js.native
  object Manager extends js.Object {
    
    /** [Method] Add an Anim to the manager
      * @param anim Ext.fx.Anim
      */
    def addAnim(): Unit = js.native
    def addAnim(anim: IAnim): Unit = js.native
    
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
    
    /** [Config Option] (Boolean) */
    var forceJS: Boolean = js.native
    
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
    
    /** [Config Option] (Number) */
    var interval: Double = js.native
    
    /** [Method] Remove an Anim from the manager
      * @param anim Ext.fx.Anim
      */
    def removeAnim(): Unit = js.native
    def removeAnim(anim: IAnim): Unit = js.native
    
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
}
