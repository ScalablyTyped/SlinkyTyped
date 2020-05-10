package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleapis.AnonMaxValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for FieldSpec resource for Schemas in Directory API.
  */
@js.native
trait SchemaSchemaFieldSpec extends js.Object {
  /**
    * Display Name of the field.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Field (Read-only)
    */
  var fieldId: js.UndefOr[String] = js.native
  /**
    * Name of the field.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * Type of the field.
    */
  var fieldType: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether the field is indexed or not.
    */
  var indexed: js.UndefOr[Boolean] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether this is a multi-valued field or not.
    */
  var multiValued: js.UndefOr[Boolean] = js.native
  /**
    * Indexing spec for a numeric field. By default, only exact match queries
    * will be supported for numeric fields. Setting the numericIndexingSpec
    * allows range queries to be supported.
    */
  var numericIndexingSpec: js.UndefOr[AnonMaxValue] = js.native
  /**
    * Read ACLs on the field specifying who can view values of this field.
    * Valid values are &quot;ALL_DOMAIN_USERS&quot; and
    * &quot;ADMINS_AND_SELF&quot;.
    */
  var readAccessType: js.UndefOr[String] = js.native
}

object SchemaSchemaFieldSpec {
  @scala.inline
  def apply(): SchemaSchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaFieldSpec]
  }
  @scala.inline
  implicit class SchemaSchemaFieldSpecOps[Self <: SchemaSchemaFieldSpec] (val x: Self) extends AnyVal {
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
    def withNumericIndexingSpec(value: AnonMaxValue): Self = {
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

