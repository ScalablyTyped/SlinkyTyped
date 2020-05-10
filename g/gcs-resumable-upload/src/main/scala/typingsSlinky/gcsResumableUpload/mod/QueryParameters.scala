package typingsSlinky.gcsResumableUpload.mod

import typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.full
import typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.noAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameters extends js.Object {
  var contentEncoding: js.UndefOr[String] = js.native
  var ifGenerationMatch: js.UndefOr[Double] = js.native
  var ifGenerationNotMatch: js.UndefOr[Double] = js.native
  var ifMetagenerationMatch: js.UndefOr[Double] = js.native
  var ifMetagenerationNotMatch: js.UndefOr[Double] = js.native
  var kmsKeyName: js.UndefOr[String] = js.native
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  var projection: js.UndefOr[full | noAcl] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object QueryParameters {
  @scala.inline
  def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  @scala.inline
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withIfGenerationMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfGenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfGenerationNotMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfGenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMetagenerationMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMetagenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMetagenerationNotMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMetagenerationNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMetagenerationNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedAcl(value: PredefinedAcl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: full | noAcl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

