package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type Information. Contains detailed information about a composite type,
  * base type, or base type with specific collection.
  */
@js.native
trait SchemaTypeInfo extends js.Object {
  /**
    * The description of the type.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this
    * field will be empty.
    */
  var documentationLink: js.UndefOr[String] = js.native
  /**
    * Output only. Type of the output. Always deploymentManager#TypeInfo for
    * TypeInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The base type or composite type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * For base types with a collection, we return a schema and documentation
    * link For template types, we return only a schema
    */
  var schema: js.UndefOr[SchemaTypeInfoSchemaInfo] = js.native
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title on the API descriptor URL provided.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaTypeInfo {
  @scala.inline
  def apply(): SchemaTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfo]
  }
  @scala.inline
  implicit class SchemaTypeInfoOps[Self <: SchemaTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentationLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationLink")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: SchemaTypeInfoSchemaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

