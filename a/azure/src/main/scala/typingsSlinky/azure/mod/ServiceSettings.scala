package typingsSlinky.azure.mod

import typingsSlinky.node.urlMod.Url
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ServiceSettings")
@js.native
object ServiceSettings extends js.Object {
  
  var DEFAULT_PROTOCOL: String = js.native
  
  def allRequired(args: js.Any*): ValidatorFunction = js.native
  
  def atLeastOne(args: js.Any*): ValidatorFunction = js.native
  
  def getValidator(requirements: Dictionary[Requirement], isRequired: Boolean, atLeastOne: Boolean): ValidatorFunction = js.native
  
  def matchedSpecification(settings: Dictionary[_]): Boolean = js.native
  
  def noMatchConnectionString(connectionString: String): Unit = js.native
  
  def noMatchSettings(settings: js.Any): Unit = js.native
  
  def optional(args: js.Any*): ValidatorFunction = js.native
  
  def parseAndValidateKeys(connectionString: String, validKeys: js.Array[String]): js.Array[String] = js.native
  
  def parseHost(uri: String): Url = js.native
  
  def setting(name: String): js.Array[String] = js.native
  
  def settingWithFunc(name: String, predicate: js.Function): js.Array[Requirement] = js.native
  
  @js.native
  class NoMatchError () extends Error {
    def this(message: String) = this()
    def this(message: String, constr: js.Any) = this()
    
    var constr: js.Any = js.native
  }
}
