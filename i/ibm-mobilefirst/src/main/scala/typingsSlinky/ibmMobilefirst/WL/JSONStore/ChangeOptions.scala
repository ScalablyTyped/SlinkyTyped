package typingsSlinky.ibmMobilefirst.WL.JSONStore

import typingsSlinky.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeOptions extends Options {
  var addNew: js.UndefOr[Boolean] = js.native
  var markDirty: js.UndefOr[Boolean] = js.native
  var replaceCriteria: js.UndefOr[js.Array[String]] = js.native
}

object ChangeOptions {
  @scala.inline
  def apply(): ChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeOptions]
  }
  @scala.inline
  implicit class ChangeOptionsOps[Self <: ChangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNew")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceCriteria(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCriteria")(js.undefined)
        ret
    }
  }
  
}

