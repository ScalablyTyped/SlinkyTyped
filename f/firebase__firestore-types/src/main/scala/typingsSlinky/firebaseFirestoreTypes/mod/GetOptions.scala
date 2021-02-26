package typingsSlinky.firebaseFirestoreTypes.mod

import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.cache
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.default
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptions extends StObject {
  
  val source: js.UndefOr[default | server | cache] = js.native
}
object GetOptions {
  
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  @scala.inline
  implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
