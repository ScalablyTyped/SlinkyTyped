package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeElasticsearchDomainResponse extends js.Object {
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.native
}

object UpgradeElasticsearchDomainResponse {
  @scala.inline
  def apply(): UpgradeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
  }
  @scala.inline
  implicit class UpgradeElasticsearchDomainResponseOps[Self <: UpgradeElasticsearchDomainResponse] (val x: Self) extends AnyVal {
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
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
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
    @scala.inline
    def withTargetVersion(value: ElasticsearchVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersion")(js.undefined)
        ret
    }
  }
  
}

