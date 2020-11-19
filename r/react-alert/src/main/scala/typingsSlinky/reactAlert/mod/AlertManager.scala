package typingsSlinky.reactAlert.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertManager extends js.Object {
  
  var alerts: js.Array[AlertComponentProps] = js.native
  
  def error(): AlertComponentProps = js.native
  def error(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
  def error(message: ReactElement): AlertComponentProps = js.native
  
  def info(): AlertComponentProps = js.native
  def info(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
  def info(message: ReactElement): AlertComponentProps = js.native
  
  def remove(alert: AlertComponentProps): Unit = js.native
  
  var root: js.UndefOr[HTMLElement] = js.native
  
  def show(): AlertComponentProps = js.native
  def show(message: js.UndefOr[ReactElement], options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def show(message: ReactElement): AlertComponentProps = js.native
  
  def success(): AlertComponentProps = js.native
  def success(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
  def success(message: ReactElement): AlertComponentProps = js.native
}
