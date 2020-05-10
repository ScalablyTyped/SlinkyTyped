package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  var businessKey: js.UndefOr[String] = js.native
  var lockDuration: js.UndefOr[Double] = js.native
  var processDefinitionId: js.UndefOr[String] = js.native
  var processDefinitionIdIn: js.UndefOr[String] = js.native
  var processDefinitionKey: js.UndefOr[String] = js.native
  var processDefinitionKeyIn: js.UndefOr[String] = js.native
  var processDefinitionVersionTag: js.UndefOr[String] = js.native
  var tenantIdIn: js.UndefOr[js.Array[String]] = js.native
  var variables: js.UndefOr[js.Array[_]] = js.native
  var withoutTenantId: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDefinitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDefinitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDefinitionIdIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionIdIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDefinitionIdIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionIdIn")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDefinitionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDefinitionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDefinitionKeyIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionKeyIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDefinitionKeyIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionKeyIn")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDefinitionVersionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionVersionTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDefinitionVersionTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDefinitionVersionTag")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantIdIn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantIdIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantIdIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantIdIn")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutTenantId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTenantId")(js.undefined)
        ret
    }
  }
  
}

