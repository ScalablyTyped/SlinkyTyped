package typingsSlinky.fnvDashLite.fnvDashLiteMod

import typingsSlinky.fnvDashLite.fnvDashLiteStrings.base36
import typingsSlinky.fnvDashLite.fnvDashLiteStrings.base64
import typingsSlinky.fnvDashLite.fnvDashLiteStrings.base64Url
import typingsSlinky.fnvDashLite.fnvDashLiteStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FNV extends js.Object {
  def digest(): js.Array[Double] = js.native
  @JSName("digest")
  def digest_base36(`type`: base36): String = js.native
  @JSName("digest")
  def digest_base64(`type`: base64): String = js.native
  @JSName("digest")
  def digest_base64Url(`type`: base64Url): String = js.native
  @JSName("digest")
  def digest_hex(`type`: hex): String = js.native
  def update(input: Input): this.type = js.native
}

