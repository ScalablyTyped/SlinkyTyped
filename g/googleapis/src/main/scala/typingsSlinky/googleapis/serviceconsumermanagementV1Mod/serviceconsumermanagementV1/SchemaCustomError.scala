package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customize service error responses.  For example, list any service specific
  * protobuf types that can appear in error detail lists of error responses.
  * Example:      custom_error:       types:       - google.foo.v1.CustomError
  * - google.foo.v1.AnotherError
  */
@js.native
trait SchemaCustomError extends js.Object {
  /**
    * The list of custom error rules that apply to individual API messages.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaCustomErrorRule]] = js.native
  /**
    * The list of custom error detail types, e.g.
    * &#39;google.foo.v1.CustomError&#39;.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCustomError {
  @scala.inline
  def apply(): SchemaCustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomError]
  }
  @scala.inline
  implicit class SchemaCustomErrorOps[Self <: SchemaCustomError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[SchemaCustomErrorRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

