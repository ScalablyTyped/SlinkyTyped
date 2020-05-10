package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsApp extends Entity {
  // The details for each version of the app.
  var appDefinitions: js.UndefOr[js.Array[TeamsAppDefinition]] = js.native
  // The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
  var displayName: js.UndefOr[String] = js.native
  // The method of distribution for the app.
  var distributionMethod: js.UndefOr[TeamsAppDistributionMethod] = js.native
  // The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
  var externalId: js.UndefOr[String] = js.native
}

object TeamsApp {
  @scala.inline
  def apply(): TeamsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsApp]
  }
  @scala.inline
  implicit class TeamsAppOps[Self <: TeamsApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDefinitions(value: js.Array[TeamsAppDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionMethod(value: TeamsAppDistributionMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
        ret
    }
  }
  
}

