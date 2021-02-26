package typingsSlinky.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSetting extends StObject {
  
  /**
    * Clear all content setting rules set by this extension.
    * @param callback If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def clear(details: ClearDetails): Unit = js.native
  def clear(details: ClearDetails, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Gets the current content setting for a given pair of URLs.
    * @param callback The callback parameter should be a function that looks like this:
    * function(object details) {...};
    */
  def get(details: GetDetails, callback: js.Function1[/* details */ ReturnedDetails, Unit]): Unit = js.native
  
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function(array of ResourceIdentifier resourceIdentifiers) {...};
    * Parameter resourceIdentifiers: A list of resource identifiers for this content type, or undefined if this content type does not use resource identifiers.
    */
  def getResourceIdentifiers(callback: js.Function1[/* resourceIdentifiers */ js.UndefOr[js.Array[ResourceIdentifier]], Unit]): Unit = js.native
  
  /**
    * Applies a new content setting rule.
    * @param callback If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function0[Unit]): Unit = js.native
}
