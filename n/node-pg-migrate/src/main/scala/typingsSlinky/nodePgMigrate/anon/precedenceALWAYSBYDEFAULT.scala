package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ALWAYS
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.`BY DEFAULT`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  precedence  :'ALWAYS' | 'BY DEFAULT'} & node-pg-migrate.node-pg-migrate.SequenceOptions */
@js.native
trait precedenceALWAYSBYDEFAULT extends js.Object {
  var cache: js.UndefOr[Double] = js.native
  var cycle: js.UndefOr[Boolean] = js.native
  var increment: js.UndefOr[Double] = js.native
  var maxvalue: js.UndefOr[Double | Null | `false`] = js.native
  var minvalue: js.UndefOr[Double | Null | `false`] = js.native
  var owner: js.UndefOr[String | Null | `false`] = js.native
  var precedence: ALWAYS | (`BY DEFAULT`) = js.native
  var start: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[typingsSlinky.nodePgMigrate.mod.Type] = js.native
}

object precedenceALWAYSBYDEFAULT {
  @scala.inline
  def apply(precedence: ALWAYS | (`BY DEFAULT`)): precedenceALWAYSBYDEFAULT = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
    __obj.asInstanceOf[precedenceALWAYSBYDEFAULT]
  }
  @scala.inline
  implicit class precedenceALWAYSBYDEFAULTOps[Self <: precedenceALWAYSBYDEFAULT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrecedence(value: ALWAYS | (`BY DEFAULT`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCycle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxvalue(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvalue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxvalueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvalue")(null)
        ret
    }
    @scala.inline
    def withMinvalue(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvalue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinvalueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvalue")(null)
        ret
    }
    @scala.inline
    def withOwner(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(null)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.nodePgMigrate.mod.Type): Self = {
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

