package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.ModifiersNumber
import typingsSlinky.reactOnsenui.mod.ModifiersString
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`180`
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`270`
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   icon :string | react-onsenui.react-onsenui.Modifiers_string | undefined,   size :number | react-onsenui.react-onsenui.Modifiers_number | undefined,   rotate :90 | 180 | 270 | undefined,   fixedWidth :boolean | undefined,   spin :boolean | undefined,   title :string | undefined} */
@js.native
trait HTMLAttributesidclassNameFixedWidth extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var fixedWidth: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String | ModifiersString] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.native
  
  var size: js.UndefOr[Double | ModifiersNumber] = js.native
  
  var spin: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object HTMLAttributesidclassNameFixedWidth {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameFixedWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameFixedWidth]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameFixedWidthOps[Self <: HTMLAttributesidclassNameFixedWidth] (val x: Self) extends AnyVal {
    
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
    def setFixedWidth(value: Boolean): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    
    @scala.inline
    def setIcon(value: String | ModifiersString): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setRotate(value: `90` | `180` | `270`): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setSize(value: Double | ModifiersNumber): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
