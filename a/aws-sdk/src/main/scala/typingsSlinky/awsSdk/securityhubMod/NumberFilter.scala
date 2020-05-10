package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilter extends js.Object {
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.native
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.native
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.native
}

object NumberFilter {
  @scala.inline
  def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilter]
  }
  @scala.inline
  implicit class NumberFilterOps[Self <: NumberFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eq")(js.undefined)
        ret
    }
    @scala.inline
    def withGte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gte")(js.undefined)
        ret
    }
    @scala.inline
    def withLte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lte")(js.undefined)
        ret
    }
  }
  
}

