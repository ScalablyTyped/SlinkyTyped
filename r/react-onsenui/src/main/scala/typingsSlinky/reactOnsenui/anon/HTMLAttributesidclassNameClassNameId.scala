package typingsSlinky.reactOnsenui.anon

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   onClick :react.react.MouseEventHandler<any> | undefined} */
@js.native
trait HTMLAttributesidclassNameClassNameId extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object HTMLAttributesidclassNameClassNameId {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameClassNameId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameClassNameId]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameClassNameIdOps[Self <: HTMLAttributesidclassNameClassNameId] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[_] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
