package typingsSlinky.extjs.global.Ext.util

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.util.Filter")
@js.native
class Filter ()
  extends typingsSlinky.extjs.Ext.util.Filter
/* static members */
@JSGlobal("Ext.util.Filter")
@js.native
object Filter extends js.Object {
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  def create(): js.Any = js.native
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  def createAlias(): Unit = js.native
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  
  /** [Method] Creates a single filter function which encapsulates the passed Filter array
    * @param filters Ext.util.Filter[] The filter set for which to create a filter function
    * @returns Function a function, which when passed a candidate object returns true if the candidate passes all the specified Filters.
    */
  def createFilterFn(): js.Any = js.native
  def createFilterFn(filters: Array): js.Any = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}
