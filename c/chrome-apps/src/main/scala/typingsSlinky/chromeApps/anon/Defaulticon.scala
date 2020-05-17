package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.read_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaulticon extends js.Object {
  /** Icon */
  var default_icon: String = js.native
  /** What the button will display */
  var default_title: String = js.native
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[js.Array[read_ | String]] = js.native
  /**
    * To match all files, use 'filesystem:*.*'
    */
  var file_filters: js.Array[String] = js.native
  /** Handler id */
  var id: String = js.native
}

object Defaulticon {
  @scala.inline
  def apply(default_icon: String, default_title: String, file_filters: js.Array[String], id: String): Defaulticon = {
    val __obj = js.Dynamic.literal(default_icon = default_icon.asInstanceOf[js.Any], default_title = default_title.asInstanceOf[js.Any], file_filters = file_filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaulticon]
  }
  @scala.inline
  implicit class DefaulticonOps[Self <: Defaulticon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_filters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_access(value: js.Array[read_ | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_access")(js.undefined)
        ret
    }
  }
  
}

