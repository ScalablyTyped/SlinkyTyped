package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveredResource extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the on-premise resource.
    */
  var ConfigurationId: typingsSlinky.awsSdk.migrationhubMod.ConfigurationId = js.native
  /**
    * A description that can be free-form text to record additional detail about the discovered resource for clarity or later reference.
    */
  var Description: js.UndefOr[DiscoveredResourceDescription] = js.native
}

object DiscoveredResource {
  @scala.inline
  def apply(ConfigurationId: ConfigurationId): DiscoveredResource = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveredResource]
  }
  @scala.inline
  implicit class DiscoveredResourceOps[Self <: DiscoveredResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationId(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: DiscoveredResourceDescription): Self = {
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
  }
  
}

