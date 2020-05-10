package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.active
import typingsSlinky.lokijs.lokijsStrings.passive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.DynamicViewOptions> */
@js.native
trait PartialDynamicViewOptions extends js.Object {
  var minRebuildInterval: js.UndefOr[Double] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var sortPriority: js.UndefOr[active | passive] = js.native
}

object PartialDynamicViewOptions {
  @scala.inline
  def apply(): PartialDynamicViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicViewOptions]
  }
  @scala.inline
  implicit class PartialDynamicViewOptionsOps[Self <: PartialDynamicViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinRebuildInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRebuildInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRebuildInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRebuildInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
    @scala.inline
    def withSortPriority(value: active | passive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortPriority")(js.undefined)
        ret
    }
  }
  
}

