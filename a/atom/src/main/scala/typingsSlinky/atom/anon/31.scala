package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `31` extends js.Object {
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
}
object `31` {
  
  @scala.inline
  def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit class `31Ops`[Self <: `31`] (val x: Self) extends AnyVal {
    
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
    def setIncludeNonWordCharacters(value: Boolean): Self = this.set("includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNonWordCharacters: Self = this.set("includeNonWordCharacters", js.undefined)
  }
}
