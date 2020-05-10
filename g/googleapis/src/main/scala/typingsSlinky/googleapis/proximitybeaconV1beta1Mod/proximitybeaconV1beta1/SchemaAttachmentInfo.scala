package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subset of attachment information served via the
  * `beaconinfo.getforobserved` method, used when your users encounter your
  * beacons.
  */
@js.native
trait SchemaAttachmentInfo extends js.Object {
  /**
    * An opaque data container for client-provided data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The distance away from the beacon at which this attachment should be
    * delivered to a mobile app.  Setting this to a value greater than zero
    * indicates that the app should behave as if the beacon is &quot;seen&quot;
    * when the mobile device is less than this distance away from the beacon.
    * Different attachments on the same beacon can have different max
    * distances.  Note that even though this value is expressed with fractional
    * meter precision, real-world behavior is likley to be much less precise
    * than one meter, due to the nature of current Bluetooth radio technology.
    * Optional. When not set or zero, the attachment should be delivered at the
    * beacon&#39;s outer limit of detection.
    */
  var maxDistanceMeters: js.UndefOr[Double] = js.native
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is
    * &lt;var&gt;namespace/type&lt;/var&gt;, for example
    * &lt;code&gt;scrupulous-wombat-12345/welcome-message&lt;/code&gt;
    */
  var namespacedType: js.UndefOr[String] = js.native
}

object SchemaAttachmentInfo {
  @scala.inline
  def apply(): SchemaAttachmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachmentInfo]
  }
  @scala.inline
  implicit class SchemaAttachmentInfoOps[Self <: SchemaAttachmentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDistanceMeters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistanceMeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDistanceMeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistanceMeters")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(js.undefined)
        ret
    }
  }
  
}

