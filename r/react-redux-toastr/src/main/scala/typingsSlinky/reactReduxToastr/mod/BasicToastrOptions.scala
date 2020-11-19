package typingsSlinky.reactReduxToastr.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicToastrOptions extends js.Object {
  
  var attention: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  
  var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var progressBar: js.UndefOr[Boolean] = js.native
  
  var removeOnHover: js.UndefOr[Boolean] = js.native
  
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  var timeOut: js.UndefOr[Double] = js.native
  
  var transitionIn: js.UndefOr[transitionInType] = js.native
  
  var transitionOut: js.UndefOr[transitionOutType] = js.native
}
object BasicToastrOptions {
  
  @scala.inline
  def apply(): BasicToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicToastrOptions]
  }
  
  @scala.inline
  implicit class BasicToastrOptionsOps[Self <: BasicToastrOptions] (val x: Self) extends AnyVal {
    
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
    def setAttention(value: Boolean): Self = this.set("attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttention: Self = this.set("attention", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentReactElement(value: ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponent(value: ReactComponentClass[js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setGetState(value: /* state */ ToastrState => ToastrState): Self = this.set("getState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOnCloseButtonClick(value: () => Unit): Self = this.set("onCloseButtonClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCloseButtonClick: Self = this.set("onCloseButtonClick", js.undefined)
    
    @scala.inline
    def setOnHideComplete(value: () => Unit): Self = this.set("onHideComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHideComplete: Self = this.set("onHideComplete", js.undefined)
    
    @scala.inline
    def setOnShowComplete(value: () => Unit): Self = this.set("onShowComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowComplete: Self = this.set("onShowComplete", js.undefined)
    
    @scala.inline
    def setOnToastrClick(value: () => Unit): Self = this.set("onToastrClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnToastrClick: Self = this.set("onToastrClick", js.undefined)
    
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    
    @scala.inline
    def setRemoveOnHover(value: Boolean): Self = this.set("removeOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnHover: Self = this.set("removeOnHover", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    
    @scala.inline
    def setTransitionIn(value: transitionInType): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionIn: Self = this.set("transitionIn", js.undefined)
    
    @scala.inline
    def setTransitionOut(value: transitionOutType): Self = this.set("transitionOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionOut: Self = this.set("transitionOut", js.undefined)
  }
}
