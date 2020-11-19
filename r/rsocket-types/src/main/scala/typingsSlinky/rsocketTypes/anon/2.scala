package typingsSlinky.rsocketTypes.anon

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends ConnectionStatus {
  
  var kind: CLOSED = js.native
}
object `2` {
  
  @scala.inline
  def apply(kind: CLOSED): `2` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setKind(value: CLOSED): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
