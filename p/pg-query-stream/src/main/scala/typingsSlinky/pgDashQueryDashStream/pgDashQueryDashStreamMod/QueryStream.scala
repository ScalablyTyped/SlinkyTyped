package typingsSlinky.pgDashQueryDashStream.pgDashQueryDashStreamMod

import typingsSlinky.node.Anon_End
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.pg.pgMod.Submittable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStream
  extends Readable
     with Submittable {
  var batchSize: Double = js.native
  var text: String = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

