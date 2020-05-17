package typingsSlinky.rollup.mod

import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDescription extends LoadResult {
  var ast: js.UndefOr[Program] = js.native
  var code: String = js.native
  var map: js.UndefOr[SourceMapInput] = js.native
  var moduleSideEffects: js.UndefOr[Boolean | Null] = js.native
  var syntheticNamedExports: js.UndefOr[Boolean] = js.native
}

object SourceDescription {
  @scala.inline
  def apply(code: String): SourceDescription = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
  @scala.inline
  implicit class SourceDescriptionOps[Self <: SourceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: Program): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: SourceMapInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(null)
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

