package typingsSlinky.rdflib.updateManagerMod

import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait docReloadType extends NamedNode {
  
  var reloadTimeCount: js.UndefOr[Double] = js.native
  
  var reloadTimeTotal: js.UndefOr[Double] = js.native
}
object docReloadType {
  
  @scala.inline
  def apply(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): docReloadType = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[docReloadType]
  }
  
  @scala.inline
  implicit class docReloadTypeOps[Self <: docReloadType] (val x: Self) extends AnyVal {
    
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
    def setReloadTimeCount(value: Double): Self = this.set("reloadTimeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadTimeCount: Self = this.set("reloadTimeCount", js.undefined)
    
    @scala.inline
    def setReloadTimeTotal(value: Double): Self = this.set("reloadTimeTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadTimeTotal: Self = this.set("reloadTimeTotal", js.undefined)
  }
}
