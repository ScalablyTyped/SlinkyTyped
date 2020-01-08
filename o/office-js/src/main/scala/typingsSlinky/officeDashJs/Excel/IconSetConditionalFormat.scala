package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.Anon_Expand
import typingsSlinky.officeDashJs.Excel.Interfaces.IconSetConditionalFormatData
import typingsSlinky.officeDashJs.Excel.Interfaces.IconSetConditionalFormatLoadOptions
import typingsSlinky.officeDashJs.Excel.Interfaces.IconSetConditionalFormatUpdateData
import typingsSlinky.officeDashJs.OfficeExtension.ClientObject
import typingsSlinky.officeDashJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveBoxes
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveQuarters
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveRating
import typingsSlinky.officeDashJs.officeDashJsStrings.FourArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.FourArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.FourRating
import typingsSlinky.officeDashJs.officeDashJsStrings.FourRedToBlack
import typingsSlinky.officeDashJs.officeDashJsStrings.FourTrafficLights
import typingsSlinky.officeDashJs.officeDashJsStrings.Invalid
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeFlags
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSigns
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeStars
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSymbols
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSymbols2
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTrafficLights1
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTrafficLights2
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.IconSetConditionalFormat")
@js.native
class IconSetConditionalFormat () extends ClientObject {
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
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: Boolean = js.native
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): IconSetConditionalFormat = js.native
  def load(options: IconSetConditionalFormatLoadOptions): IconSetConditionalFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): IconSetConditionalFormat = js.native
  def load(propertyNames: String): IconSetConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): IconSetConditionalFormat = js.native
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
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.IconSetConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.IconSetConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): IconSetConditionalFormatData = js.native
}

