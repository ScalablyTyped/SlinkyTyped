package typingsSlinky.recurlyRecurlyJs.elementsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardElement extends Emitter[ElementEvent] {
  
  def attach(el: String): CardElement = js.native
  def attach(el: HTMLElement): CardElement = js.native
  @JSName("attach")
  var attach_Original: Attach[CardElement] = js.native
  
  def configure(options: CardElementOptions): CardElement = js.native
  
  def remove(): CardElement = js.native
}
