package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ArgumentPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentPlaceholder_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_ArgumentPlaceholder_ : ArgumentPlaceholder = js.native
}
object ArgumentPlaceholder_ {
  
  @scala.inline
  def apply(`type`: ArgumentPlaceholder): ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentPlaceholder_]
  }
  
  @scala.inline
  implicit class ArgumentPlaceholder_Ops[Self <: ArgumentPlaceholder_] (val x: Self) extends AnyVal {
    
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
    def setType(value: ArgumentPlaceholder): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
