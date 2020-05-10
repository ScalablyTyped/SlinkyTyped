package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFieldsStateObject extends js.Object {
  var cards: js.Array[HostedFieldsHostedFieldsCard] = js.native
  var emittedBy: HostedFieldsHostedFieldsFieldName = js.native
  var fields: HostedFieldsFieldDataFields = js.native
}

object HostedFieldsStateObject {
  @scala.inline
  def apply(
    cards: js.Array[HostedFieldsHostedFieldsCard],
    emittedBy: HostedFieldsHostedFieldsFieldName,
    fields: HostedFieldsFieldDataFields
  ): HostedFieldsStateObject = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], emittedBy = emittedBy.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsStateObject]
  }
  @scala.inline
  implicit class HostedFieldsStateObjectOps[Self <: HostedFieldsStateObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCards(value: js.Array[HostedFieldsHostedFieldsCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmittedBy(value: HostedFieldsHostedFieldsFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: HostedFieldsFieldDataFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

