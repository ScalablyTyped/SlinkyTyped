package typingsSlinky.sass.mod

import typingsSlinky.node.Buffer
import typingsSlinky.sass.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * The compiled CSS.
    *
    * Write this to a file, or serve it out as needed.
    */
  var css: Buffer = js.native
  /**
    * The source map.
    */
  var map: js.UndefOr[Buffer] = js.native
  var stats: Duration = js.native
}

object Result {
  @scala.inline
  def apply(css: Buffer, stats: Duration): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
  }
  
}

