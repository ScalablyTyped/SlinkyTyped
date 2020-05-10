package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a video.
  */
@js.native
trait SchemaVideo extends js.Object {
  /**
    * The video source&#39;s unique identifier for this video.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * An URL to a video. The URL is valid as long as the source video exists
    * and sharing settings do not change.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The properties of the video.
    */
  var videoProperties: js.UndefOr[SchemaVideoProperties] = js.native
}

object SchemaVideo {
  @scala.inline
  def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  @scala.inline
  implicit class SchemaVideoOps[Self <: SchemaVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoProperties(value: SchemaVideoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoProperties")(js.undefined)
        ret
    }
  }
  
}

