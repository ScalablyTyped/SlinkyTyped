package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Maybe
import typingsSlinky.sanctuary.mod.NonNegativeInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
  var name: String = js.native
  
  var namespace: Maybe[String] = js.native
  
  var version: NonNegativeInteger = js.native
}
object Name {
  
  @scala.inline
  def apply(name: String, namespace: Maybe[String], version: NonNegativeInteger): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Maybe[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: NonNegativeInteger): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
