package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.apolloProtobufjs.mod.AnyNestedObject because Already inherited */ @js.native
trait IService extends INamespace {
  
  /** Method descriptors */
  var methods: StringDictionary[js.UndefOr[IMethod]] = js.native
}
object IService {
  
  @scala.inline
  def apply(methods: StringDictionary[js.UndefOr[IMethod]]): IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[IService]
  }
  
  @scala.inline
  implicit class IServiceOps[Self <: IService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethods(value: StringDictionary[js.UndefOr[IMethod]]): Self = this.set("methods", value.asInstanceOf[js.Any])
  }
}
