package typingsSlinky.arangodb

import typingsSlinky.arangodb.atArangodbRequestMod.RequestOptions
import typingsSlinky.arangodb.atArangodbRequestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(options: Anon_Url with RequestOptions): Response = js.native
  def apply(url: String): Response = js.native
  def apply(url: String, options: RequestOptions): Response = js.native
}

