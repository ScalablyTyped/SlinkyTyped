package typingsSlinky.matrixAppservice

import typingsSlinky.matrixAppservice.anon.HomeserverToken
import typingsSlinky.matrixAppservice.appServiceRegistrationMod.AppServiceOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class AppService protected ()
    extends typingsSlinky.matrixAppservice.appServiceMod.AppService {
    /**
      * Construct a new application service.
      * @constructor
      * @param {Object} config Configuration for this service.
      * @param {String} config.homeserverToken The incoming HS token to expect. Must
      * be set prior to calling listen(port).
      * @param {Number} config.httpMaxSizeBytes The max number of bytes allowed on an
      * incoming HTTP request. Default: 5000000.
      * @throws If a homeserver token is not supplied.
      */
    def this(config: HomeserverToken) = this()
  }
  
  @js.native
  class AppServiceRegistration ()
    extends typingsSlinky.matrixAppservice.appServiceRegistrationMod.AppServiceRegistration {
    def this(url: String) = this()
  }
  /* static members */
  @js.native
  object AppServiceRegistration extends js.Object {
    
    /**
      * Convert a JSON object to an AppServiceRegistration object.
      * @static
      * @param obj The registration object
      * @return The registration.
      */
    def fromObject(obj: AppServiceOutput): typingsSlinky.matrixAppservice.appServiceRegistrationMod.AppServiceRegistration = js.native
    
    /**
      * Generate a random token.
      * @return {string} A randomly generated token.
      */
    def generateToken(): String = js.native
  }
}
