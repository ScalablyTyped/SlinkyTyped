package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A context rule provides information about the context for an individual API
  * element.
  */
@js.native
trait SchemaContextRule extends js.Object {
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from client to backend.
    */
  var allowedRequestExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from backend to client.
    */
  var allowedResponseExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names of provided contexts.
    */
  var provided: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names of requested contexts.
    */
  var requested: js.UndefOr[js.Array[String]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaContextRule {
  @scala.inline
  def apply(): SchemaContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextRule]
  }
  @scala.inline
  implicit class SchemaContextRuleOps[Self <: SchemaContextRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedRequestExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedRequestExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedRequestExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedRequestExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedResponseExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedResponseExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedResponseExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedResponseExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withProvided(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provided")(js.undefined)
        ret
    }
    @scala.inline
    def withRequested(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

