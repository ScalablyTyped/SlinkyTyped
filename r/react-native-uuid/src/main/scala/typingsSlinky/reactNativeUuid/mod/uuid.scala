package typingsSlinky.reactNativeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uuid extends js.Object {
  def noConflict(): String = js.native
  def parse(id: String): js.typedarray.ArrayBuffer = js.native
  def parse(id: String, buffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = js.native
  def parse(id: String, buffer: js.typedarray.ArrayBuffer, offset: Double): js.typedarray.ArrayBuffer = js.native
  def unparse(): String = js.native
  def unparse(buffer: js.typedarray.ArrayBuffer): String = js.native
  def unparse(buffer: js.typedarray.ArrayBuffer, offset: Double): String = js.native
  def v1(): String = js.native
  def v1(options: typingsSlinky.reactNativeUuid.mod.v1): String = js.native
  def v1(options: typingsSlinky.reactNativeUuid.mod.v1, buffer: js.typedarray.ArrayBuffer): String = js.native
  def v1(options: typingsSlinky.reactNativeUuid.mod.v1, buffer: js.typedarray.ArrayBuffer, offset: Double): String = js.native
  def v4(): String = js.native
  def v4(options: typingsSlinky.reactNativeUuid.mod.v4): String = js.native
  def v4(options: typingsSlinky.reactNativeUuid.mod.v4, buffer: js.typedarray.ArrayBuffer): String = js.native
  def v4(options: typingsSlinky.reactNativeUuid.mod.v4, buffer: js.typedarray.ArrayBuffer, offset: Double): String = js.native
}

