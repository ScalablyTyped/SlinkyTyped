package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesTitleOptions extends StObject {
  
  var reserveSpace: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
}
object ChartParallelAxesTitleOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesTitleOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesTitleOptionsMutableBuilder[Self <: ChartParallelAxesTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
