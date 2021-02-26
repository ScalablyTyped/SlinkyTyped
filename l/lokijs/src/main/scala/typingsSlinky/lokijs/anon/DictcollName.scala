package typingsSlinky.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lokijs.lokijsStrings.destructured
import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictcollName
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.native
  
  var throttledSaves: js.UndefOr[Boolean] = js.native
}
object DictcollName {
  
  @scala.inline
  def apply(): DictcollName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictcollName]
  }
  
  @scala.inline
  implicit class DictcollNameMutableBuilder[Self <: DictcollName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetainDirtyFlags(value: Boolean): Self = StObject.set(x, "retainDirtyFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainDirtyFlagsUndefined: Self = StObject.set(x, "retainDirtyFlags", js.undefined)
    
    @scala.inline
    def setSerializationMethod(value: normal | pretty | destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    @scala.inline
    def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
    
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottledSavesUndefined: Self = StObject.set(x, "throttledSaves", js.undefined)
  }
}
