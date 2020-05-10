package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinIntentMetadata extends js.Object {
  /**
    * A unique identifier for the built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * A list of identifiers for the locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}

object BuiltinIntentMetadata {
  @scala.inline
  def apply(): BuiltinIntentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinIntentMetadata]
  }
  @scala.inline
  implicit class BuiltinIntentMetadataOps[Self <: BuiltinIntentMetadata] (val x: Self) extends AnyVal {
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

