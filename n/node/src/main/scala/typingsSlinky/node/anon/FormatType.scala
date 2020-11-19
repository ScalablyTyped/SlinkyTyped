package typingsSlinky.node.anon

import typingsSlinky.node.cryptoMod.KeyFormat
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatType[PubF /* <: KeyFormat */] extends js.Object {
  
  var format: PubF = js.native
  
  var `type`: spki = js.native
}
object FormatType {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
  
  @scala.inline
  implicit class FormatTypeOps[Self <: FormatType[_], PubF /* <: KeyFormat */] (val x: Self with FormatType[PubF]) extends AnyVal {
    
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
    def setFormat(value: PubF): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: spki): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
