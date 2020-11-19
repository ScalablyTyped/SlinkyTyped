package typingsSlinky.fnvLite.mod

import typingsSlinky.fnvLite.fnvLiteStrings.base36
import typingsSlinky.fnvLite.fnvLiteStrings.base64
import typingsSlinky.fnvLite.fnvLiteStrings.base64Url
import typingsSlinky.fnvLite.fnvLiteStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
