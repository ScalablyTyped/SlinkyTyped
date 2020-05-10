package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionDescriptionsMessage extends js.Object {
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.native
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ApplicationVersionDescriptionsMessage {
  @scala.inline
  def apply(): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
  @scala.inline
  implicit class ApplicationVersionDescriptionsMessageOps[Self <: ApplicationVersionDescriptionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationVersions(value: ApplicationVersionDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

