package typingsSlinky.recoil.anon

import typingsSlinky.recoil.mod.Loadable
import typingsSlinky.recoil.recoilStrings.hasError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  state :'hasError',   contents :std.Error}> */
@js.native
trait ReadonlystatehasErrorcont
  extends Loadable[js.Any] {
  
  val contents: js.Error = js.native
  
  val state: hasError = js.native
}
object ReadonlystatehasErrorcont {
  
  @scala.inline
  def apply(contents: js.Error, state: hasError): ReadonlystatehasErrorcont = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlystatehasErrorcont]
  }
  
  @scala.inline
  implicit class ReadonlystatehasErrorcontOps[Self <: ReadonlystatehasErrorcont] (val x: Self) extends AnyVal {
    
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
    def setContents(value: js.Error): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: hasError): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
