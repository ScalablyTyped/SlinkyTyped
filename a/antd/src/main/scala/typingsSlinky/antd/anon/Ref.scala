package typingsSlinky.antd.anon

import slinky.core.facade.ReactRef
import typingsSlinky.antd.selectMod.RefSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends js.Object {
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | ReactRef[RefSelectProps] | Null
  ] = js.native
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    
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
    def setRefRefObject(value: ReactRef[RefSelectProps]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ RefSelectProps | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | ReactRef[RefSelectProps]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
