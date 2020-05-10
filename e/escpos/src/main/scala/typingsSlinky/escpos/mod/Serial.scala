package typingsSlinky.escpos.mod

import typingsSlinky.escpos.AnonAutoOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Serial")
@js.native
class Serial protected () extends Adapter {
  def this(port: Double) = this()
  def this(port: Double, options: AnonAutoOpen) = this()
  def close(): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit], timeout: Double): Serial = js.native
  def open(): Serial = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Serial = js.native
}

