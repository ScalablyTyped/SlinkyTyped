package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOperatorOptions extends js.Object {
  var commutator: js.UndefOr[Name] = js.native
  var hashes: js.UndefOr[Boolean] = js.native
  var join: js.UndefOr[Name] = js.native
  var left: js.UndefOr[Name] = js.native
  var merges: js.UndefOr[Boolean] = js.native
  var negator: js.UndefOr[Name] = js.native
  var procedure: Name = js.native
  var restrict: js.UndefOr[Name] = js.native
  var right: js.UndefOr[Name] = js.native
}

object CreateOperatorOptions {
  @scala.inline
  def apply(procedure: Name): CreateOperatorOptions = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOperatorOptions]
  }
  @scala.inline
  implicit class CreateOperatorOptionsOps[Self <: CreateOperatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcedure(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommutator(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commutator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommutator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commutator")(js.undefined)
        ret
    }
    @scala.inline
    def withHashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashes")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMerges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merges")(js.undefined)
        ret
    }
    @scala.inline
    def withNegator(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negator")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrict(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

