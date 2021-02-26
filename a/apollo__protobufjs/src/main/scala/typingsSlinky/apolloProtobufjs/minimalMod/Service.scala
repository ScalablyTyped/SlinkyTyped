package typingsSlinky.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Service")
@js.native
class Service protected ()
  extends typingsSlinky.apolloProtobufjs.mod.Service {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.UndefOr[js.Any]]) = this()
}
/* static members */
object Service {
  
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("@apollo/protobufjs/minimal", "Service.fromJSON")
  @js.native
  def fromJSON(name: String, json: IService): typingsSlinky.apolloProtobufjs.mod.Service = js.native
}
