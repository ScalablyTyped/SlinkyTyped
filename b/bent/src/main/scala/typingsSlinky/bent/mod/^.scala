package typingsSlinky.bent.mod

import typingsSlinky.bent.bentStrings.buffer
import typingsSlinky.bent.bentStrings.json
import typingsSlinky.bent.bentStrings.string
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  // Method or url first
  def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = js.native
  def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = js.native
  // Type first
  def apply(`type`: string, args: Options*): RequestFunction[String] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[T /* <: ValidResponse */](args: Options*): RequestFunction[T] = js.native
  def apply[T /* <: Json */](baseUrl: String, `type`: json, args: Options*): // tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[T /* <: Json */](`type`: json, args: Options*): RequestFunction[T] = js.native
}
