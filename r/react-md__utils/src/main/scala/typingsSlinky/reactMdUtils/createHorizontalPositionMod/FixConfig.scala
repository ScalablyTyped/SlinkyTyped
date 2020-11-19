package typingsSlinky.reactMdUtils.createHorizontalPositionMod

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.reactMdUtils.getCoordMod.XCoordConfig
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixConfig extends XCoordConfig {
  
  var disableSwapping: Boolean = js.native
  
  var screenRight: Double = js.native
  
  var vwMargin: Double = js.native
}
object FixConfig {
  
  @scala.inline
  def apply(
    containerRect: DOMRect | ClientRect,
    disableSwapping: Boolean,
    elWidth: Double,
    screenRight: Double,
    vwMargin: Double,
    xMargin: Double
  ): FixConfig = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], screenRight = screenRight.asInstanceOf[js.Any], vwMargin = vwMargin.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixConfig]
  }
  
  @scala.inline
  implicit class FixConfigOps[Self <: FixConfig] (val x: Self) extends AnyVal {
    
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
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenRight(value: Double): Self = this.set("screenRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVwMargin(value: Double): Self = this.set("vwMargin", value.asInstanceOf[js.Any])
  }
}
