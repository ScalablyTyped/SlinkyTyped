package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestHasteMap.mod.FS
import typingsSlinky.jestHasteMap.mod.ModuleMap
import typingsSlinky.jestResolve.mod.ResolverType
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var config: ProjectConfig = js.native
  
  var hasteFS: FS = js.native
  
  var moduleMap: ModuleMap = js.native
  
  var resolver: ResolverType = js.native
}
object Context {
  
  @scala.inline
  def apply(config: ProjectConfig, hasteFS: FS, moduleMap: ModuleMap, resolver: ResolverType): Context = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: ProjectConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasteFS(value: FS): Self = this.set("hasteFS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleMap(value: ModuleMap): Self = this.set("moduleMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolver(value: ResolverType): Self = this.set("resolver", value.asInstanceOf[js.Any])
  }
}
