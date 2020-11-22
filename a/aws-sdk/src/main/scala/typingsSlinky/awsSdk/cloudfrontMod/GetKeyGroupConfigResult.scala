package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyGroupConfigResult extends js.Object {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.KeyGroupConfig] = js.native
}
object GetKeyGroupConfigResult {
  
  @scala.inline
  def apply(): GetKeyGroupConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyGroupConfigResult]
  }
  
  @scala.inline
  implicit class GetKeyGroupConfigResultOps[Self <: GetKeyGroupConfigResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = this.set("KeyGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyGroupConfig: Self = this.set("KeyGroupConfig", js.undefined)
  }
}
