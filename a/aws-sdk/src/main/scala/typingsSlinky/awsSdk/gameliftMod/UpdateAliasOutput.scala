package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAliasOutput extends js.Object {
  /**
    * The updated alias resource.
    */
  var Alias: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Alias] = js.native
}

object UpdateAliasOutput {
  @scala.inline
  def apply(): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAliasOutput]
  }
  @scala.inline
  implicit class UpdateAliasOutputOps[Self <: UpdateAliasOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(js.undefined)
        ret
    }
  }
  
}

