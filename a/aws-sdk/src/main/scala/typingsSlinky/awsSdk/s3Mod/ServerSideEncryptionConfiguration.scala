package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * Container for information about a particular server-side encryption configuration rule.
    */
  var Rules: ServerSideEncryptionRules = js.native
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: ServerSideEncryptionRules): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class ServerSideEncryptionConfigurationOps[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: ServerSideEncryptionRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

