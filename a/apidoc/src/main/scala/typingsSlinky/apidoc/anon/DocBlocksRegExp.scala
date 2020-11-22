package typingsSlinky.apidoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocBlocksRegExp extends js.Object {
  
  var docBlocksRegExp: js.RegExp = js.native
  
  var inlineRegExp: js.RegExp = js.native
}
object DocBlocksRegExp {
  
  @scala.inline
  def apply(docBlocksRegExp: js.RegExp, inlineRegExp: js.RegExp): DocBlocksRegExp = {
    val __obj = js.Dynamic.literal(docBlocksRegExp = docBlocksRegExp.asInstanceOf[js.Any], inlineRegExp = inlineRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocBlocksRegExp]
  }
  
  @scala.inline
  implicit class DocBlocksRegExpOps[Self <: DocBlocksRegExp] (val x: Self) extends AnyVal {
    
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
    def setDocBlocksRegExp(value: js.RegExp): Self = this.set("docBlocksRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineRegExp(value: js.RegExp): Self = this.set("inlineRegExp", value.asInstanceOf[js.Any])
  }
}
