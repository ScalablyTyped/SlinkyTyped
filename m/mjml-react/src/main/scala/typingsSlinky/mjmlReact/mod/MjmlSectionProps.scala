package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.Property.BackgroundColor
import typingsSlinky.csstype.mod.Property.BackgroundRepeat
import typingsSlinky.csstype.mod.Property.BackgroundSize
import typingsSlinky.csstype.mod.Property.TextAlign
import typingsSlinky.csstype.mod.Property.VerticalAlign
import typingsSlinky.mjmlReact.mjmlReactStrings.ltr
import typingsSlinky.mjmlReact.mjmlReactStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlSectionProps extends js.Object {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.native
  
  var backgroundRepeat: js.UndefOr[BackgroundRepeat] = js.native
  
  var backgroundSize: js.UndefOr[BackgroundSize[String | Double]] = js.native
  
  var backgroundUrl: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var textAlign: js.UndefOr[TextAlign] = js.native
  
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.native
}
object MjmlSectionProps {
  
  @scala.inline
  def apply(): MjmlSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSectionProps]
  }
  
  @scala.inline
  implicit class MjmlSectionPropsOps[Self <: MjmlSectionProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: BackgroundColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundRepeat(value: BackgroundRepeat): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSize(value: BackgroundSize[String | Double]): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundUrl(value: String): Self = this.set("backgroundUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundUrl: Self = this.set("backgroundUrl", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlign[String | Double]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
}
