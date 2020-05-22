package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAttributesRequest extends js.Object {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  var Blacklist: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
}

object UpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: js.Array[String] | js.Iterable[String] = null): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
}

