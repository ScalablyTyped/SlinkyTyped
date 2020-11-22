package typingsSlinky.materialUiSystem.anon

import typingsSlinky.materialUiSystem.materialUiSystemStrings.theme
import typingsSlinky.materialUiSystem.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css[Props] extends js.Object {
  
  var css: Omit[Props, theme] = js.native
}
object Css {
  
  @scala.inline
  def apply[Props](css: Omit[Props, theme]): Css[Props] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css[Props]]
  }
  
  @scala.inline
  implicit class CssOps[Self <: Css[_], Props] (val x: Self with Css[Props]) extends AnyVal {
    
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
    def setCss(value: Omit[Props, theme]): Self = this.set("css", value.asInstanceOf[js.Any])
  }
}
