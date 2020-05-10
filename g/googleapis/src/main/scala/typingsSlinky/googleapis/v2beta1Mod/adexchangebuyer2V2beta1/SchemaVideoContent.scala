package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video content for a creative.
  */
@js.native
trait SchemaVideoContent extends js.Object {
  /**
    * The URL to fetch a video ad.
    */
  var videoUrl: js.UndefOr[String] = js.native
  /**
    * The contents of a VAST document for a video ad. This document should
    * conform to the VAST 2.0 or 3.0 standard.
    */
  var videoVastXml: js.UndefOr[String] = js.native
}

object SchemaVideoContent {
  @scala.inline
  def apply(): SchemaVideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContent]
  }
  @scala.inline
  implicit class SchemaVideoContentOps[Self <: SchemaVideoContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoVastXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoVastXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoVastXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoVastXml")(js.undefined)
        ret
    }
  }
  
}

