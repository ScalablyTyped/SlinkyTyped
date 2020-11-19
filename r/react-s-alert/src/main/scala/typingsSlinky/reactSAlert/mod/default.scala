package typingsSlinky.reactSAlert.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSAlert.mod.SAlert.SAlertConfigProps
import typingsSlinky.reactSAlert.mod.SAlert.SAlertProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-s-alert", JSImport.Default)
@js.native
class default ()
  extends Component[SAlertProps, js.Object, js.Any]
@JSImport("react-s-alert", JSImport.Default)
@js.native
object default extends js.Object {
  
  def close(id: Double): Unit = js.native
  
  def closeAll(): Unit = js.native
  
  def error(): Double = js.native
  def error(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
  def error(msg: String): Double = js.native
  def error(msg: String, data: SAlertConfigProps): Double = js.native
  
  def info(): Double = js.native
  def info(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
  def info(msg: String): Double = js.native
  def info(msg: String, data: SAlertConfigProps): Double = js.native
  
  def success(): Double = js.native
  def success(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
  def success(msg: String): Double = js.native
  def success(msg: String, data: SAlertConfigProps): Double = js.native
  
  def warning(): Double = js.native
  def warning(msg: js.UndefOr[scala.Nothing], data: SAlertConfigProps): Double = js.native
  def warning(msg: String): Double = js.native
  def warning(msg: String, data: SAlertConfigProps): Double = js.native
}
