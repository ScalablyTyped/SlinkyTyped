package typingsSlinky.babelTraverse.mod

import typingsSlinky.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HubInterface extends js.Object {
  
  def addHelper(name: String): js.Any = js.native
  
  def buildError(node: js.Any, msg: String, Error: ErrorConstructor): js.Error = js.native
  
  def getCode(): js.UndefOr[String] = js.native
  
  def getScope(): js.UndefOr[Scope] = js.native
}
object HubInterface {
  
  @scala.inline
  def apply(
    addHelper: String => js.Any,
    buildError: (js.Any, String, ErrorConstructor) => js.Error,
    getCode: () => js.UndefOr[String],
    getScope: () => js.UndefOr[Scope]
  ): HubInterface = {
    val __obj = js.Dynamic.literal(addHelper = js.Any.fromFunction1(addHelper), buildError = js.Any.fromFunction3(buildError), getCode = js.Any.fromFunction0(getCode), getScope = js.Any.fromFunction0(getScope))
    __obj.asInstanceOf[HubInterface]
  }
  
  @scala.inline
  implicit class HubInterfaceOps[Self <: HubInterface] (val x: Self) extends AnyVal {
    
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
    def setAddHelper(value: String => js.Any): Self = this.set("addHelper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildError(value: (js.Any, String, ErrorConstructor) => js.Error): Self = this.set("buildError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCode(value: () => js.UndefOr[String]): Self = this.set("getCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScope(value: () => js.UndefOr[Scope]): Self = this.set("getScope", js.Any.fromFunction0(value))
  }
}
