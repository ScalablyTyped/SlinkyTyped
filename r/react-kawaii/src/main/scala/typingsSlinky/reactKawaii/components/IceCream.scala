package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IceCream {
  
  @JSImport("react-kawaii", "IceCream")
  @js.native
  object component extends js.Object
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps1805116402 = new SharedBuilder_KawaiiProps1805116402(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IceCream.type): SharedBuilder_KawaiiProps1805116402 = new SharedBuilder_KawaiiProps1805116402(js.Array(this.component, js.Dictionary.empty))()
}
