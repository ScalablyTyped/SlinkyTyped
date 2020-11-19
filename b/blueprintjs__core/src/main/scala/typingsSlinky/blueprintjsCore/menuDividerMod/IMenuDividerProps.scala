package typingsSlinky.blueprintjsCore.menuDividerMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuDividerProps extends IProps {
  
  /** This component does not support children. */
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /** Optional header title. */
  var title: js.UndefOr[ReactElement] = js.native
}
object IMenuDividerProps {
  
  @scala.inline
  def apply(): IMenuDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuDividerProps]
  }
  
  @scala.inline
  implicit class IMenuDividerPropsOps[Self <: IMenuDividerProps] (val x: Self) extends AnyVal {
    
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
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
