package typingsSlinky.openapiFramework.typesMod

import typingsSlinky.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIFrameworkPathContext extends js.Object {
  
  var basePaths: js.Array[default] = js.native
  
  def getApiDoc(): js.Any = js.native
  
  def getPathDoc(): js.Any = js.native
}
object OpenAPIFrameworkPathContext {
  
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: () => js.Any, getPathDoc: () => js.Any): OpenAPIFrameworkPathContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc), getPathDoc = js.Any.fromFunction0(getPathDoc))
    __obj.asInstanceOf[OpenAPIFrameworkPathContext]
  }
  
  @scala.inline
  implicit class OpenAPIFrameworkPathContextOps[Self <: OpenAPIFrameworkPathContext] (val x: Self) extends AnyVal {
    
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
    def setBasePathsVarargs(value: default*): Self = this.set("basePaths", js.Array(value :_*))
    
    @scala.inline
    def setBasePaths(value: js.Array[default]): Self = this.set("basePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetApiDoc(value: () => js.Any): Self = this.set("getApiDoc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPathDoc(value: () => js.Any): Self = this.set("getPathDoc", js.Any.fromFunction0(value))
  }
}
