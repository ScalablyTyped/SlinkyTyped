package typingsSlinky.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idx extends js.Object {
  
  var idx: js.UndefOr[Double] = js.native
}
object Idx {
  
  @scala.inline
  def apply(): Idx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idx]
  }
  
  @scala.inline
  implicit class IdxOps[Self <: Idx] (val x: Self) extends AnyVal {
    
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdx: Self = this.set("idx", js.undefined)
  }
}
