package typingsSlinky.packageJson.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageNotFoundErrorClass extends Error {
  
  @JSName("name")
  val name_PackageNotFoundErrorClass: typingsSlinky.packageJson.packageJsonStrings.PackageNotFoundError = js.native
}
object PackageNotFoundErrorClass {
  
  @scala.inline
  def apply(message: String, name: typingsSlinky.packageJson.packageJsonStrings.PackageNotFoundError): PackageNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageNotFoundErrorClass]
  }
  
  @scala.inline
  implicit class PackageNotFoundErrorClassOps[Self <: PackageNotFoundErrorClass] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.packageJson.packageJsonStrings.PackageNotFoundError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
