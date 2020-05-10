package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asset extends js.Object {
  var aliasId: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var label: js.UndefOr[js.Array[String]] = js.native
  var matchPolicy: js.UndefOr[AssetMatchPolicy] = js.native
  var matchPolicyEffective: js.UndefOr[AssetMatchPolicy] = js.native
  var matchPolicyMine: js.UndefOr[AssetMatchPolicy] = js.native
  var metadata: js.UndefOr[Metadata] = js.native
  var metadataEffective: js.UndefOr[Metadata] = js.native
  var metadataMine: js.UndefOr[Metadata] = js.native
  var ownership: js.UndefOr[RightsOwnership] = js.native
  var ownershipConflicts: js.UndefOr[OwnershipConflicts] = js.native
  var ownershipEffective: js.UndefOr[RightsOwnership] = js.native
  var ownershipMine: js.UndefOr[RightsOwnership] = js.native
  var status: js.UndefOr[String] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Asset {
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLabel(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPolicy(value: AssetMatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPolicyEffective(value: AssetMatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicyEffective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPolicyEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicyEffective")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPolicyMine(value: AssetMatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicyMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPolicyMine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPolicyMine")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataEffective(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataEffective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataEffective")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataMine(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataMine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataMine")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnership(value: RightsOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnershipConflicts(value: OwnershipConflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipConflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnershipConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipConflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnershipEffective(value: RightsOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipEffective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnershipEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipEffective")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnershipMine(value: RightsOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnershipMine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownershipMine")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

