package typingsSlinky.rcInputNumber.components

import typingsSlinky.rcInputNumber.anon.PartialInputNumberProps
import typingsSlinky.rcInputNumber.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcInputNumber {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcInputNumber.type): SharedBuilder_PartialInputNumberProps681923691[default] = new SharedBuilder_PartialInputNumberProps681923691[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialInputNumberProps): SharedBuilder_PartialInputNumberProps681923691[default] = new SharedBuilder_PartialInputNumberProps681923691[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
