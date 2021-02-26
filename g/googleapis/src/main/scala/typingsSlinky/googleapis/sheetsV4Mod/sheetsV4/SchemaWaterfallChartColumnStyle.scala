package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles for a waterfall chart column.
  */
@js.native
trait SchemaWaterfallChartColumnStyle extends StObject {
  
  /**
    * The color of the column.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The label of the column&#39;s legend.
    */
  var label: js.UndefOr[String] = js.native
}
object SchemaWaterfallChartColumnStyle {
  
  @scala.inline
  def apply(): SchemaWaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartColumnStyle]
  }
  
  @scala.inline
  implicit class SchemaWaterfallChartColumnStyleMutableBuilder[Self <: SchemaWaterfallChartColumnStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
