package typingsSlinky.officeUiFabricReact.announcedSearchResultsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedSearchResultsExampleState extends js.Object {
  var emptyInput: Boolean = js.native
  var numberOfSuggestions: Double = js.native
  var seconds: Double = js.native
}

object IAnnouncedSearchResultsExampleState {
  @scala.inline
  def apply(emptyInput: Boolean, numberOfSuggestions: Double, seconds: Double): IAnnouncedSearchResultsExampleState = {
    val __obj = js.Dynamic.literal(emptyInput = emptyInput.asInstanceOf[js.Any], numberOfSuggestions = numberOfSuggestions.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedSearchResultsExampleState]
  }
  @scala.inline
  implicit class IAnnouncedSearchResultsExampleStateOps[Self <: IAnnouncedSearchResultsExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

