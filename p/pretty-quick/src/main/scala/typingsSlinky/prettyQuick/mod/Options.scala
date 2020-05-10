package typingsSlinky.prettyQuick.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prettier.mod.ResolveConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends // ...args support
/* key */ StringDictionary[js.Any] {
  var bail: js.UndefOr[Boolean] = js.native
  /**
    * @default 'master' | 'default'
    */
  var branch: js.UndefOr[String] = js.native
  var check: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[ResolveConfigOptions] = js.native
  var onCheckFile: js.UndefOr[js.Function2[/* file */ String, /* isFormatted */ Boolean, Unit]] = js.native
  var onExamineFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  var onFoundChangedFiles: js.UndefOr[js.Function1[/* changedFiles */ js.Array[String], Unit]] = js.native
  var onFoundSinceRevision: js.UndefOr[js.Function2[/* name */ String, /* revision */ String, Unit]] = js.native
  var onPartiallyStagedFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  var onWriteFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  var pattern: js.UndefOr[String | js.Array[String]] = js.native
  /** @default true */
  var restage: js.UndefOr[Boolean] = js.native
  var since: js.UndefOr[String] = js.native
  /** @default false */
  var staged: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
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
    def withBail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: ResolveConfigOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckFile(value: (/* file */ String, /* isFormatted */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheckFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExamineFile(value: /* file */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExamineFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExamineFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExamineFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFoundChangedFiles(value: /* changedFiles */ js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFoundChangedFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFoundChangedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFoundChangedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFoundSinceRevision(value: (/* name */ String, /* revision */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFoundSinceRevision")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFoundSinceRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFoundSinceRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPartiallyStagedFile(value: /* file */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPartiallyStagedFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPartiallyStagedFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPartiallyStagedFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWriteFile(value: /* file */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWriteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRestage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restage")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withStaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staged")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

