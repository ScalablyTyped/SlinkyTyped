package typingsSlinky.j5IoTypes.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseModule extends js.Object {
  def getActivePeripheral(pin: Double): js.UndefOr[IPeripheral] = js.native
  def getActivePeripherals(): NumberDictionary[IPeripheral] = js.native
  def getPinNumber(alias: String): Double | Null = js.native
  def getPinNumber(alias: Double): Double | Null = js.native
  def init(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def setActivePeripheral(pin: Double, peripheral: IPeripheral): Unit = js.native
}

