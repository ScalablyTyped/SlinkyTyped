package typingsSlinky.blueprintjsCore.nonIdealStateMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INonIdealStateProps extends IProps {
  
  /** An action to resolve the non-ideal state which appears after `description`. */
  var action: js.UndefOr[ReactElement] = js.native
  
  /**
    * Advanced usage: React `children` will appear last (after `action`).
    * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * A longer description of the non-ideal state.
    * A string or number value will be wrapped in a `<div>` to preserve margins.
    */
  var description: js.UndefOr[ReactChild] = js.native
  
  /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /** The title of the non-ideal state. */
  var title: js.UndefOr[ReactElement] = js.native
}
object INonIdealStateProps {
  
  @scala.inline
  def apply(): INonIdealStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INonIdealStateProps]
  }
  
  @scala.inline
  implicit class INonIdealStatePropsOps[Self <: INonIdealStateProps] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDescriptionReactElement(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactChild): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
