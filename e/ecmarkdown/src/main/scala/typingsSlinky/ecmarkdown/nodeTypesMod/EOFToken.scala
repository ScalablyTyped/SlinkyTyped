package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownBooleans.`true`
import typingsSlinky.ecmarkdown.ecmarkdownStrings.EOF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EOFToken extends Token {
  
  var done: `true` = js.native
  
  var location: js.UndefOr[LocationRange] = js.native
  
  var name: EOF = js.native
}
object EOFToken {
  
  @scala.inline
  def apply(done: `true`, name: EOF): EOFToken = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EOFToken]
  }
  
  @scala.inline
  implicit class EOFTokenOps[Self <: EOFToken] (val x: Self) extends AnyVal {
    
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
    def setDone(value: `true`): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EOF): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
