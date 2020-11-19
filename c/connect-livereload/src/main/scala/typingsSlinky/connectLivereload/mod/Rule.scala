package typingsSlinky.connectLivereload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  def fn(w: String, s: String): String = js.native
  
  var `match`: js.RegExp = js.native
}
object Rule {
  
  @scala.inline
  def apply(fn: (String, String) => String, `match`: js.RegExp): Rule = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setFn(value: (String, String) => String): Self = this.set("fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatch(value: js.RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
  }
}
