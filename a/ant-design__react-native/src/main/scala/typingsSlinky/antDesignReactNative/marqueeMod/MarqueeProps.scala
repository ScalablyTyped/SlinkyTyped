package typingsSlinky.antDesignReactNative.marqueeMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarqueeProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var fps: js.UndefOr[Double] = js.native
  
  var leading: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var text: js.UndefOr[ReactElement] = js.native
  
  var trailing: js.UndefOr[Double] = js.native
}
object MarqueeProps {
  
  @scala.inline
  def apply(): MarqueeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarqueeProps]
  }
  
  @scala.inline
  implicit class MarqueePropsOps[Self <: MarqueeProps] (val x: Self) extends AnyVal {
    
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
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTextReactElement(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTrailing(value: Double): Self = this.set("trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
  }
}
