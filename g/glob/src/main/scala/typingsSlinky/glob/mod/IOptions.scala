package typingsSlinky.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.glob.anon.IsDirectory
import typingsSlinky.glob.globBooleans.`false`
import typingsSlinky.glob.globStrings.DIR
import typingsSlinky.glob.globStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions
  extends typingsSlinky.minimatch.mod.IOptions {
  var absolute: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[StringDictionary[Boolean | DIR | FILE | js.Array[String]]] = js.native
  var cwd: js.UndefOr[String] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var nodir: js.UndefOr[Boolean] = js.native
  var nomount: js.UndefOr[Boolean] = js.native
  var nosort: js.UndefOr[Boolean] = js.native
  var nounique: js.UndefOr[Boolean] = js.native
  var realpath: js.UndefOr[Boolean] = js.native
  var realpathCache: js.UndefOr[StringDictionary[String]] = js.native
  var root: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stat: js.UndefOr[Boolean] = js.native
  var statCache: js.UndefOr[StringDictionary[js.UndefOr[`false` | IsDirectory]]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var symlinks: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = {
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
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withNodir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodir")(js.undefined)
        ret
    }
    @scala.inline
    def withNomount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nomount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNomount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nomount")(js.undefined)
        ret
    }
    @scala.inline
    def withNosort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNosort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosort")(js.undefined)
        ret
    }
    @scala.inline
    def withNounique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nounique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNounique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nounique")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpathCache(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpathCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealpathCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpathCache")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.undefined)
        ret
    }
    @scala.inline
    def withStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCache")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

