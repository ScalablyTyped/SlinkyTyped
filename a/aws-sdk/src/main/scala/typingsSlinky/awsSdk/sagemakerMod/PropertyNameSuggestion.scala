package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNameSuggestion extends js.Object {
  /**
    * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
    */
  var PropertyName: js.UndefOr[ResourcePropertyName] = js.native
}

object PropertyNameSuggestion {
  @scala.inline
  def apply(): PropertyNameSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyNameSuggestion]
  }
  @scala.inline
  implicit class PropertyNameSuggestionOps[Self <: PropertyNameSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyName(value: ResourcePropertyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyName")(js.undefined)
        ret
    }
  }
  
}

