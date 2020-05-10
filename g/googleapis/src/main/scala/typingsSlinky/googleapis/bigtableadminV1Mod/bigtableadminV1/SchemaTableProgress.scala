package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress info for copying a table&#39;s data to the new cluster.
  */
@js.native
trait SchemaTableProgress extends js.Object {
  /**
    * Estimate of the number of bytes copied so far for this table. This will
    * eventually reach &#39;estimated_size_bytes&#39; unless the table copy is
    * CANCELLED.
    */
  var estimatedCopiedBytes: js.UndefOr[String] = js.native
  /**
    * Estimate of the size of the table to be copied.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaTableProgress {
  @scala.inline
  def apply(): SchemaTableProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableProgress]
  }
  @scala.inline
  implicit class SchemaTableProgressOps[Self <: SchemaTableProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedCopiedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedCopiedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedCopiedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedCopiedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

