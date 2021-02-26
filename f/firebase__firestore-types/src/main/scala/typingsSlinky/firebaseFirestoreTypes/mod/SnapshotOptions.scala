package typingsSlinky.firebaseFirestoreTypes.mod

import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.estimate
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.none
import typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptions extends StObject {
  
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.native
}
object SnapshotOptions {
  
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit class SnapshotOptionsMutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerTimestamps(value: estimate | previous | none): Self = StObject.set(x, "serverTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTimestampsUndefined: Self = StObject.set(x, "serverTimestamps", js.undefined)
  }
}
