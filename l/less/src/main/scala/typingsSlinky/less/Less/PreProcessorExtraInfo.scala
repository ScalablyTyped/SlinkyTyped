package typingsSlinky.less.Less

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreProcessorExtraInfo extends js.Object {
  
  var context: typingsSlinky.less.anon.PluginManager = js.native
  
  var fileInfo: RootFileInfo = js.native
  
  var imports: StringDictionary[js.Any] = js.native
}
object PreProcessorExtraInfo {
  
  @scala.inline
  def apply(
    context: typingsSlinky.less.anon.PluginManager,
    fileInfo: RootFileInfo,
    imports: StringDictionary[js.Any]
  ): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
  
  @scala.inline
  implicit class PreProcessorExtraInfoOps[Self <: PreProcessorExtraInfo] (val x: Self) extends AnyVal {
    
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
    def setContext(value: typingsSlinky.less.anon.PluginManager): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInfo(value: RootFileInfo): Self = this.set("fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImports(value: StringDictionary[js.Any]): Self = this.set("imports", value.asInstanceOf[js.Any])
  }
}
