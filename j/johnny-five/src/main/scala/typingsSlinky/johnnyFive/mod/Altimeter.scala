package typingsSlinky.johnnyFive.mod

import typingsSlinky.johnnyFive.johnnyFiveStrings.change
import typingsSlinky.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Altimeter")
@js.native
class Altimeter protected () extends StObject {
  def this(option: AltimeterOption) = this()
  
  val feet: Double = js.native
  
  var id: String = js.native
  
  val meters: Double = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}
