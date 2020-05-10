package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exponential extends js.Object {
  /** Must be greater than 1. */
  var growthFactor: js.UndefOr[Double] = js.native
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /** Must be greater than 0. */
  var scale: js.UndefOr[Double] = js.native
}

object Exponential {
  @scala.inline
  def apply(): Exponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponential]
  }
  @scala.inline
  implicit class ExponentialOps[Self <: Exponential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrowthFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growthFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowthFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growthFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFiniteBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFiniteBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

