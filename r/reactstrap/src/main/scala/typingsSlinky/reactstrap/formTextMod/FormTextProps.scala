package typingsSlinky.reactstrap.formTextMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormTextProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[ReactElement] = js.native
}
object FormTextProps {
  
  @scala.inline
  def apply(): FormTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormTextProps]
  }
  
  @scala.inline
  implicit class FormTextPropsOps[Self <: FormTextProps] (val x: Self) extends AnyVal {
    
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setTagFunctionComponent(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagComponentClass(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: ReactElement): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
