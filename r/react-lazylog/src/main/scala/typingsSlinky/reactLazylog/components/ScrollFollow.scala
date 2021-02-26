package typingsSlinky.reactLazylog.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLazylog.scrollFollowMod.ScrollFollowProps
import typingsSlinky.reactLazylog.scrollFollowMod.ScrollFollowRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollFollow {
  
  @scala.inline
  def apply(render: ScrollFollowRenderProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollFollowProps]))
  }
  
  @JSImport("react-lazylog", "ScrollFollow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLazylog.mod.ScrollFollow] {
    
    @scala.inline
    def startFollowing(value: Boolean): this.type = set("startFollowing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollFollowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
