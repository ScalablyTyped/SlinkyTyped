package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.autoLockScrollingMod.AutoLockScrollingProps
import typingsSlinky.materialUi.autoLockScrollingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoLockScrolling {
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: AutoLockScrollingProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(lock: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[AutoLockScrollingProps]))
  }
}

