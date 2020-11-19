package typingsSlinky.reactNotifyToast.mod

import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.custom
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.error
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.success
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait reactNotifyToast extends js.Object {
  
  def createShowQueue(): reactNotifyToast = js.native
  
  def hide(): Unit = js.native
  
  def show(text: String): Unit = js.native
  def show(
    text: String,
    `type`: js.UndefOr[scala.Nothing],
    timeout: js.UndefOr[scala.Nothing],
    color: reactNotifyToastColor
  ): Unit = js.native
  def show(text: String, `type`: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def show(text: String, `type`: js.UndefOr[scala.Nothing], timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom, timeout: Double): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error, timeout: Double): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success, timeout: Double): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning, timeout: Double): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning, timeout: Double, color: reactNotifyToastColor): Unit = js.native
}
