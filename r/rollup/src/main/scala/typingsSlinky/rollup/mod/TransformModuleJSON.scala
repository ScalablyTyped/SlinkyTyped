package typingsSlinky.rollup.mod

import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformModuleJSON extends js.Object {
  var ast: Program = js.native
  var code: String = js.native
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: Boolean = js.native
  var moduleSideEffects: Boolean | Null = js.native
  var originalCode: String = js.native
  var originalSourcemap: ExistingDecodedSourceMap | Null = js.native
  var resolvedIds: js.UndefOr[ResolvedIdMap] = js.native
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing] = js.native
  var syntheticNamedExports: Boolean | Null = js.native
  var transformDependencies: js.Array[String] = js.native
}

object TransformModuleJSON {
  @scala.inline
  def apply(
    ast: Program,
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformModuleJSON]
  }
  @scala.inline
  implicit class TransformModuleJSONOps[Self <: TransformModuleJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: Program): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomTransformCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTransformCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcemapChain(value: js.Array[DecodedSourceMapOrMissing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleSideEffectsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(null)
        ret
    }
    @scala.inline
    def withOriginalSourcemap(value: ExistingDecodedSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSourcemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSourcemapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSourcemap")(null)
        ret
    }
    @scala.inline
    def withResolvedIds(value: ResolvedIdMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntheticNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticNamedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntheticNamedExportsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticNamedExports")(null)
        ret
    }
  }
  
}

