package typingsSlinky.highcharts.highstockMod

import typingsSlinky.highcharts.mod.ObjectEachCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highstock", "objectEach")
@js.native
object objectEach extends js.Object {
  def apply[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def apply[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
}

