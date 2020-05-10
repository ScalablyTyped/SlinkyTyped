package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the FHIR BigQuery schema. Determines how the server
  * generates the schema.
  */
@js.native
trait SchemaSchemaConfig extends js.Object {
  /**
    * The depth for all recursive structures in the output analytics schema.
    * For example, `concept` in the CodeSystem resource is a recursive
    * structure; when the depth is 2, the CodeSystem table will have a column
    * called `concept.concept` but not `concept.concept.concept`. If not
    * specified or set to 0, the server will use the default value 2.
    */
  var recursiveStructureDepth: js.UndefOr[String] = js.native
  /**
    * Specifies the output schema type. If unspecified, the default is
    * `LOSSLESS`.
    */
  var schemaType: js.UndefOr[String] = js.native
}

object SchemaSchemaConfig {
  @scala.inline
  def apply(): SchemaSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaConfig]
  }
  @scala.inline
  implicit class SchemaSchemaConfigOps[Self <: SchemaSchemaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecursiveStructureDepth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveStructureDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveStructureDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveStructureDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaType")(js.undefined)
        ret
    }
  }
  
}

