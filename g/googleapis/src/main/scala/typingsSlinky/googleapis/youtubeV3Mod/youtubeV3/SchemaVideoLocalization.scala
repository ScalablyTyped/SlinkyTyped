package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Localized versions of certain video properties (e.g. title).
  */
@js.native
trait SchemaVideoLocalization extends js.Object {
  /**
    * Localized version of the video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Localized version of the video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoLocalization {
  @scala.inline
  def apply(): SchemaVideoLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoLocalization]
  }
  @scala.inline
  implicit class SchemaVideoLocalizationOps[Self <: SchemaVideoLocalization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

