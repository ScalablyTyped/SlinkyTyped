package typingsSlinky.quadstore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triple[TermType] extends js.Object {
  
  var `object`: TermType = js.native
  
  var predicate: TermType = js.native
  
  var subject: TermType = js.native
}
object Triple {
  
  @scala.inline
  def apply[TermType](`object`: TermType, predicate: TermType, subject: TermType): Triple[TermType] = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triple[TermType]]
  }
  
  @scala.inline
  implicit class TripleOps[Self <: Triple[_], TermType] (val x: Self with Triple[TermType]) extends AnyVal {
    
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
    def setObject(value: TermType): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: TermType): Self = this.set("predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: TermType): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
}
