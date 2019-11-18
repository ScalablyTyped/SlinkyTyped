package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledName extends js.Object {
  var disabled: Boolean
  var name: String
  var onChange: ChangeEventHandler[HTMLInputElement]
  var value: js.Any
}

object Anon_DisabledName {
  @scala.inline
  def apply(disabled: Boolean, name: String, onChange: ChangeEvent[HTMLInputElement] => Unit, value: js.Any): Anon_DisabledName = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisabledName]
  }
}

