package typingsSlinky.opentracing

import typingsSlinky.opentracing.opentracingStrings.binary
import typingsSlinky.opentracing.opentracingStrings.child_of
import typingsSlinky.opentracing.opentracingStrings.follows_from
import typingsSlinky.opentracing.opentracingStrings.http_headers
import typingsSlinky.opentracing.opentracingStrings.text_map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val FORMAT_BINARY: binary = js.native
  val FORMAT_HTTP_HEADERS: http_headers = js.native
  val FORMAT_TEXT_MAP: text_map = js.native
  val REFERENCE_CHILD_OF: child_of = js.native
  val REFERENCE_FOLLOWS_FROM: follows_from = js.native
}

