package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderRefetchMetadata & {  connection  :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderPaginationMetadata} */
@js.native
trait ReaderRefetchMetadataconn extends js.Object {
  val connection: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata = js.native
  val fragmentPathInResult: js.Array[String] = js.native
  val operation: String | ConcreteRequest = js.native
}

object ReaderRefetchMetadataconn {
  @scala.inline
  def apply(
    connection: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata,
    fragmentPathInResult: js.Array[String],
    operation: String | ConcreteRequest
  ): ReaderRefetchMetadataconn = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadataconn]
  }
  @scala.inline
  implicit class ReaderRefetchMetadataconnOps[Self <: ReaderRefetchMetadataconn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentPathInResult(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentPathInResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String | ConcreteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

