package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Format List Response
  */
@js.native
trait SchemaVideoFormatsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormatsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Video format collection.
    */
  var videoFormats: js.UndefOr[js.Array[SchemaVideoFormat]] = js.native
}

object SchemaVideoFormatsListResponse {
  @scala.inline
  def apply(): SchemaVideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFormatsListResponse]
  }
  @scala.inline
  implicit class SchemaVideoFormatsListResponseOps[Self <: SchemaVideoFormatsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoFormats(value: js.Array[SchemaVideoFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoFormats")(js.undefined)
        ret
    }
  }
  
}

