package typingsSlinky.jestRunner.typesMod

import typingsSlinky.jestHasteMap.mod.FS
import typingsSlinky.jestHasteMap.mod.ModuleMap
import typingsSlinky.jestResolve.mod.^
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var config: ProjectConfig = js.native
  var hasteFS: FS = js.native
  var moduleMap: ModuleMap = js.native
  var resolver: ^ = js.native
}

object Context {
  @scala.inline
  def apply(config: ProjectConfig, hasteFS: FS, moduleMap: ModuleMap, resolver: ^): Context = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasteFS(value: FS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleMap(value: ModuleMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolver(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

