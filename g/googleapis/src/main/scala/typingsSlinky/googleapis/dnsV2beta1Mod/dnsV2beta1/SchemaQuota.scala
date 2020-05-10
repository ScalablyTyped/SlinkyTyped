package typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQuota extends js.Object {
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#quota&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var managedZones: js.UndefOr[Double] = js.native
  var managedZonesPerNetwork: js.UndefOr[Double] = js.native
  var networksPerManagedZone: js.UndefOr[Double] = js.native
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
  var whitelistedKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
}

object SchemaQuota {
  @scala.inline
  def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  @scala.inline
  implicit class SchemaQuotaOps[Self <: SchemaQuota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsKeysPerManagedZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsKeysPerManagedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsKeysPerManagedZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsKeysPerManagedZone")(js.undefined)
        ret
    }
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
    def withManagedZonesPerNetwork(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedZonesPerNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedZonesPerNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedZonesPerNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworksPerManagedZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networksPerManagedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworksPerManagedZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networksPerManagedZone")(js.undefined)
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
    @scala.inline
    def withWhitelistedKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedKeySpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistedKeySpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedKeySpecs")(js.undefined)
        ret
    }
  }
  
}

