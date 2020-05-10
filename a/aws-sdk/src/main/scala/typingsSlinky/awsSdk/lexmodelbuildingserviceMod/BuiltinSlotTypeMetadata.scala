package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinSlotTypeMetadata extends js.Object {
  /**
    * A unique identifier for the built-in slot type. To find the signature for a slot type, see Slot Type Reference in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinSlotTypeSignature] = js.native
  /**
    * A list of target locales for the slot. 
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}

object BuiltinSlotTypeMetadata {
  @scala.inline
  def apply(): BuiltinSlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinSlotTypeMetadata]
  }
  @scala.inline
  implicit class BuiltinSlotTypeMetadataOps[Self <: BuiltinSlotTypeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignature(value: BuiltinSlotTypeSignature): Self = {
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

