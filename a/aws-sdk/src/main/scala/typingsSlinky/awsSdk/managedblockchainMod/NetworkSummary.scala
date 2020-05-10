package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkSummary extends js.Object {
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * An optional description of the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.Framework] = js.native
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.native
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
}

object NetworkSummary {
  @scala.inline
  def apply(): NetworkSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSummary]
  }
  @scala.inline
  implicit class NetworkSummaryOps[Self <: NetworkSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: Framework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Framework")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkVersion(value: FrameworkVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameworkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameworkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: NetworkStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

