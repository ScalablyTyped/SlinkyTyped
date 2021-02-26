package typingsSlinky.johnnyFive.mod

import typingsSlinky.johnnyFive.johnnyFiveStrings.change
import typingsSlinky.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Sonar")
@js.native
class Sonar protected () extends StObject {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: SonarOption) = this()
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  
  def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native
  def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native
}
