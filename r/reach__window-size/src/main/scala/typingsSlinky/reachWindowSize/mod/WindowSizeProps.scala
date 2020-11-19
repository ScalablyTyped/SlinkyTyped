package typingsSlinky.reachWindowSize.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reachWindowSize.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSizeProps extends js.Object {
  
  def children(size: Height): ReactElement = js.native
}
object WindowSizeProps {
  
  @scala.inline
  def apply(children: Height => ReactElement): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WindowSizeProps]
  }
  
  @scala.inline
  implicit class WindowSizePropsOps[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Height => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
