package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceActionSummary extends js.Object {
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.native
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.native
}

object ServiceActionSummary {
  @scala.inline
  def apply(): ServiceActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionSummary]
  }
  @scala.inline
  implicit class ServiceActionSummaryOps[Self <: ServiceActionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionType(value: ServiceActionDefinitionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefinitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefinitionType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ServiceActionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ServiceActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

