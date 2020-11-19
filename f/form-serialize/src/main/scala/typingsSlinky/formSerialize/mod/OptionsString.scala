package typingsSlinky.formSerialize.mod

import typingsSlinky.formSerialize.formSerializeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsString extends Options[String] {
  
  @JSName("hash")
  var hash_OptionsString: `false` = js.native
}
object OptionsString {
  
  @scala.inline
  def apply(hash: `false`): OptionsString = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsString]
  }
  
  @scala.inline
  implicit class OptionsStringOps[Self <: OptionsString] (val x: Self) extends AnyVal {
    
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
    def setHash(value: `false`): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
}
