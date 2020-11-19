package typingsSlinky.reactMdList.listItemLinkMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemLinkWithComponentProps
  extends ListItemLinkProps
     with /**
  * I'm not really sure of a good way to implement this, but when the
  * `component` prop is provided, all valid props from that component should
  * also be allowed.
  */
/* key */ StringDictionary[js.Any] {
  
  @JSName("component")
  var component_ListItemLinkWithComponentProps: ReactElement = js.native
}
object ListItemLinkWithComponentProps {
  
  @scala.inline
  def apply(component: ReactElement): ListItemLinkWithComponentProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemLinkWithComponentProps]
  }
  
  @scala.inline
  implicit class ListItemLinkWithComponentPropsOps[Self <: ListItemLinkWithComponentProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
  }
}
