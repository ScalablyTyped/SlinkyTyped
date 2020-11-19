package typingsSlinky.formol.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  
  var no: ReactElement = js.native
  
  var yes: ReactElement = js.native
}
object Dictk {
  
  @scala.inline
  def apply(): Dictk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkOps[Self <: Dictk] (val x: Self) extends AnyVal {
    
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
    def setNo(value: ReactElement): Self = this.set("no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo: Self = this.set("no", js.undefined)
    
    @scala.inline
    def setYes(value: ReactElement): Self = this.set("yes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
  }
}
