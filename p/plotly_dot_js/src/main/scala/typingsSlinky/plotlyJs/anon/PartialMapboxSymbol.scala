package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`line-center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.point
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.MapboxSymbol> */
@js.native
trait PartialMapboxSymbol extends js.Object {
  
  var icon: js.UndefOr[String] = js.native
  
  var iconsize: js.UndefOr[Double] = js.native
  
  var placement: js.UndefOr[point | line | `line-center`] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textfont: js.UndefOr[Partial[typingsSlinky.plotlyJs.mod.Font]] = js.native
  
  var textposition: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.native
}
object PartialMapboxSymbol {
  
  @scala.inline
  def apply(): PartialMapboxSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxSymbol]
  }
  
  @scala.inline
  implicit class PartialMapboxSymbolOps[Self <: PartialMapboxSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconsize(value: Double): Self = this.set("iconsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconsize: Self = this.set("iconsize", js.undefined)
    
    @scala.inline
    def setPlacement(value: point | line | `line-center`): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextfont(value: Partial[typingsSlinky.plotlyJs.mod.Font]): Self = this.set("textfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextfont: Self = this.set("textfont", js.undefined)
    
    @scala.inline
    def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = this.set("textposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextposition: Self = this.set("textposition", js.undefined)
  }
}
