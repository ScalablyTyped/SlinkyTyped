package typingsSlinky.bent.mod

import typingsSlinky.bent.bentStrings.buffer
import typingsSlinky.bent.bentStrings.json
import typingsSlinky.bent.bentStrings.string
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  def apply(baseUrl: String, `type`: json, args: Options*): RequestFunction[Json] = js.native
  // Method or url first
  def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = js.native
  def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  def apply(`type`: json, args: Options*): RequestFunction[Json] = js.native
  // Type first
  def apply(`type`: string, args: Options*): RequestFunction[String] = js.native
}

