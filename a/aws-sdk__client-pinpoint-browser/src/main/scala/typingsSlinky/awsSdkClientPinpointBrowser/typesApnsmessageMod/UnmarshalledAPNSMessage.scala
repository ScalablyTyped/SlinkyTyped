package typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAPNSMessage extends APNSMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledAPNSMessage {
  @scala.inline
  def apply(): UnmarshalledAPNSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAPNSMessage]
  }
  @scala.inline
  implicit class UnmarshalledAPNSMessageOps[Self <: UnmarshalledAPNSMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
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

