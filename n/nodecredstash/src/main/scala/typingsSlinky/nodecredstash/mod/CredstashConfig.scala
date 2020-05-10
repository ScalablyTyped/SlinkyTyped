package typingsSlinky.nodecredstash.mod

import typingsSlinky.awsSdk.kmsMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[ClientConfiguration] = js.native
  var dynamoOpts: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration] = js.native
  var kmsKey: js.UndefOr[String] = js.native
  var kmsOpts: js.UndefOr[ClientConfiguration] = js.native
  var table: js.UndefOr[String] = js.native
}

object CredstashConfig {
  @scala.inline
  def apply(): CredstashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredstashConfig]
  }
  @scala.inline
  implicit class CredstashConfigOps[Self <: CredstashConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsOpts(value: ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoOpts(value: typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsOpts(value: ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

