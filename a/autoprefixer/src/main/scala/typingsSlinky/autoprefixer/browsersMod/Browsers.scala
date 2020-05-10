package typingsSlinky.autoprefixer.browsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browsers extends js.Object {
  def isSelected(browser: String): Boolean = js.native
  def parse(queries: Queries): js.Array[String] = js.native
  def prefix(browser: String): String = js.native
}

object Browsers {
  @scala.inline
  def apply(isSelected: String => Boolean, parse: Queries => js.Array[String], prefix: String => String): Browsers = {
    val __obj = js.Dynamic.literal(isSelected = js.Any.fromFunction1(isSelected), parse = js.Any.fromFunction1(parse), prefix = js.Any.fromFunction1(prefix))
    __obj.asInstanceOf[Browsers]
  }
  @scala.inline
  implicit class BrowsersOps[Self <: Browsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelected(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: Queries => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefix(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

