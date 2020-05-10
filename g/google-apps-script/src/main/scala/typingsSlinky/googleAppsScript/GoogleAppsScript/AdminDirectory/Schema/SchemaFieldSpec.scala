package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldSpec extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var fieldId: js.UndefOr[String] = js.native
  var fieldName: js.UndefOr[String] = js.native
  var fieldType: js.UndefOr[String] = js.native
  var indexed: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var multiValued: js.UndefOr[Boolean] = js.native
  var numericIndexingSpec: js.UndefOr[SchemaFieldSpecNumericIndexingSpec] = js.native
  var readAccessType: js.UndefOr[String] = js.native
}

object SchemaFieldSpec {
  @scala.inline
  def apply(): SchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldSpec]
  }
  @scala.inline
  implicit class SchemaFieldSpecOps[Self <: SchemaFieldSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(js.undefined)
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
    def withFieldType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValued(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValued")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericIndexingSpec(value: SchemaFieldSpecNumericIndexingSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericIndexingSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericIndexingSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericIndexingSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withReadAccessType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAccessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadAccessType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAccessType")(js.undefined)
        ret
    }
  }
  
}

