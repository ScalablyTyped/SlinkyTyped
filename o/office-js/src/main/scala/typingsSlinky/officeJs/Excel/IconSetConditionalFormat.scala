package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.IconSetConditionalFormatData
import typingsSlinky.officeJs.Excel.Interfaces.IconSetConditionalFormatLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.IconSetConditionalFormatUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import typingsSlinky.officeJs.officeJsStrings.FiveArrows
import typingsSlinky.officeJs.officeJsStrings.FiveArrowsGray
import typingsSlinky.officeJs.officeJsStrings.FiveBoxes
import typingsSlinky.officeJs.officeJsStrings.FiveQuarters
import typingsSlinky.officeJs.officeJsStrings.FiveRating
import typingsSlinky.officeJs.officeJsStrings.FourArrows
import typingsSlinky.officeJs.officeJsStrings.FourArrowsGray
import typingsSlinky.officeJs.officeJsStrings.FourRating
import typingsSlinky.officeJs.officeJsStrings.FourRedToBlack
import typingsSlinky.officeJs.officeJsStrings.FourTrafficLights
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.ThreeArrows
import typingsSlinky.officeJs.officeJsStrings.ThreeArrowsGray
import typingsSlinky.officeJs.officeJsStrings.ThreeFlags
import typingsSlinky.officeJs.officeJsStrings.ThreeSigns
import typingsSlinky.officeJs.officeJsStrings.ThreeStars
import typingsSlinky.officeJs.officeJsStrings.ThreeSymbols
import typingsSlinky.officeJs.officeJsStrings.ThreeSymbols2
import typingsSlinky.officeJs.officeJsStrings.ThreeTrafficLights1
import typingsSlinky.officeJs.officeJsStrings.ThreeTrafficLights2
import typingsSlinky.officeJs.officeJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait IconSetConditionalFormat extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_IconSetConditionalFormat: RequestContext = js.native
  
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.Array[ConditionalIconCriterion] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): IconSetConditionalFormat = js.native
  def load(options: IconSetConditionalFormatLoadOptions): IconSetConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): IconSetConditionalFormat = js.native
  def load(propertyNames: String): IconSetConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): IconSetConditionalFormat = js.native
  
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: Boolean = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: IconSetConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.IconSetConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: IconSetConditionalFormatUpdateData): Unit = js.native
  def set(properties: IconSetConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: Boolean = js.native
  
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.IconSetConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.IconSetConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): IconSetConditionalFormatData = js.native
}
