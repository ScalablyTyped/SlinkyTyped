package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-location", "Accuracy")
@js.native
object Accuracy extends js.Object {
  /* 3 */ val Balanced: typingsSlinky.expoLocation.mod.LocationAccuracy.Balanced with Double = js.native
  /* 6 */ val BestForNavigation: typingsSlinky.expoLocation.mod.LocationAccuracy.BestForNavigation with Double = js.native
  /* 4 */ val High: typingsSlinky.expoLocation.mod.LocationAccuracy.High with Double = js.native
  /* 5 */ val Highest: typingsSlinky.expoLocation.mod.LocationAccuracy.Highest with Double = js.native
  /* 2 */ val Low: typingsSlinky.expoLocation.mod.LocationAccuracy.Low with Double = js.native
  /* 1 */ val Lowest: typingsSlinky.expoLocation.mod.LocationAccuracy.Lowest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
}

