package typingsSlinky.reactHelmetWithVisor.components

import typingsSlinky.reactHelmetWithVisor.mod.HelmetProps
import typingsSlinky.reactHelmetWithVisor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHelmetWithVisor {
  @JSImport("react-helmet-with-visor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps143995958[default] = new SharedBuilder_HelmetProps143995958[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactHelmetWithVisor.type): SharedBuilder_HelmetProps143995958[default] = new SharedBuilder_HelmetProps143995958[default](js.Array(this.component, js.Dictionary.empty))()
}

