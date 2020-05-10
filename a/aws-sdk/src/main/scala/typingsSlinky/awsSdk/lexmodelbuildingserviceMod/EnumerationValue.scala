package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumerationValue extends js.Object {
  /**
    * Additional values related to the slot type value.
    */
  var synonyms: js.UndefOr[SynonymList] = js.native
  /**
    * The value of the slot type.
    */
  var value: Value = js.native
}

object EnumerationValue {
  @scala.inline
  def apply(value: Value): EnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerationValue]
  }
  @scala.inline
  implicit class EnumerationValueOps[Self <: EnumerationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynonyms(value: SynonymList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(js.undefined)
        ret
    }
  }
  
}

