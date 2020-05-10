package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebhooksOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListWebhooks call to return the next set of webhooks in the list. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codepipelineMod.NextToken] = js.native
  /**
    * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
    */
  var webhooks: js.UndefOr[WebhookList] = js.native
}

object ListWebhooksOutput {
  @scala.inline
  def apply(): ListWebhooksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebhooksOutput]
  }
  @scala.inline
  implicit class ListWebhooksOutputOps[Self <: ListWebhooksOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withWebhooks(value: WebhookList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(js.undefined)
        ret
    }
  }
  
}

