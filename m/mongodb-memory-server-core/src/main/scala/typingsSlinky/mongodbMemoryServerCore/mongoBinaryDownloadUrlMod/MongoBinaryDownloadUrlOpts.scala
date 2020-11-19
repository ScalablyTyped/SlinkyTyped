package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import typingsSlinky.mongodbMemoryServerCore.getosMod.AnyOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoBinaryDownloadUrlOpts extends js.Object {
  
  var arch: String = js.native
  
  var os: js.UndefOr[AnyOS] = js.native
  
  var platform: String = js.native
  
  var version: String = js.native
}
object MongoBinaryDownloadUrlOpts {
  
  @scala.inline
  def apply(arch: String, platform: String, version: String): MongoBinaryDownloadUrlOpts = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
  }
  
  @scala.inline
  implicit class MongoBinaryDownloadUrlOptsOps[Self <: MongoBinaryDownloadUrlOpts] (val x: Self) extends AnyVal {
    
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: AnyOS): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
  }
}
