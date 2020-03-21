package typingsSlinky.hapiHawk.utilsMod

import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(req: RequestOptions): CustomRequest = js.native
  def apply(req: RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
  def apply(req: typingsSlinky.node.httpsMod.RequestOptions): CustomRequest = js.native
  def apply(req: typingsSlinky.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
}

