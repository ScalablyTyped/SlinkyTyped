package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutomaticMetadataResult extends js.Object {
  val PropertyValueSuggestions: IPropertyValueSuggestions = js.native
  def Clone(): IAutomaticMetadataResult = js.native
}

object IAutomaticMetadataResult {
  @scala.inline
  def apply(Clone: () => IAutomaticMetadataResult, PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
  @scala.inline
  implicit class IAutomaticMetadataResultOps[Self <: IAutomaticMetadataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IAutomaticMetadataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropertyValueSuggestions(value: IPropertyValueSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyValueSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

