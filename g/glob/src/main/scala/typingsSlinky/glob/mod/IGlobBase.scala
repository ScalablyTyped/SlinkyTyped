package typingsSlinky.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.glob.AnonIsDirectory
import typingsSlinky.glob.globBooleans.`false`
import typingsSlinky.glob.globStrings.DIR
import typingsSlinky.glob.globStrings.FILE
import typingsSlinky.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobBase extends js.Object {
  var aborted: Boolean = js.native
  var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
  var found: js.Array[String] = js.native
  var minimatch: IMinimatch = js.native
  var options: IOptions = js.native
  var realpathCache: StringDictionary[String] = js.native
  var statCache: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]] = js.native
  var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
}

object IGlobBase {
  @scala.inline
  def apply(
    aborted: Boolean,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]],
    found: js.Array[String],
    minimatch: IMinimatch,
    options: IOptions,
    realpathCache: StringDictionary[String],
    statCache: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]],
    symlinks: StringDictionary[js.UndefOr[Boolean]]
  ): IGlobBase = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], minimatch = minimatch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], realpathCache = realpathCache.asInstanceOf[js.Any], statCache = statCache.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobBase]
  }
  @scala.inline
  implicit class IGlobBaseOps[Self <: IGlobBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAborted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFound(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimatch(value: IMinimatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealpathCache(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpathCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatCache(value: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

