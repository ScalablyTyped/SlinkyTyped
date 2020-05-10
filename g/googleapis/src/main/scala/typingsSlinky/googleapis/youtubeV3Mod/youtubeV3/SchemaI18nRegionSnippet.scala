package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n region, such as region code and human-readable
  * name.
  */
@js.native
trait SchemaI18nRegionSnippet extends js.Object {
  /**
    * The region code as a 2-letter ISO country code.
    */
  var gl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the region.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaI18nRegionSnippet {
  @scala.inline
  def apply(): SchemaI18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegionSnippet]
  }
  @scala.inline
  implicit class SchemaI18nRegionSnippetOps[Self <: SchemaI18nRegionSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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

