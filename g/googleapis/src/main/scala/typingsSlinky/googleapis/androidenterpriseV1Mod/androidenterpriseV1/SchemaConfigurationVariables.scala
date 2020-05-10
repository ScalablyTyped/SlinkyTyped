package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration variables resource contains the managed configuration
  * settings ID to be applied to a single user, as well as the variable set
  * that is attributed to the user. The variable set will be used to replace
  * placeholders in the managed configuration settings.
  */
@js.native
trait SchemaConfigurationVariables extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#configurationVariables&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  /**
    * The variable set that is attributed to the user.
    */
  var variableSet: js.UndefOr[js.Array[SchemaVariableSet]] = js.native
}

object SchemaConfigurationVariables {
  @scala.inline
  def apply(): SchemaConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationVariables]
  }
  @scala.inline
  implicit class SchemaConfigurationVariablesOps[Self <: SchemaConfigurationVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMcmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMcmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcmId")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableSet(value: js.Array[SchemaVariableSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableSet")(js.undefined)
        ret
    }
  }
  
}

