package typingsSlinky.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientXrayNode.typesHttpMod.UnmarshalledHttp
import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typingsSlinky.awsSdkClientXrayNode.typesTraceUserMod.UnmarshalledTraceUser
import typingsSlinky.awsSdkClientXrayNode.typesValueWithServiceIdsMod.UnmarshalledValueWithServiceIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTraceSummary extends TraceSummary {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  @JSName("Annotations")
  var Annotations_UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]] = js.native
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  @JSName("Http")
  var Http_UnmarshalledTraceSummary: js.UndefOr[UnmarshalledHttp] = js.native
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  @JSName("Users")
  var Users_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledTraceUser]] = js.native
}

object UnmarshalledTraceSummary {
  @scala.inline
  def apply(): UnmarshalledTraceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTraceSummary]
  }
  @scala.inline
  implicit class UnmarshalledTraceSummaryOps[Self <: UnmarshalledTraceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: UnmarshalledHttp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceIds(value: js.Array[UnmarshalledServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[UnmarshalledTraceUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

