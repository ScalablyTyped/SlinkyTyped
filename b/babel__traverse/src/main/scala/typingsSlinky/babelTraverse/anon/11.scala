package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends js.Object {
  
  var `type`: YieldExpression = js.native
}
object `11` {
  
  @scala.inline
  def apply(`type`: YieldExpression): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
    
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
    def setType(value: YieldExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
