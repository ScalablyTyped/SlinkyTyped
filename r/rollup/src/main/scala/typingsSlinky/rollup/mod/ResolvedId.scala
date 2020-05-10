package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedId extends js.Object {
  var external: Boolean = js.native
  var id: String = js.native
  var moduleSideEffects: Boolean = js.native
  var syntheticNamedExports: Boolean = js.native
}

object ResolvedId {
  @scala.inline
  def apply(external: Boolean, id: String, moduleSideEffects: Boolean, syntheticNamedExports: Boolean): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
  @scala.inline
  implicit class ResolvedIdOps[Self <: ResolvedId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntheticNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticNamedExports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

