package typingsSlinky.pirates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The extensions to hook. Should start with '.' (ex. ['.js']).
    *
    * @default ['.js']
    */
  var exts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auto-ignore node_modules. Independent of any matcher.
    *
    * @default true
    */
  var ignoreNodeModules: js.UndefOr[Boolean] = js.native
  /** A matcher function, will be called with path to a file. Should return truthy if the file should be hooked, falsy otherwise. */
  var matcher: js.UndefOr[Matcher] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exts")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNodeModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNodeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNodeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: /* code */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
  }
  
}

