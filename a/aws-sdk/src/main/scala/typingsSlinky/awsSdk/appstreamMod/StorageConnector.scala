package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageConnector extends js.Object {
  /**
    * The type of storage connector.
    */
  var ConnectorType: StorageConnectorType = js.native
  /**
    * The names of the domains for the account.
    */
  var Domains: js.UndefOr[DomainList] = js.native
  /**
    * The ARN of the storage connector.
    */
  var ResourceIdentifier: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ResourceIdentifier] = js.native
}

object StorageConnector {
  @scala.inline
  def apply(ConnectorType: StorageConnectorType): StorageConnector = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConnector]
  }
  @scala.inline
  implicit class StorageConnectorOps[Self <: StorageConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorType(value: StorageConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomains(value: DomainList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: ResourceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(js.undefined)
        ret
    }
  }
  
}

