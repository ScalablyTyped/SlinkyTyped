package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.protobufjs.mod.AnyNestedObject because Already inherited */ @js.native
trait IService extends INamespace {
  
  /** Method descriptors */
  var methods: StringDictionary[IMethod] = js.native
}
object IService {
  
  @scala.inline
  def apply(methods: StringDictionary[IMethod]): IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[IService]
  }
  
  @scala.inline
  implicit class IServiceMutableBuilder[Self <: IService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethods(value: StringDictionary[IMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
  }
}
