package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferenceProviderResponse extends js.Object {
  /**
    * The conference provider.
    */
  var ConferenceProvider: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ConferenceProvider] = js.native
}

object GetConferenceProviderResponse {
  @scala.inline
  def apply(): GetConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferenceProviderResponse]
  }
  @scala.inline
  implicit class GetConferenceProviderResponseOps[Self <: GetConferenceProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConferenceProvider(value: ConferenceProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConferenceProvider")(js.undefined)
        ret
    }
  }
  
}

