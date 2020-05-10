package typingsSlinky.pegjs.mod

import typingsSlinky.pegjs.pegjsStrings.size
import typingsSlinky.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptionsBase extends js.Object {
  /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
  var allowedStartRules: js.UndefOr[js.Array[String]] = js.native
  /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
  var cache: js.UndefOr[Boolean] = js.native
  /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
  var optimize: js.UndefOr[speed | size] = js.native
  /** plugins to use */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /** makes the parser trace its progress (default: `false`) */
  var trace: js.UndefOr[Boolean] = js.native
}

object BuildOptionsBase {
  @scala.inline
  def apply(): BuildOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptionsBase]
  }
  @scala.inline
  implicit class BuildOptionsBaseOps[Self <: BuildOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedStartRules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStartRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedStartRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStartRules")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimize(value: speed | size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
  }
  
}

