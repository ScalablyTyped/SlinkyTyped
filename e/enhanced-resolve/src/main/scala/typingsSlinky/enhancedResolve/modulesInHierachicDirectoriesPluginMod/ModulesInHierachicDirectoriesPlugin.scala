package typingsSlinky.enhancedResolve.modulesInHierachicDirectoriesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModulesInHierachicDirectoriesPlugin extends js.Object {
  
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
  
  var directories: js.Array[String] = js.native
  
  var source: String = js.native
  
  var target: String = js.native
}
object ModulesInHierachicDirectoriesPlugin {
  
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    directories: js.Array[String],
    source: String,
    target: String
  ): ModulesInHierachicDirectoriesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), directories = directories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
  }
  
  @scala.inline
  implicit class ModulesInHierachicDirectoriesPluginOps[Self <: ModulesInHierachicDirectoriesPlugin] (val x: Self) extends AnyVal {
    
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
    def setApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirectoriesVarargs(value: String*): Self = this.set("directories", js.Array(value :_*))
    
    @scala.inline
    def setDirectories(value: js.Array[String]): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
