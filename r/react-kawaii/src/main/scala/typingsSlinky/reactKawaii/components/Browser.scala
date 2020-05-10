package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Browser {
  @JSImport("react-kawaii", "Browser")
  @js.native
  object component extends js.Object
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Browser] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Browser](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Browser.type): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Browser] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Browser](js.Array(this.component, js.Dictionary.empty))()
}

