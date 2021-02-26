package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Installation extends StObject {
  
  /** Required. All of the places within the filesystem versions of this package have been found. */
  var location: js.UndefOr[js.Array[Location]] = js.native
  
  /** Output only. The name of the installed package. */
  var name: js.UndefOr[String] = js.native
}
object Installation {
  
  @scala.inline
  def apply(): Installation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Installation]
  }
  
  @scala.inline
  implicit class InstallationMutableBuilder[Self <: Installation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Array[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Location*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
