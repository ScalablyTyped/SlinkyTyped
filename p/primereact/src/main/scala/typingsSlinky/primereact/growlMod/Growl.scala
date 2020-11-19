package typingsSlinky.primereact.growlMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/components/growl/Growl", "Growl")
@js.native
class Growl ()
  extends Component[GrowlProps, js.Any, js.Any] {
  
  def clear(): Unit = js.native
  
  def show(message: js.Array[GrowlMessage]): Unit = js.native
  def show(message: GrowlMessage): Unit = js.native
}
