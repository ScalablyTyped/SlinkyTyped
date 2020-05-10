package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Planet {
  @JSImport("react-kawaii", "Planet")
  @js.native
  object component extends js.Object
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Planet] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Planet](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Planet.type): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Planet] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.Planet](js.Array(this.component, js.Dictionary.empty))()
}

