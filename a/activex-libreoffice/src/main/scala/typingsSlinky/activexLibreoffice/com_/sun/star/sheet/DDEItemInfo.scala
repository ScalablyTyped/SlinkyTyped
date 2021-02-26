package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an item of a DDE connection.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain cached result sets.
  * @since OOo 3.1
  */
@js.native
trait DDEItemInfo extends StObject {
  
  /** The name of the DDE item. */
  var Item: String = js.native
  
  /** The results of the item cached from the last update of the DDE link if available. This sequence may be empty. */
  var Results: SafeArray[SafeArray[_]] = js.native
}
object DDEItemInfo {
  
  @scala.inline
  def apply(Item: String, Results: SafeArray[SafeArray[_]]): DDEItemInfo = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDEItemInfo]
  }
  
  @scala.inline
  implicit class DDEItemInfoMutableBuilder[Self <: DDEItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: SafeArray[SafeArray[_]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
  }
}
