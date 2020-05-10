package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfoForObservedBeaconsRequest extends js.Object {
  /**
    * Specifies what kind of attachments to include in the response.
    * When given, the response will include only attachments of the given types.
    * When empty, no attachments will be returned. Must be in the format
    * <var>namespace/type</var>. Accepts `&#42;` to specify all types in
    * all namespaces owned by the client.
    * Optional.
    */
  var namespacedTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The beacons that the client has encountered.
    * At least one must be given.
    */
  var observations: js.UndefOr[js.Array[Observation]] = js.native
}

object GetInfoForObservedBeaconsRequest {
  @scala.inline
  def apply(): GetInfoForObservedBeaconsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfoForObservedBeaconsRequest]
  }
  @scala.inline
  implicit class GetInfoForObservedBeaconsRequestOps[Self <: GetInfoForObservedBeaconsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespacedTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withObservations(value: js.Array[Observation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observations")(js.undefined)
        ret
    }
  }
  
}

