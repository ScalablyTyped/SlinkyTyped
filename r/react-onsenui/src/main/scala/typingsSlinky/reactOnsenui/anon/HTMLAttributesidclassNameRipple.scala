package typingsSlinky.reactOnsenui.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   disabled :boolean | undefined,   ripple :boolean | undefined,   name :string | undefined,   onClick :(e : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent> | undefined): void | undefined} */
@js.native
trait HTMLAttributesidclassNameRipple extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
  
  var ripple: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object HTMLAttributesidclassNameRipple {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameRipple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameRipple]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameRippleOps[Self <: HTMLAttributesidclassNameRipple] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
