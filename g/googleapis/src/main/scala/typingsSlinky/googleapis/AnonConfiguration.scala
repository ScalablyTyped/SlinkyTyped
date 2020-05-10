package typingsSlinky.googleapis

import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobConfiguration
import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobReference
import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatistics
import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfiguration extends js.Object {
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.native
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  var id: js.UndefOr[String] = js.native
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  var kind: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var statistics: js.UndefOr[SchemaJobStatistics] = js.native
  var status: js.UndefOr[SchemaJobStatus] = js.native
  var user_email: js.UndefOr[String] = js.native
}

object AnonConfiguration {
  @scala.inline
  def apply(): AnonConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConfiguration]
  }
  @scala.inline
  implicit class AnonConfigurationOps[Self <: AnonConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: SchemaJobConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorResult(value: SchemaErrorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withJobReference(value: SchemaJobReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(js.undefined)
        ret
    }
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: SchemaJobStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_email")(js.undefined)
        ret
    }
  }
  
}

