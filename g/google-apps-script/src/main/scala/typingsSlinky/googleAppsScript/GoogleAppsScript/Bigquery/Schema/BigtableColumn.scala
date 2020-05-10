package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigtableColumn extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var fieldName: js.UndefOr[String] = js.native
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  var qualifierEncoded: js.UndefOr[String] = js.native
  var qualifierString: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object BigtableColumn {
  @scala.inline
  def apply(): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumn]
  }
  @scala.inline
  implicit class BigtableColumnOps[Self <: BigtableColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyReadLatest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReadLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyReadLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReadLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifierEncoded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierEncoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifierEncoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierEncoded")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifierString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifierString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierString")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

