package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeElasticsearchDomainRequest extends js.Object {
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: ElasticsearchVersionString = js.native
}

object UpgradeElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TargetVersion: ElasticsearchVersionString): UpgradeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TargetVersion = TargetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
  }
  @scala.inline
  implicit class UpgradeElasticsearchDomainRequestOps[Self <: UpgradeElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetVersion(value: ElasticsearchVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformCheckOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformCheckOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformCheckOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformCheckOnly")(js.undefined)
        ret
    }
  }
  
}

