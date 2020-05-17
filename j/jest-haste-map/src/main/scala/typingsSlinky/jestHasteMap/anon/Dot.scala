package typingsSlinky.jestHasteMap.anon

import typingsSlinky.anymatch.mod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dot extends js.Object {
  var dot: Boolean = js.native
  var glob: String | js.Array[String] = js.native
  var ignored: js.UndefOr[Matcher] = js.native
  var root: String = js.native
}

object Dot {
  @scala.inline
  def apply(dot: Boolean, glob: String | js.Array[String], root: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  @scala.inline
  implicit class DotOps[Self <: Dot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlob(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoredFunction1(value: /* repeated */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoredRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnored(value: Matcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.undefined)
        ret
    }
  }
  
}

