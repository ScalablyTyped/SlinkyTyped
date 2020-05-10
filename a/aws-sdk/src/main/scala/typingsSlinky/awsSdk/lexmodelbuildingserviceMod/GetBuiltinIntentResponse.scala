package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinIntentResponse extends js.Object {
  /**
    * The unique identifier for a built-in intent.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * An array of BuiltinIntentSlot objects, one entry for each slot type in the intent.
    */
  var slots: js.UndefOr[BuiltinIntentSlotList] = js.native
  /**
    * A list of locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}

object GetBuiltinIntentResponse {
  @scala.inline
  def apply(): GetBuiltinIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentResponse]
  }
  @scala.inline
  implicit class GetBuiltinIntentResponseOps[Self <: GetBuiltinIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignature(value: BuiltinIntentSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: BuiltinIntentSlotList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLocales(value: LocaleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLocales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLocales")(js.undefined)
        ret
    }
  }
  
}

