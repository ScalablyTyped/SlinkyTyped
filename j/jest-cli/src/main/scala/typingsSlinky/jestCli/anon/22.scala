package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.`This option sets the URL for the jsdom environmentDot`
import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22` extends js.Object {
  
  val description: `This option sets the URL for the jsdom environmentDot` = js.native
  
  val `type`: string = js.native
}
object `22` {
  
  @scala.inline
  def apply(description: `This option sets the URL for the jsdom environmentDot`, `type`: string): `22` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: `This option sets the URL for the jsdom environmentDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
