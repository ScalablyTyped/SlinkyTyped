package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathToObjectIdentifiers extends StObject {
  
  /**
    * Lists ObjectIdentifiers starting from directory root to the object in the request.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
  
  /**
    * The path that is used to identify the object starting from directory root.
    */
  var Path: js.UndefOr[PathString] = js.native
}
object PathToObjectIdentifiers {
  
  @scala.inline
  def apply(): PathToObjectIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToObjectIdentifiers]
  }
  
  @scala.inline
  implicit class PathToObjectIdentifiersMutableBuilder[Self <: PathToObjectIdentifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    @scala.inline
    def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: PathString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
