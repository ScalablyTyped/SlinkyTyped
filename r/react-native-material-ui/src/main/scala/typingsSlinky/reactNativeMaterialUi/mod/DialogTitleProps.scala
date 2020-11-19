package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.TitleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogTitleProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var style: js.UndefOr[TitleContainer] = js.native
}
object DialogTitleProps {
  
  @scala.inline
  def apply(children: ReactElement): DialogTitleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
  
  @scala.inline
  implicit class DialogTitlePropsOps[Self <: DialogTitleProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: TitleContainer): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
