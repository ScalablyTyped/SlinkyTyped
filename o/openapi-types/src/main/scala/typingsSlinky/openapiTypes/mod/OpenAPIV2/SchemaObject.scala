package typingsSlinky.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any]
     with Schema {
  var default: js.UndefOr[js.Any] = js.native
  var discriminator: js.UndefOr[String] = js.native
  var example: js.UndefOr[js.Any] = js.native
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  @JSName("items")
  var items_SchemaObject: js.UndefOr[ItemsObject] = js.native
  @JSName("properties")
  var properties_SchemaObject: js.UndefOr[StringDictionary[SchemaObject]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var xml: js.UndefOr[XMLObject] = js.native
}

object SchemaObject {
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  @scala.inline
  implicit class SchemaObjectOps[Self <: SchemaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscriminator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscriminator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(js.undefined)
        ret
    }
    @scala.inline
    def withExample(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalDocs(value: ExternalDocumentationObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: ItemsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[SchemaObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withXml(value: XMLObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(js.undefined)
        ret
    }
  }
  
}

