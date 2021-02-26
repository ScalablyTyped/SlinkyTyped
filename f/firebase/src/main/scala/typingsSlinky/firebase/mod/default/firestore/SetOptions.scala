package typingsSlinky.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions extends StObject {
  
  /**
    * Changes the behavior of a set() call to only replace the values specified
    * in its data argument. Fields omitted from the set() call remain
    * untouched.
    */
  val merge: js.UndefOr[Boolean] = js.native
  
  /**
    * Changes the behavior of set() calls to only replace the specified field
    * paths. Any field path that is not specified is ignored and remains
    * untouched.
    */
  val mergeFields: js.UndefOr[js.Array[String | typingsSlinky.firebase.mod.firebase.firestore.FieldPath]] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  @scala.inline
  implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFields(value: js.Array[String | typingsSlinky.firebase.mod.firebase.firestore.FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    @scala.inline
    def setMergeFieldsVarargs(value: (String | typingsSlinky.firebase.mod.firebase.firestore.FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value :_*))
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
