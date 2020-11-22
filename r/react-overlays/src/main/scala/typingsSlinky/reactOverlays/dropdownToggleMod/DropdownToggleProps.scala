package typingsSlinky.reactOverlays.dropdownToggleMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.anon.UseDropdownToggleHelpersp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownToggleProps extends js.Object {
  
  def children(args: UseDropdownToggleHelpersp): ReactElement = js.native
}
object DropdownToggleProps {
  
  @scala.inline
  def apply(children: UseDropdownToggleHelpersp => ReactElement): DropdownToggleProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownToggleProps]
  }
  
  @scala.inline
  implicit class DropdownTogglePropsOps[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: UseDropdownToggleHelpersp => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
