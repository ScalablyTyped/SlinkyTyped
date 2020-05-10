package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffChecksumsResponse extends js.Object {
  /**
    * gdata
    */
  var checksumsLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffChecksumsResponse {
  @scala.inline
  def apply(): SchemaGdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffChecksumsResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffChecksumsResponseOps[Self <: SchemaGdataDiffChecksumsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksumsLocation(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumsLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksumsLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumsLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLocation(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectVersion")(js.undefined)
        ret
    }
  }
  
}

