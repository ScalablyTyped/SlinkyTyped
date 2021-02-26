package typingsSlinky.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlHandlingStrategy")
@js.native
abstract class UrlHandlingStrategy () extends StObject {
  
  /**
    * Extracts the part of the URL that should be handled by the router.
    * The rest of the URL will remain untouched.
    */
  def extract(url: UrlTree): UrlTree = js.native
  
  /**
    * Merges the URL fragment with the rest of the URL.
    */
  def merge(newUrlPart: UrlTree, rawUrl: UrlTree): UrlTree = js.native
  
  /**
    * Tells the router if this URL should be processed.
    *
    * When it returns true, the router will execute the regular navigation.
    * When it returns false, the router will set the router state to an empty state.
    * As a result, all the active components will be destroyed.
    *
    */
  def shouldProcessUrl(url: UrlTree): Boolean = js.native
}
