package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single message which encapsulates structured name and metadata for a
  * given counter.
  */
@js.native
trait SchemaCounterStructuredNameAndMetadata extends js.Object {
  /**
    * Metadata associated with a counter
    */
  var metadata: js.UndefOr[SchemaCounterMetadata] = js.native
  /**
    * Structured name of the counter.
    */
  var name: js.UndefOr[SchemaCounterStructuredName] = js.native
}

object SchemaCounterStructuredNameAndMetadata {
  @scala.inline
  def apply(): SchemaCounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredNameAndMetadata]
  }
  @scala.inline
  implicit class SchemaCounterStructuredNameAndMetadataOps[Self <: SchemaCounterStructuredNameAndMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: SchemaCounterMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SchemaCounterStructuredName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

