package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the fill formatting for a chart element.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartFill extends ClientObject {
  
  /**
    * Clear the fill color of a chart element.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFill: RequestContext = js.native
  
  /**
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}
object ChartFill {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    context: RequestContext,
    isNullObject: Boolean,
    setSolidColor: String => Unit,
    toJSON: () => StringDictionary[String]
  ): ChartFill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any], setSolidColor = js.Any.fromFunction1(setSolidColor), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ChartFill]
  }
  
  @scala.inline
  implicit class ChartFillMutableBuilder[Self <: ChartFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSolidColor(value: String => Unit): Self = StObject.set(x, "setSolidColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
