package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAliasInput extends js.Object {
  /**
    * A unique identifier for the alias that you want to update. You can use either the alias ID or ARN value.
    */
  var AliasId: typingsSlinky.awsSdk.gameliftMod.AliasId = js.native
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.native
  /**
    * The routing configuration, including routing type and fleet target, for the alias.
    */
  var RoutingStrategy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.RoutingStrategy] = js.native
}

object UpdateAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasInput]
  }
  @scala.inline
  implicit class UpdateAliasInputOps[Self <: UpdateAliasInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasId(value: AliasId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: NonZeroAndMaxString): Self = {
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
    def withName(value: NonBlankAndLengthConstraintString): Self = {
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
    def withRoutingStrategy(value: RoutingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingStrategy")(js.undefined)
        ret
    }
  }
  
}

