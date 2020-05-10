package typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSMSMessage extends SMSMessage {
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledSMSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledSMSMessage {
  @scala.inline
  def apply(): UnmarshalledSMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSMSMessage]
  }
  @scala.inline
  implicit class UnmarshalledSMSMessageOps[Self <: UnmarshalledSMSMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubstitutions(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

