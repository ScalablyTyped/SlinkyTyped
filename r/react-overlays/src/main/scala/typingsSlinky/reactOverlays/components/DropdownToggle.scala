package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactOverlays.anon.UseDropdownToggleHelperspProps
import typingsSlinky.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownToggle {
  
  @scala.inline
  def apply(children: UseDropdownToggleHelperspProps => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
  }
  
  @JSImport("react-overlays/esm/DropdownToggle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownToggleProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
