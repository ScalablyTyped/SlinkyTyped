package typingsSlinky.antDesignReactNative.operationContainerMod

import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationContainerProps extends js.Object {
  
  var actions: js.Array[Action[TextStyle]] = js.native
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.native
}
object OperationContainerProps {
  
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]]): OperationContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationContainerProps]
  }
  
  @scala.inline
  implicit class OperationContainerPropsOps[Self <: OperationContainerProps] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: Action[TextStyle]*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[Action[TextStyle]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnBackHandler(value: () => Boolean): Self = this.set("onBackHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBackHandler: Self = this.set("onBackHandler", js.undefined)
  }
}
