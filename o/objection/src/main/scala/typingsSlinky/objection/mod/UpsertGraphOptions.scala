package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertGraphOptions extends js.Object {
  var insertMissing: js.UndefOr[Boolean | js.Array[String]] = js.native
  var noDelete: js.UndefOr[Boolean | js.Array[String]] = js.native
  var noInsert: js.UndefOr[Boolean | js.Array[String]] = js.native
  var noRelate: js.UndefOr[Boolean | js.Array[String]] = js.native
  var noUnrelate: js.UndefOr[Boolean | js.Array[String]] = js.native
  var noUpdate: js.UndefOr[Boolean | js.Array[String]] = js.native
  var relate: js.UndefOr[Boolean | js.Array[String]] = js.native
  var unrelate: js.UndefOr[Boolean | js.Array[String]] = js.native
  var update: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object UpsertGraphOptions {
  @scala.inline
  def apply(): UpsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpsertGraphOptions]
  }
  @scala.inline
  implicit class UpsertGraphOptionsOps[Self <: UpsertGraphOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertMissing(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDelete(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInsert(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRelate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRelate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRelate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRelate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUnrelate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnrelate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUnrelate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnrelate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRelate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relate")(js.undefined)
        ret
    }
    @scala.inline
    def withUnrelate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrelate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnrelate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrelate")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

