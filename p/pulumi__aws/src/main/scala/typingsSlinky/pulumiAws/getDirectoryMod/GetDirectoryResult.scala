package typingsSlinky.pulumiAws.getDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.directoryservice.GetDirectoryConnectSetting
import typingsSlinky.pulumiAws.outputMod.directoryservice.GetDirectoryVpcSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryResult extends js.Object {
  /**
    * The access URL for the directory/connector, such as http://alias.awsapps.com.
    */
  val accessUrl: String = js.native
  /**
    * The alias for the directory/connector, such as `d-991708b282.awsapps.com`.
    */
  val alias: String = js.native
  val connectSettings: js.Array[GetDirectoryConnectSetting] = js.native
  /**
    * A textual description for the directory/connector.
    */
  val description: String = js.native
  val directoryId: String = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory/connector.
    */
  val dnsIpAddresses: js.Array[String] = js.native
  /**
    * (for `MicrosoftAD`) The Microsoft AD edition (`Standard` or `Enterprise`).
    */
  val edition: String = js.native
  /**
    * The directory/connector single-sign on status.
    */
  val enableSso: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The fully qualified name for the directory/connector.
    */
  val name: String = js.native
  /**
    * The ID of the security group created by the directory/connector.
    */
  val securityGroupId: String = js.native
  /**
    * The short name of the directory/connector, such as `CORP`.
    */
  val shortName: String = js.native
  /**
    * (for `SimpleAD` and `ADConnector`) The size of the directory/connector (`Small` or `Large`).
    */
  val size: String = js.native
  /**
    * A mapping of tags assigned to the directory/connector.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD`).
    */
  val `type`: String = js.native
  val vpcSettings: js.Array[GetDirectoryVpcSetting] = js.native
}

object GetDirectoryResult {
  @scala.inline
  def apply(
    accessUrl: String,
    alias: String,
    connectSettings: js.Array[GetDirectoryConnectSetting],
    description: String,
    directoryId: String,
    dnsIpAddresses: js.Array[String],
    edition: String,
    enableSso: Boolean,
    id: String,
    name: String,
    securityGroupId: String,
    shortName: String,
    size: String,
    `type`: String,
    vpcSettings: js.Array[GetDirectoryVpcSetting]
  ): GetDirectoryResult = {
    val __obj = js.Dynamic.literal(accessUrl = accessUrl.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], connectSettings = connectSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], edition = edition.asInstanceOf[js.Any], enableSso = enableSso.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vpcSettings = vpcSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResult]
  }
  @scala.inline
  implicit class GetDirectoryResultOps[Self <: GetDirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectSettings(value: js.Array[GetDirectoryConnectSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsIpAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsIpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcSettings(value: js.Array[GetDirectoryVpcSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

