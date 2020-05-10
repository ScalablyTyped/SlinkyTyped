package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderContext extends js.Object {
  /**
    * fragment object
    */
  var frag: Fragment = js.native
  /**
    * level id
    */
  var level: Double = js.native
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[Boolean] = js.native
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[Double] = js.native
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[Double] = js.native
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: String = js.native
  /**
    * request type
    * - level, manifest
    */
  var `type`: String = js.native
  /**
    * target URL
    */
  var url: String = js.native
}

object LoaderContext {
  @scala.inline
  def apply(frag: Fragment, level: Double, responseType: String, `type`: String, url: String): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
  @scala.inline
  implicit class LoaderContextOps[Self <: LoaderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrag(value: Fragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressData")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(js.undefined)
        ret
    }
  }
  
}

