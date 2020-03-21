package typingsSlinky.reactAlert.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertManager extends js.Object {
  var alerts: js.Array[AlertComponentProps] = js.native
  var root: js.UndefOr[HTMLElement] = js.native
  def error(): AlertComponentProps = js.native
  def error(message: TagMod[Any]): AlertComponentProps = js.native
  def error(message: TagMod[Any], options: AlertCustomOptions): AlertComponentProps = js.native
  def info(): AlertComponentProps = js.native
  def info(message: TagMod[Any]): AlertComponentProps = js.native
  def info(message: TagMod[Any], options: AlertCustomOptions): AlertComponentProps = js.native
  def remove(alert: AlertComponentProps): Unit = js.native
  def show(): AlertComponentProps = js.native
  def show(message: TagMod[Any]): AlertComponentProps = js.native
  def show(message: TagMod[Any], options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def success(): AlertComponentProps = js.native
  def success(message: TagMod[Any]): AlertComponentProps = js.native
  def success(message: TagMod[Any], options: AlertCustomOptions): AlertComponentProps = js.native
}

