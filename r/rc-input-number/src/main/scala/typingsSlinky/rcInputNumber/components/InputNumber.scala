package typingsSlinky.rcInputNumber.components

import typingsSlinky.rcInputNumber.anon.PartialInputNumberProps
import typingsSlinky.rcInputNumber.inputNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputNumber {
  @JSImport("rc-input-number/es/InputNumber", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PartialInputNumberProps): SharedBuilder_PartialInputNumberProps681923691[default] = new SharedBuilder_PartialInputNumberProps681923691[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InputNumber.type): SharedBuilder_PartialInputNumberProps681923691[default] = new SharedBuilder_PartialInputNumberProps681923691[default](js.Array(this.component, js.Dictionary.empty))()
}

