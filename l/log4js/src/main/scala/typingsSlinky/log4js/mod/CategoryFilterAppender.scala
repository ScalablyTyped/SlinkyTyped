package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.categoryFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryFilterAppender extends Appender {
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[String] = js.native
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  var `type`: categoryFilter = js.native
}

object CategoryFilterAppender {
  @scala.inline
  def apply(`type`: categoryFilter): CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFilterAppender]
  }
  @scala.inline
  implicit class CategoryFilterAppenderOps[Self <: CategoryFilterAppender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: categoryFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appender")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
  }
  
}

