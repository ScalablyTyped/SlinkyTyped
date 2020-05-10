package typingsSlinky.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractIteratorOptions[K] extends AbstractOptions {
  var gt: js.UndefOr[K] = js.native
  var gte: js.UndefOr[K] = js.native
  var keyAsBuffer: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var lt: js.UndefOr[K] = js.native
  var lte: js.UndefOr[K] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var valueAsBuffer: js.UndefOr[Boolean] = js.native
  var values: js.UndefOr[Boolean] = js.native
}

object AbstractIteratorOptions {
  @scala.inline
  def apply[K](): AbstractIteratorOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractIteratorOptions[K]]
  }
  @scala.inline
  implicit class AbstractIteratorOptionsOps[Self[k] <: AbstractIteratorOptions[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withGt(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGt: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.undefined)
        ret
    }
    @scala.inline
    def withGte(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGte: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyAsBuffer(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAsBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAsBuffer: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAsBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLt(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLt: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.undefined)
        ret
    }
    @scala.inline
    def withLte(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLte: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAsBuffer(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAsBuffer: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

