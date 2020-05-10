package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreRenderedChunk extends js.Object {
  var dynamicImports: js.Array[String] = js.native
  var exports: js.Array[String] = js.native
  var facadeModuleId: String | Null = js.native
  var imports: js.Array[String] = js.native
  var isDynamicEntry: Boolean = js.native
  var isEntry: Boolean = js.native
  var modules: StringDictionary[RenderedModule] = js.native
  var name: String = js.native
}

object PreRenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String
  ): PreRenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderedChunk]
  }
  @scala.inline
  implicit class PreRenderedChunkOps[Self <: PreRenderedChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDynamicEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDynamicEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: StringDictionary[RenderedModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacadeModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facadeModuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacadeModuleIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facadeModuleId")(null)
        ret
    }
  }
  
}

