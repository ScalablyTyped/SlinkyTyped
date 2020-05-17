package typingsSlinky.gulpMinify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Min extends js.Object {
  /**
    * The suffix string of the filenames that output minified files ends with or the regex expressions to be replaced with input filenames.
    */
  var min: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The suffix string of the filenames that output source files ends with.
    */
  var src: js.UndefOr[String] = js.native
}

object Min {
  @scala.inline
  def apply(): Min = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Min]
  }
  @scala.inline
  implicit class MinOps[Self <: Min] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMin(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

