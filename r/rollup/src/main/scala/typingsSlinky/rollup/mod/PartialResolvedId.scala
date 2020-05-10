package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialResolvedId extends _ResolveIdResult {
  var external: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var moduleSideEffects: js.UndefOr[Boolean | Null] = js.native
  var syntheticNamedExports: js.UndefOr[Boolean] = js.native
}

object PartialResolvedId {
  @scala.inline
  def apply(id: String): PartialResolvedId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResolvedId]
  }
  @scala.inline
  implicit class PartialResolvedIdOps[Self <: PartialResolvedId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleSideEffectsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(null)
        ret
    }
    @scala.inline
    def withSyntheticNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticNamedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntheticNamedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticNamedExports")(js.undefined)
        ret
    }
  }
  
}

