package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a context.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1Context extends js.Object {
  /**
    * Optional. The number of conversational query requests after which the
    * context expires. If set to `0` (the default) the context expires
    * immediately. Contexts expire automatically after 20 minutes if there are
    * no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.native
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/contexts/&lt;Context ID&gt;`, or `projects/&lt;Project
    * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
    * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.  The
    * `Context ID` is always converted to lowercase, may only contain
    * characters in a-zA-Z0-9_-% and may be at most 250 bytes long.  If
    * `Environment ID` is not specified, we assume default &#39;draft&#39;
    * environment. If `User ID` is not specified, we assume default &#39;-&#39;
    * user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of parameters associated with this context.
    * Refer to [this
    * doc](https://cloud.google.com/dialogflow-enterprise/docs/intents-actions-parameters)
    * for syntax.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1Context {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Context]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ContextOps[Self <: SchemaGoogleCloudDialogflowV2beta1Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifespanCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespanCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifespanCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespanCount")(js.undefined)
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
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

