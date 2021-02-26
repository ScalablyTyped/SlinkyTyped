package typingsSlinky.reactReduxToastr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactReduxToastr.anon.CancelText
import typingsSlinky.reactReduxToastr.mod.ReduxToastrProps
import typingsSlinky.reactReduxToastr.mod.ToastrState
import typingsSlinky.reactReduxToastr.mod.default
import typingsSlinky.reactReduxToastr.mod.positionType
import typingsSlinky.reactReduxToastr.mod.transitionInType
import typingsSlinky.reactReduxToastr.mod.transitionOutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactReduxToastr {
  
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnToastrClick(value: Boolean): this.type = set("closeOnToastrClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmOptions(value: CancelText): this.type = set("confirmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Any): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: positionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventDuplicates(value: Boolean): this.type = set("preventDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressBar(value: Boolean): this.type = set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeOut(value: Double): this.type = set("timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toastr(value: ToastrState): this.type = set("toastr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionIn(value: transitionInType): this.type = set("transitionIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionOut(value: transitionOutType): this.type = set("transitionOut", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactReduxToastr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReduxToastrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
