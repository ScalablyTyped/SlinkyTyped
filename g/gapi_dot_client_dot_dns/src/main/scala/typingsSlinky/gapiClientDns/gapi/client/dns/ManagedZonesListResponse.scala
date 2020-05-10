package typingsSlinky.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedZonesListResponse extends js.Object {
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.native
  /** The managed zone resources. */
  var managedZones: js.UndefOr[js.Array[ManagedZone]] = js.native
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another
    * list request using this value as your page token.
    *
    * In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change
    * between the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to
    * retrieve a consistent snapshot of a collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ManagedZonesListResponse {
  @scala.inline
  def apply(): ManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonesListResponse]
  }
  @scala.inline
  implicit class ManagedZonesListResponseOps[Self <: ManagedZonesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedZones(value: js.Array[ManagedZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedZones")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

