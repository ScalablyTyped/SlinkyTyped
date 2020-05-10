package typingsSlinky.fastGlob.optionsMod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.patternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fast-glob.fast-glob/out/managers/options.IOptions<T>> */
@js.native
trait IPartialOptions[T] extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.native
  var brace: js.UndefOr[Boolean] = js.native
  var `case`: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var deep: js.UndefOr[Double | Boolean] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var extension: js.UndefOr[Boolean] = js.native
  var followSymlinkedDirectories: js.UndefOr[Boolean] = js.native
  var globstar: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[js.Array[Pattern]] = js.native
  var markDirectories: js.UndefOr[Boolean] = js.native
  var matchBase: js.UndefOr[Boolean] = js.native
  var nobrace: js.UndefOr[Boolean] = js.native
  var nocase: js.UndefOr[Boolean] = js.native
  var noext: js.UndefOr[Boolean] = js.native
  var noglobstar: js.UndefOr[Boolean] = js.native
  var onlyDirectories: js.UndefOr[Boolean] = js.native
  var onlyFiles: js.UndefOr[Boolean] = js.native
  var stats: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[TransformFunction[T]] = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object IPartialOptions {
  @scala.inline
  def apply[T](): IPartialOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartialOptions[T]]
  }
  @scala.inline
  implicit class IPartialOptionsOps[Self[t] <: IPartialOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(js.undefined)
        ret
    }
    @scala.inline
    def withBrace(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrace: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brace")(js.undefined)
        ret
    }
    @scala.inline
    def withCase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDeep(value: Double | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowSymlinkedDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinkedDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowSymlinkedDirectories: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinkedDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobstar(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobstar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[Pattern]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkDirectories: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchBase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(js.undefined)
        ret
    }
    @scala.inline
    def withNobrace(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobrace: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(js.undefined)
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(js.undefined)
        ret
    }
    @scala.inline
    def withNoext(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(js.undefined)
        ret
    }
    @scala.inline
    def withNoglobstar(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoglobstar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyDirectories: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyFiles(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyFiles: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* entry */ EntryItem => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

