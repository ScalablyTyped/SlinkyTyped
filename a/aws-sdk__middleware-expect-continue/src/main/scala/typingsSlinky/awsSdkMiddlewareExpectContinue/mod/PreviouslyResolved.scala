package typingsSlinky.awsSdkMiddlewareExpectContinue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviouslyResolved extends js.Object {
  
  var runtime: String = js.native
}
object PreviouslyResolved {
  
  @scala.inline
  def apply(runtime: String): PreviouslyResolved = {
    val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviouslyResolved]
  }
  
  @scala.inline
  implicit class PreviouslyResolvedOps[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
    
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
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
  }
}
