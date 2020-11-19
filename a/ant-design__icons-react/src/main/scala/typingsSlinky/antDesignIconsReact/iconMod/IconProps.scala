package typingsSlinky.antDesignIconsReact.iconMod

import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var focusable: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var secondaryColor: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any) = js.native
}
object IconProps {
  
  @scala.inline
  def apply(
    `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFocusable(value: String): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryColor: Self = this.set("secondaryColor", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
