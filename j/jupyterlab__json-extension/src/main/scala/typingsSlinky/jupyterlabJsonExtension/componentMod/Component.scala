package typingsSlinky.jupyterlabJsonExtension.componentMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typingsSlinky.react.mod.Component[IProps, IState, js.Any] {
  var timer: Double = js.native
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
}

