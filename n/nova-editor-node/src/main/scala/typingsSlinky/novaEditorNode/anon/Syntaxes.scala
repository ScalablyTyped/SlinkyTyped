package typingsSlinky.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Syntaxes extends js.Object {
  
  var syntaxes: js.Array[String] = js.native
}
object Syntaxes {
  
  @scala.inline
  def apply(syntaxes: js.Array[String]): Syntaxes = {
    val __obj = js.Dynamic.literal(syntaxes = syntaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syntaxes]
  }
  
  @scala.inline
  implicit class SyntaxesOps[Self <: Syntaxes] (val x: Self) extends AnyVal {
    
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
    def setSyntaxesVarargs(value: String*): Self = this.set("syntaxes", js.Array(value :_*))
    
    @scala.inline
    def setSyntaxes(value: js.Array[String]): Self = this.set("syntaxes", value.asInstanceOf[js.Any])
  }
}
