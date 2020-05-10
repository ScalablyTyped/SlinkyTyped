package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMaterializedViewOptions extends js.Object {
  var columns: js.UndefOr[String | js.Array[String]] = js.native
  var data: js.UndefOr[Boolean] = js.native
  var ifNotExists: js.UndefOr[Boolean] = js.native
  var storageParameters: js.UndefOr[js.Object] = js.native
  var tablespace: js.UndefOr[String] = js.native
}

object CreateMaterializedViewOptions {
  @scala.inline
  def apply(): CreateMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMaterializedViewOptions]
  }
  @scala.inline
  implicit class CreateMaterializedViewOptionsOps[Self <: CreateMaterializedViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTablespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablespace")(js.undefined)
        ret
    }
  }
  
}

