package typingsSlinky.rollup.mod

import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleJSON extends TransformModuleJSON {
  var dependencies: js.Array[String] = js.native
  var id: String = js.native
  var transformFiles: js.UndefOr[js.Array[EmittedFile]] = js.native
}

object ModuleJSON {
  @scala.inline
  def apply(
    ast: Program,
    code: String,
    customTransformCache: Boolean,
    dependencies: js.Array[String],
    id: String,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleJSON]
  }
  @scala.inline
  implicit class ModuleJSONOps[Self <: ModuleJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformFiles(value: js.Array[EmittedFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFiles")(js.undefined)
        ret
    }
  }
  
}

