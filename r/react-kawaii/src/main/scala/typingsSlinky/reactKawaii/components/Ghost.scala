package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ghost {
  
  @JSImport("react-kawaii", "Ghost")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ghost.type): SharedBuilder_KawaiiProps1805116402 = new SharedBuilder_KawaiiProps1805116402(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps1805116402 = new SharedBuilder_KawaiiProps1805116402(js.Array(this.component, p.asInstanceOf[js.Any]))
}
