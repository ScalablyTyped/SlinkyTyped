package typingsSlinky.atJupyterlabJsonDashExtension.libComponentMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typingsSlinky.react.reactMod.Component[IProps, IState, js.Any] {
  var timer: Double = js.native
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
}

