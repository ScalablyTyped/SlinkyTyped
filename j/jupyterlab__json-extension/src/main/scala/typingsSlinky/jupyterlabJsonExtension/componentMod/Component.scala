package typingsSlinky.jupyterlabJsonExtension.componentMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typingsSlinky.react.mod.Component[IProps, IState, js.Any] {
  
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  var timer: Double = js.native
}
