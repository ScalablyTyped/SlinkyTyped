package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adaptive extends js.Object {
  /**
    * A constant indicating the measurement system is adaptive, and determined
    * based on the map's language.
    */
  val Adaptive: String = js.native
  /**
    * A constant indicating the measurement system is imperial.
    */
  val Imperial: String = js.native
  /**
    * A constant indicating the measurement system is metric.
    */
  val Metric: String = js.native
}

object Adaptive {
  @scala.inline
  def apply(Adaptive: String, Imperial: String, Metric: String): Adaptive = {
    val __obj = js.Dynamic.literal(Adaptive = Adaptive.asInstanceOf[js.Any], Imperial = Imperial.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  @scala.inline
  implicit class AdaptiveOps[Self <: Adaptive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adaptive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImperial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Imperial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

