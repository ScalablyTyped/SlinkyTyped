package typingsSlinky.imagemagickNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIdentifyOptions extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  var srcData: Buffer = js.native
}
object IIdentifyOptions {
  
  @scala.inline
  def apply(srcData: Buffer): IIdentifyOptions = {
    val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyOptions]
  }
  
  @scala.inline
  implicit class IIdentifyOptionsOps[Self <: IIdentifyOptions] (val x: Self) extends AnyVal {
    
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
    def setSrcData(value: Buffer): Self = this.set("srcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
  }
}
