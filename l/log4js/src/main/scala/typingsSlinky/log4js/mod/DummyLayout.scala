package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.dummy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DummyLayout extends Layout {
  
  var `type`: dummy = js.native
}
object DummyLayout {
  
  @scala.inline
  def apply(`type`: dummy): DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DummyLayout]
  }
  
  @scala.inline
  implicit class DummyLayoutOps[Self <: DummyLayout] (val x: Self) extends AnyVal {
    
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
    def setType(value: dummy): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
