package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrentOptions extends js.Object {
  
  /**
    * Allow multiple chunks to be uploaded simultaneously per file
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object ConcurrentOptions {
  
  @scala.inline
  def apply(): ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentOptions]
  }
  
  @scala.inline
  implicit class ConcurrentOptionsOps[Self <: ConcurrentOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
