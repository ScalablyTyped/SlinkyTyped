package typingsSlinky.reactNativeVideoPlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MainVer extends js.Object {
  
  var mainVer: js.UndefOr[Double] = js.native
  
  var patchVer: js.UndefOr[Double] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object MainVer {
  
  @scala.inline
  def apply(): MainVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainVer]
  }
  
  @scala.inline
  implicit class MainVerOps[Self <: MainVer] (val x: Self) extends AnyVal {
    
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
    def setMainVer(value: Double): Self = this.set("mainVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainVer: Self = this.set("mainVer", js.undefined)
    
    @scala.inline
    def setPatchVer(value: Double): Self = this.set("patchVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchVer: Self = this.set("patchVer", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
