package typingsSlinky.fnandoSparkline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptionsFetch[TEntry] extends SparklineNonNativeOptions[TEntry] {
  /**
    * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
    */
  def fetch(entry: TEntry): Double = js.native
}

object SparklineOptionsFetch {
  @scala.inline
  def apply[TEntry](fetch: TEntry => Double): SparklineOptionsFetch[TEntry] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
  }
  @scala.inline
  implicit class SparklineOptionsFetchOps[Self[tentry] <: SparklineOptionsFetch[tentry], TEntry] (val x: Self[TEntry]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntry] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntry]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntry] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntry] with Other]
    @scala.inline
    def withFetch(value: TEntry => Double): Self[TEntry] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

