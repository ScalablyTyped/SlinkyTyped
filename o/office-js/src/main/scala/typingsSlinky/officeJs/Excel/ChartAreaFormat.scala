package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.ChartAreaFormatData
import typingsSlinky.officeJs.Excel.Interfaces.ChartAreaFormatLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.ChartAreaFormatUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import typingsSlinky.officeJs.officeJsStrings.ColorfulPalette1
import typingsSlinky.officeJs.officeJsStrings.ColorfulPalette2
import typingsSlinky.officeJs.officeJsStrings.ColorfulPalette3
import typingsSlinky.officeJs.officeJsStrings.ColorfulPalette4
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette1
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette10
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette11
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette12
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette13
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette2
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette3
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette4
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette5
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette6
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette7
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette8
import typingsSlinky.officeJs.officeJsStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the format properties for the overall chart area.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAreaFormat extends ClientObject {
  
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  val border: ChartBorder = js.native
  
  /**
    *
    * Specifies the color scheme of the chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13 = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAreaFormat: RequestContext = js.native
  
  /**
    *
    * Represents the fill format of an object, which includes background formatting information.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAreaFormat = js.native
  def load(options: ChartAreaFormatLoadOptions): ChartAreaFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartAreaFormat = js.native
  def load(propertyNames: String): ChartAreaFormat = js.native
  def load(propertyNames: js.Array[String]): ChartAreaFormat = js.native
  
  /**
    *
    * Specifies if the chart area of the chart has rounded corners.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: Boolean = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAreaFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAreaFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAreaFormatUpdateData): Unit = js.native
  def set(properties: ChartAreaFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAreaFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAreaFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAreaFormatData = js.native
}
