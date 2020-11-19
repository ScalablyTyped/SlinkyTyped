package typingsSlinky.blueprintjsCore.toasterMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.anon.Toasts
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
class Toaster ()
  extends AbstractPureComponent2[IToasterProps, IToasterState, js.Object]
     with IToaster {
  
  var createToastOptions: js.Any = js.native
  
  def dismiss(key: String, timeoutExpired: Boolean): Unit = js.native
  
  var dismissIfAtLimit: js.Any = js.native
  
  var getDismissHandler: js.Any = js.native
  
  var getPositionClasses: js.Any = js.native
  
  var handleClose: js.Any = js.native
  
  var isNewToastKey: js.Any = js.native
  
  var renderToast: js.Any = js.native
  
  @JSName("state")
  var state_Toaster: Toasts = js.native
  
  var toastId: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
object Toaster extends js.Object {
  
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  def create(): IToaster = js.native
  def create(props: js.UndefOr[scala.Nothing], container: HTMLElement): IToaster = js.native
  def create(props: IToasterProps): IToaster = js.native
  def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
  
  var defaultProps: IToasterProps = js.native
  
  var displayName: String = js.native
}
