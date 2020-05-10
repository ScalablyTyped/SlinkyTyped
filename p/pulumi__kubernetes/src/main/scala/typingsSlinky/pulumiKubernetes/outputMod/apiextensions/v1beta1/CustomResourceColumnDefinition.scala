package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
@js.native
trait CustomResourceColumnDefinition extends js.Object {
  /**
    * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each
    * custom resource to produce the value for this column.
    */
  val JSONPath: String = js.native
  /**
    * description is a human readable description of this column.
    */
  val description: String = js.native
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied
    * to the primary identifier column to assist in clients identifying column is the resource
    * name. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  val format: String = js.native
  /**
    * name is a human readable name for the column.
    */
  val name: String = js.native
  /**
    * priority is an integer defining the relative importance of this column compared to others.
    * Lower numbers are considered higher priority. Columns that may be omitted in limited space
    * scenarios should be given a priority greater than 0.
    */
  val priority: Double = js.native
  /**
    * type is an OpenAPI type definition for this column. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  val `type`: String = js.native
}

object CustomResourceColumnDefinition {
  @scala.inline
  def apply(
    JSONPath: String,
    description: String,
    format: String,
    name: String,
    priority: Double,
    `type`: String
  ): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(JSONPath = JSONPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
  @scala.inline
  implicit class CustomResourceColumnDefinitionOps[Self <: CustomResourceColumnDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSONPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

