package typingsSlinky.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIAppServiceOptions extends MSIOptions {
  
  /**
    * @property {string} [msiApiVersion] - The api-version of the local MSI agent. Default value is "2017-09-01".
    */
  var msiApiVersion: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [msiEndpoint] - The local URL from which your app can request tokens.
    * Either provide this parameter or set the environment varaible `MSI_ENDPOINT`.
    * For example: `export MSI_ENDPOINT="http://127.0.0.1:41741/MSI/token/"`
    */
  var msiEndpoint: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [msiSecret] - The secret used in communication between your code and the local MSI agent.
    * Either provide this parameter or set the environment varaible `MSI_SECRET`.
    * For example: `export MSI_SECRET="69418689F1E342DD946CB82994CDA3CB"`
    */
  var msiSecret: js.UndefOr[String] = js.native
}
object MSIAppServiceOptions {
  
  @scala.inline
  def apply(): MSIAppServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIAppServiceOptions]
  }
  
  @scala.inline
  implicit class MSIAppServiceOptionsMutableBuilder[Self <: MSIAppServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsiApiVersion(value: String): Self = StObject.set(x, "msiApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsiApiVersionUndefined: Self = StObject.set(x, "msiApiVersion", js.undefined)
    
    @scala.inline
    def setMsiEndpoint(value: String): Self = StObject.set(x, "msiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsiEndpointUndefined: Self = StObject.set(x, "msiEndpoint", js.undefined)
    
    @scala.inline
    def setMsiSecret(value: String): Self = StObject.set(x, "msiSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsiSecretUndefined: Self = StObject.set(x, "msiSecret", js.undefined)
  }
}
