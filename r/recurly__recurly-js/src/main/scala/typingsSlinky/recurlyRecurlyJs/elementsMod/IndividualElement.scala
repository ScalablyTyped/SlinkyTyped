package typingsSlinky.recurlyRecurlyJs.elementsMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndividualElement extends Emitter[ElementEvent] {
  
  def attach(el: String): IndividualElement = js.native
  def attach(el: HTMLElement): IndividualElement = js.native
  @JSName("attach")
  var attach_Original: Attach[IndividualElement] = js.native
  
  def configure(options: IndividualElementOptions): Element = js.native
  
  def remove(): Element = js.native
}
