package typingsSlinky.extjs.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISizePolicy extends js.Object {
  /** [Property] (Boolean) */
  var readsHeight: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var readsWidth: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var setsHeight: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var setsWidth: js.UndefOr[Boolean] = js.native
}

object ISizePolicy {
  @scala.inline
  def apply(): ISizePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizePolicy]
  }
  @scala.inline
  implicit class ISizePolicyOps[Self <: ISizePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadsHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readsHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadsHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readsHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withReadsWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadsWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readsWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetsHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setsHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetsHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setsHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetsWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetsWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setsWidth")(js.undefined)
        ret
    }
  }
  
}

