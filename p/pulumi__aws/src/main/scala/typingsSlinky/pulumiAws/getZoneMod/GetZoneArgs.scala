package typingsSlinky.pulumiAws.getZoneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetZoneArgs extends js.Object {
  /**
    * The Hosted Zone name of the desired Hosted Zone.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Used with `name` field to get a private Hosted Zone.
    */
  val privateZone: js.UndefOr[Boolean] = js.native
  val resourceRecordSetCount: js.UndefOr[Double] = js.native
  /**
    * Used with `name` field. A mapping of tags, each pair of which must exactly match a pair on the desired Hosted Zone.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Used with `name` field to get a private Hosted Zone associated with the vpcId (in this case, privateZone is not mandatory).
    */
  val vpcId: js.UndefOr[String] = js.native
  /**
    * The Hosted Zone id of the desired Hosted Zone.
    */
  val zoneId: js.UndefOr[String] = js.native
}

object GetZoneArgs {
  @scala.inline
  def apply(): GetZoneArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetZoneArgs]
  }
  @scala.inline
  implicit class GetZoneArgsOps[Self <: GetZoneArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    @scala.inline
    def withResourceRecordSetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordSetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordSetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordSetCount")(js.undefined)
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
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

