package typingsSlinky.materialUi.MaterialUI.Popover

import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverAnimationDefaultProps extends PopoverAnimationProps {
  
  var className: js.UndefOr[String] = js.native
  
  var targetOrigin: js.UndefOr[origin] = js.native
  
  var zDepth: js.UndefOr[Double] = js.native
}
object PopoverAnimationDefaultProps {
  
  @scala.inline
  def apply(open: Boolean): PopoverAnimationDefaultProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverAnimationDefaultProps]
  }
  
  @scala.inline
  implicit class PopoverAnimationDefaultPropsOps[Self <: PopoverAnimationDefaultProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setTargetOrigin(value: origin): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = this.set("zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDepth: Self = this.set("zDepth", js.undefined)
  }
}
