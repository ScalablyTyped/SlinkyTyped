package typingsSlinky.ngtoaster.mod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToasterService extends js.Object {
  
  def clear(): Unit = js.native
  def clear(toasterId: js.UndefOr[scala.Nothing], toastId: String): Unit = js.native
  def clear(toasterId: js.UndefOr[scala.Nothing], toastId: Double): Unit = js.native
  def clear(toasterId: Double): Unit = js.native
  def clear(toasterId: Double, toastId: String): Unit = js.native
  def clear(toasterId: Double, toastId: Double): Unit = js.native
  
  def error(params: IPopParams): Unit = js.native
  def error(
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  
  def info(params: IPopParams): Unit = js.native
  def info(
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  
  def pop(params: IPopParams): Unit = js.native
  /**
    * @param type Type of toaster  -- 'error', 'info', 'wait', 'success', and 'warning'
    */
  def pop(
    `type`: js.UndefOr[String],
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  
  def success(params: IPopParams): Unit = js.native
  def success(
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  
  var toast: IToast = js.native
  
  def wait(params: IPopParams): Unit = js.native
  def wait(
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
  
  def warning(params: IPopParams): Unit = js.native
  def warning(
    title: js.UndefOr[String],
    body: js.UndefOr[String],
    timeout: js.UndefOr[Double],
    bodyOutputType: js.UndefOr[String],
    clickHandler: js.UndefOr[EventListener],
    toasterId: js.UndefOr[Double],
    showCloseButton: js.UndefOr[Boolean],
    toastId: js.UndefOr[String | Double],
    onHideCallback: js.UndefOr[IToastCallback]
  ): IPopReturn = js.native
}
