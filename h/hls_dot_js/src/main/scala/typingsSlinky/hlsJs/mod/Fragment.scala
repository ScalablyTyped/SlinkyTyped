package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the Fragment object contains fragment related info
  */
@js.native
trait Fragment extends js.Object {
  /**
    * continuity count
    */
  var cc: Double = js.native
  /**
    * fragment duration
    */
  var duration: Double = js.native
  /**
    * fragment level identifier
    */
  var level: Double = js.native
  /**
    * stream start date and time
    */
  var programDateTime: js.Date = js.native
  /**
    * fragment sequence number
    */
  var sn: Double = js.native
  /**
    * fragment start offset
    */
  var start: Double = js.native
  /**
    * list of tags associated with the fragment
    */
  var tagList: js.Array[js.Array[String]] = js.native
  /**
    * fragment title
    */
  var title: String = js.native
  /**
    * fragment url
    */
  var url: String = js.native
}

object Fragment {
  @scala.inline
  def apply(
    cc: Double,
    duration: Double,
    level: Double,
    programDateTime: js.Date,
    sn: Double,
    start: Double,
    tagList: js.Array[js.Array[String]],
    title: String,
    url: String
  ): Fragment = {
    val __obj = js.Dynamic.literal(cc = cc.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], programDateTime = programDateTime.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tagList = tagList.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagList(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

