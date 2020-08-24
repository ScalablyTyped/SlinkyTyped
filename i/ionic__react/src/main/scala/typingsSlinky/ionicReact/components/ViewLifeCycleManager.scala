package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ionicReact.viewLifeCycleManagerMod.ViewTransitionManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ViewLifeCycleManager {
  @JSImport("@ionic/react", "ViewLifeCycleManager")
  @js.native
  object component extends js.Object
  
  def withProps(p: ViewTransitionManagerProps): Default[tag.type, typingsSlinky.ionicReact.mod.ViewLifeCycleManager] = new Default[tag.type, typingsSlinky.ionicReact.mod.ViewLifeCycleManager](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(mount: Boolean, removeView: () => Unit): Default[tag.type, typingsSlinky.ionicReact.mod.ViewLifeCycleManager] = {
    val __props = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], removeView = js.Any.fromFunction0(removeView))
    new Default[tag.type, typingsSlinky.ionicReact.mod.ViewLifeCycleManager](js.Array(this.component, __props.asInstanceOf[ViewTransitionManagerProps]))
  }
}

