package typingsSlinky.pulumiAws.getZoneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetZoneResult extends js.Object {
  /**
    * Caller Reference of the Hosted Zone.
    */
  val callerReference: String = js.native
  /**
    * The comment field of the Hosted Zone.
    */
  val comment: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The description provided by the service that created the Hosted Zone (e.g. `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
    */
  val linkedServiceDescription: String = js.native
  /**
    * The service that created the Hosted Zone (e.g. `servicediscovery.amazonaws.com`).
    */
  val linkedServicePrincipal: String = js.native
  val name: String = js.native
  /**
    * The list of DNS name servers for the Hosted Zone.
    */
  val nameServers: js.Array[String] = js.native
  val privateZone: js.UndefOr[Boolean] = js.native
  /**
    * The number of Record Set in the Hosted Zone.
    */
  val resourceRecordSetCount: Double = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
  val zoneId: String = js.native
}

object GetZoneResult {
  @scala.inline
  def apply(
    callerReference: String,
    comment: String,
    id: String,
    linkedServiceDescription: String,
    linkedServicePrincipal: String,
    name: String,
    nameServers: js.Array[String],
    resourceRecordSetCount: Double,
    tags: StringDictionary[js.Any],
    vpcId: String,
    zoneId: String
  ): GetZoneResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedServiceDescription = linkedServiceDescription.asInstanceOf[js.Any], linkedServicePrincipal = linkedServicePrincipal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any], resourceRecordSetCount = resourceRecordSetCount.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetZoneResult]
  }
  @scala.inline
  implicit class GetZoneResultOps[Self <: GetZoneResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedServiceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedServiceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedServicePrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedServicePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceRecordSetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordSetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateZone")(js.undefined)
        ret
    }
  }
  
}

