package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a File connector used by the job.
  */
@js.native
trait SchemaFileIODetails extends js.Object {
  /**
    * File Pattern used to access files by the connector.
    */
  var filePattern: js.UndefOr[String] = js.native
}

object SchemaFileIODetails {
  @scala.inline
  def apply(): SchemaFileIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileIODetails]
  }
  @scala.inline
  implicit class SchemaFileIODetailsOps[Self <: SchemaFileIODetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePattern")(js.undefined)
        ret
    }
  }
  
}

