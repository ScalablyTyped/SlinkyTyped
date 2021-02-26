package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamespace extends AnyNestedObject {
  
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[js.UndefOr[AnyNestedObject]]] = js.native
  
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.native
}
object INamespace {
  
  @scala.inline
  def apply(): INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INamespace]
  }
  
  @scala.inline
  implicit class INamespaceMutableBuilder[Self <: INamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNested(value: StringDictionary[js.UndefOr[AnyNestedObject]]): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[js.UndefOr[js.Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
