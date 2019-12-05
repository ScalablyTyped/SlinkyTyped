package typingsSlinky.nodeDashFetch.nodeDashFetchMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.nodeDashFetch.Anon_Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body () extends js.Object {
  def this(body: js.Any) = this()
  def this(body: js.Any, opts: Anon_Size) = this()
  var body: ReadableStream = js.native
  var bodyUsed: Boolean = js.native
  var size: Double = js.native
  var timeout: Double = js.native
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Buffer] = js.native
  def buffer(): js.Promise[Buffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
  def textConverted(): js.Promise[String] = js.native
}

