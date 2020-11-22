package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliBooleans.`true`
import typingsSlinky.jestCli.jestCliStrings.`A string or array of string regexp patterns that Jest uses to detect test filesDot`
import typingsSlinky.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends js.Object {
  
  val description: `A string or array of string regexp patterns that Jest uses to detect test filesDot` = js.native
  
  val string: `true` = js.native
  
  val `type`: array = js.native
}
object `20` {
  
  @scala.inline
  def apply(
    description: `A string or array of string regexp patterns that Jest uses to detect test filesDot`,
    string: `true`,
    `type`: array
  ): `20` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20Ops`[Self <: `20`] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: `A string or array of string regexp patterns that Jest uses to detect test filesDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: `true`): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
