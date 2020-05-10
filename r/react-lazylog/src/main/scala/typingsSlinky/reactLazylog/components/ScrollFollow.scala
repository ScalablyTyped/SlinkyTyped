package typingsSlinky.reactLazylog.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLazylog.scrollFollowMod.ScrollFollowProps
import typingsSlinky.reactLazylog.scrollFollowMod.ScrollFollowRenderProps
import typingsSlinky.reactLazylog.scrollFollowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollFollow {
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def startFollowing(value: Boolean): this.type = set("startFollowing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollFollowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: ScrollFollowRenderProps => TagMod[Any]): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollFollowProps]))
  }
}

