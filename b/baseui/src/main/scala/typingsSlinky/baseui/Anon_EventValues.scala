package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValues extends js.Object {
  var event: FormEvent[HTMLInputElement]
  var values: js.Array[String]
}

object Anon_EventValues {
  @scala.inline
  def apply(event: FormEvent[HTMLInputElement], values: js.Array[String]): Anon_EventValues = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventValues]
  }
}

