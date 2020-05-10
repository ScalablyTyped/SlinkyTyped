package typingsSlinky.relayRuntime.readerNodeMod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderRefetchMetadata extends js.Object {
  val connection: js.UndefOr[ReaderPaginationMetadata | Null] = js.native
  val fragmentPathInResult: js.Array[String] = js.native
  val operation: String | ConcreteRequest = js.native
}

object ReaderRefetchMetadata {
  @scala.inline
  def apply(fragmentPathInResult: js.Array[String], operation: String | ConcreteRequest): ReaderRefetchMetadata = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadata]
  }
  @scala.inline
  implicit class ReaderRefetchMetadataOps[Self <: ReaderRefetchMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withConnection(value: ReaderPaginationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(null)
        ret
    }
  }
  
}

