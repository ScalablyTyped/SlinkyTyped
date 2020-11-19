package typingsSlinky.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetFileInfoSuccessResult extends js.Object {
  
  var digest: String = js.native
  
  var size: Double = js.native
}
object IGetFileInfoSuccessResult {
  
  @scala.inline
  def apply(digest: String, size: Double): IGetFileInfoSuccessResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoSuccessResult]
  }
  
  @scala.inline
  implicit class IGetFileInfoSuccessResultOps[Self <: IGetFileInfoSuccessResult] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
