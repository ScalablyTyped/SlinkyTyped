package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultUndefinedDescriptionString extends js.Object {
  
  val default: js.UndefOr[scala.Nothing] = js.native
  
  val description: java.lang.String = js.native
  
  val `type`: string = js.native
}
object DefaultUndefinedDescriptionString {
  
  @scala.inline
  def apply(description: java.lang.String, `type`: string): DefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedDescriptionString]
  }
  
  @scala.inline
  implicit class DefaultUndefinedDescriptionStringOps[Self <: DefaultUndefinedDescriptionString] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
