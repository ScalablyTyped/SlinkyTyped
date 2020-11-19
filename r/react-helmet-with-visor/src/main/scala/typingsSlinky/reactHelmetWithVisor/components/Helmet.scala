package typingsSlinky.reactHelmetWithVisor.components

import typingsSlinky.reactHelmetWithVisor.mod.HelmetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helmet {
  
  @JSImport("react-helmet-with-visor", "Helmet")
  @js.native
  object component extends js.Object
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps143995958[typingsSlinky.reactHelmetWithVisor.mod.Helmet] = new SharedBuilder_HelmetProps143995958[typingsSlinky.reactHelmetWithVisor.mod.Helmet](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Helmet.type): SharedBuilder_HelmetProps143995958[typingsSlinky.reactHelmetWithVisor.mod.Helmet] = new SharedBuilder_HelmetProps143995958[typingsSlinky.reactHelmetWithVisor.mod.Helmet](js.Array(this.component, js.Dictionary.empty))()
}
