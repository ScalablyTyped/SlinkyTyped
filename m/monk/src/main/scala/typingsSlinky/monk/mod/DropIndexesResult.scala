package typingsSlinky.monk.mod

import typingsSlinky.monk.monkNumbers.`0`
import typingsSlinky.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined monk.monk.DropIndexResult & {  msg :string | undefined} */
@js.native
trait DropIndexesResult extends js.Object {
  
  var msg: js.UndefOr[String] = js.native
  
  var nIndexesWas: Double = js.native
  
  var ok: `1` | `0` = js.native
}
object DropIndexesResult {
  
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | `0`): DropIndexesResult = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexesResult]
  }
  
  @scala.inline
  implicit class DropIndexesResultOps[Self <: DropIndexesResult] (val x: Self) extends AnyVal {
    
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
    def setNIndexesWas(value: Double): Self = this.set("nIndexesWas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: `1` | `0`): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
  }
}
