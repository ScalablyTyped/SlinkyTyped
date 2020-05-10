package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataHistory extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[Metadata] = js.native
  var origination: js.UndefOr[Origination] = js.native
  var timeProvided: js.UndefOr[String] = js.native
}

object MetadataHistory {
  @scala.inline
  def apply(): MetadataHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataHistory]
  }
  @scala.inline
  implicit class MetadataHistoryOps[Self <: MetadataHistory] (val x: Self) extends AnyVal {
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
    def withMetadata(value: Metadata): Self = {
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
    def withOrigination(value: Origination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origination")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeProvided(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeProvided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeProvided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeProvided")(js.undefined)
        ret
    }
  }
  
}

