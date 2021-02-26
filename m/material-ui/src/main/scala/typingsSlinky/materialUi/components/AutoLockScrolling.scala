package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.autoLockScrollingMod.AutoLockScrollingProps
import typingsSlinky.materialUi.autoLockScrollingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoLockScrolling {
  
  @scala.inline
  def apply(lock: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[AutoLockScrollingProps]))
  }
  
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AutoLockScrollingProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
