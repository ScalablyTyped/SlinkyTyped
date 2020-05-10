package typingsSlinky.awsSdkClientPinpointBrowser.typesActivitiesResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesActivityResponseMod.UnmarshalledActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledActivitiesResponse extends ActivitiesResponse {
  /**
    * List of campaign activities
    */
  @JSName("Item")
  var Item_UnmarshalledActivitiesResponse: js.UndefOr[js.Array[UnmarshalledActivityResponse]] = js.native
}

object UnmarshalledActivitiesResponse {
  @scala.inline
  def apply(): UnmarshalledActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledActivitiesResponse]
  }
  @scala.inline
  implicit class UnmarshalledActivitiesResponseOps[Self <: UnmarshalledActivitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledActivityResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}

