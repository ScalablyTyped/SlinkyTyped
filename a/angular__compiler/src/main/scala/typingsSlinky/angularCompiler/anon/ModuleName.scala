package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.srcSummaryResolverMod.Summary
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleName extends js.Object {
  var importAs: js.Array[ImportAs] = js.native
  var moduleName: String | Null = js.native
  var summaries: js.Array[Summary[StaticSymbol]] = js.native
}

object ModuleName {
  @scala.inline
  def apply(importAs: js.Array[ImportAs], summaries: js.Array[Summary[StaticSymbol]]): ModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
  @scala.inline
  implicit class ModuleNameOps[Self <: ModuleName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportAs(value: js.Array[ImportAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaries(value: js.Array[Summary[StaticSymbol]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(null)
        ret
    }
  }
  
}

