package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Ghost {
  @JSImport("react-kawaii", "Ghost")
  @js.native
  object component extends js.Object
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Ghost] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Ghost](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Ghost.type): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Ghost] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Ghost](js.Array(this.component, js.Dictionary.empty))()
}

