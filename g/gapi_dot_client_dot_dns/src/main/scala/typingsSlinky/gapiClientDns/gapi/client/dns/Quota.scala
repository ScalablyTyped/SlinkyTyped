package typingsSlinky.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quota extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
  var kind: js.UndefOr[String] = js.native
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
}

object Quota {
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
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
    def withManagedZones(value: Double): Self = {
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
    def withResourceRecordsPerRrset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordsPerRrset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordsPerRrset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordsPerRrset")(js.undefined)
        ret
    }
    @scala.inline
    def withRrsetAdditionsPerChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetAdditionsPerChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRrsetAdditionsPerChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetAdditionsPerChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRrsetDeletionsPerChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetDeletionsPerChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRrsetDeletionsPerChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetDeletionsPerChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRrsetsPerManagedZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetsPerManagedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRrsetsPerManagedZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrsetsPerManagedZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRrdataSizePerChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRrdataSizePerChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRrdataSizePerChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRrdataSizePerChange")(js.undefined)
        ret
    }
  }
  
}

