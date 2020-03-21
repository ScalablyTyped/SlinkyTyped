package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "KdbxUuid")
@js.native
class KdbxUuid protected () extends js.Object {
  def this(ab: String) = this()
  def this(ab: scala.scalajs.js.typedarray.ArrayBuffer) = this()
  var empty: Boolean = js.native
  var id: js.UndefOr[String] = js.native
  def equals(other: KdbxUuid): Boolean = js.native
  def toBytes(): js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

/* static members */
@JSImport("kdbxweb", "KdbxUuid")
@js.native
object KdbxUuid extends js.Object {
  def random(): KdbxUuid = js.native
}

