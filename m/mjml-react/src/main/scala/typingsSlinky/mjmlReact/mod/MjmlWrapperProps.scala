package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BackgroundRepeatProperty
import typingsSlinky.csstype.mod.BackgroundSizeProperty
import typingsSlinky.csstype.mod.TextAlignProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlWrapperProps extends js.Object {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.native
  
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
  
  var backgroundUrl: js.UndefOr[String] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var textAlign: js.UndefOr[TextAlignProperty] = js.native
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.native
}
object MjmlWrapperProps {
  
  @scala.inline
  def apply(): MjmlWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlWrapperProps]
  }
  
  @scala.inline
  implicit class MjmlWrapperPropsOps[Self <: MjmlWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: BackgroundColorProperty): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundRepeat(value: BackgroundRepeatProperty): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSize(value: BackgroundSizeProperty[String | Double]): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundUrl(value: String): Self = this.set("backgroundUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundUrl: Self = this.set("backgroundUrl", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlignProperty): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
}
