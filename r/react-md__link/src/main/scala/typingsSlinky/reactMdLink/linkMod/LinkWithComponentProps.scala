package typingsSlinky.reactMdLink.linkMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkWithComponentProps
  extends LinkProps
     with /**
  * I'm not really sure of a good way to implement this, but when the
  * `component` prop is provided, all valid props from that component should
  * also be allowed.
  */
/* key */ StringDictionary[js.Any] {
  
  @JSName("component")
  var component_LinkWithComponentProps: ReactElement = js.native
}
object LinkWithComponentProps {
  
  @scala.inline
  def apply(component: ReactElement): LinkWithComponentProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkWithComponentProps]
  }
  
  @scala.inline
  implicit class LinkWithComponentPropsOps[Self <: LinkWithComponentProps] (val x: Self) extends AnyVal {
    
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
