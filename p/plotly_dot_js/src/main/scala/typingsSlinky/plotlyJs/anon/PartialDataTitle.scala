package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.DataTitle> */
@js.native
trait PartialDataTitle extends StObject {
  
  var font: js.UndefOr[Partial[typingsSlinky.plotlyJs.mod.Font]] = js.native
  
  var position: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.native
  
  var standoff: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PartialDataTitle {
  
  @scala.inline
  def apply(): PartialDataTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataTitle]
  }
  
  @scala.inline
  implicit class PartialDataTitleMutableBuilder[Self <: PartialDataTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Partial[typingsSlinky.plotlyJs.mod.Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPosition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStandoff(value: Double): Self = StObject.set(x, "standoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandoffUndefined: Self = StObject.set(x, "standoff", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
