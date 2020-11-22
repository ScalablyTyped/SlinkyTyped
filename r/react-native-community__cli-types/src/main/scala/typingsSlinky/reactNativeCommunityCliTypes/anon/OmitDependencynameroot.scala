package typingsSlinky.reactNativeCommunityCliTypes.anon

import typingsSlinky.reactNativeCommunityCliTypes.mod.InquirerPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Dependency, 'name' | 'root'> */
@js.native
trait OmitDependencynameroot extends js.Object {
  
  var assets: js.Array[String] = js.native
  
  var hooks: Postlink = js.native
  
  var params: js.Array[InquirerPrompt] = js.native
  
  var platforms: Dictkey = js.native
}
object OmitDependencynameroot {
  
  @scala.inline
  def apply(assets: js.Array[String], hooks: Postlink, params: js.Array[InquirerPrompt], platforms: Dictkey): OmitDependencynameroot = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDependencynameroot]
  }
  
  @scala.inline
  implicit class OmitDependencynamerootOps[Self <: OmitDependencynameroot] (val x: Self) extends AnyVal {
    
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
    def setAssetsVarargs(value: String*): Self = this.set("assets", js.Array(value :_*))
    
    @scala.inline
    def setAssets(value: js.Array[String]): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: Postlink): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: InquirerPrompt*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[InquirerPrompt]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatforms(value: Dictkey): Self = this.set("platforms", value.asInstanceOf[js.Any])
  }
}
