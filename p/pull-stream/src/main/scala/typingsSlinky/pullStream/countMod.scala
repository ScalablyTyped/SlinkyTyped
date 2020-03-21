package typingsSlinky.pullStream

import typingsSlinky.pullStream.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/count", JSImport.Namespace)
@js.native
object countMod extends js.Object {
  /**
    * Create a stream that outputs 0 ... `max`. By default, `max` = `Infinity`.
    */
  def apply(): Source[Double] = js.native
  def apply(max: Double): Source[Double] = js.native
  def apply(max: Double, onAbort: js.Function1[/* err */ js.UndefOr[js.Error | Null], _]): Source[Double] = js.native
}

