package typingsSlinky.floraColossus.walkerMod

import typingsSlinky.floraColossus.depTypesMod.DepType
import typingsSlinky.floraColossus.nativeModuleTypesMod.NativeModuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends js.Object {
  
  var depType: DepType = js.native
  
  var name: String = js.native
  
  var nativeModuleType: NativeModuleType = js.native
  
  var path: String = js.native
}
object Module {
  
  @scala.inline
  def apply(depType: DepType, name: String, nativeModuleType: NativeModuleType, path: String): Module = {
    val __obj = js.Dynamic.literal(depType = depType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeModuleType = nativeModuleType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    
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
    def setDepType(value: DepType): Self = this.set("depType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeModuleType(value: NativeModuleType): Self = this.set("nativeModuleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
