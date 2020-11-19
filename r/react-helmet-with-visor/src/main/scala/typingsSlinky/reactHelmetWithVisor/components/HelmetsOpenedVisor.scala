package typingsSlinky.reactHelmetWithVisor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HelmetsOpenedVisor {
  
  @JSImport("react-helmet-with-visor", "HelmetsOpenedVisor")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactHelmetWithVisor.mod.HelmetsOpenedVisor] = new Default[tag.type, typingsSlinky.reactHelmetWithVisor.mod.HelmetsOpenedVisor](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: HelmetsOpenedVisor.type): Default[tag.type, typingsSlinky.reactHelmetWithVisor.mod.HelmetsOpenedVisor] = new Default[tag.type, typingsSlinky.reactHelmetWithVisor.mod.HelmetsOpenedVisor](js.Array(this.component, js.Dictionary.empty))()
}
