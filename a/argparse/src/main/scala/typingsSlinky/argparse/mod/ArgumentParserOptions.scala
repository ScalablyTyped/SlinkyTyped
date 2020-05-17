package typingsSlinky.argparse.mod

import typingsSlinky.argparse.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentParserOptions extends js.Object {
  var addHelp: js.UndefOr[Boolean] = js.native
  var argumentDefault: js.UndefOr[js.Any] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var epilog: js.UndefOr[String] = js.native
  var formatterClass: js.UndefOr[`0`] = js.native
  var parents: js.UndefOr[js.Array[ArgumentParser]] = js.native
  var prefixChars: js.UndefOr[String] = js.native
  var prog: js.UndefOr[String] = js.native
  var usage: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object ArgumentParserOptions {
  @scala.inline
  def apply(): ArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentParserOptions]
  }
  @scala.inline
  implicit class ArgumentParserOptionsOps[Self <: ArgumentParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEpilog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epilog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpilog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epilog")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterClass(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClass")(js.undefined)
        ret
    }
    @scala.inline
    def withParents(value: js.Array[ArgumentParser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixChars")(js.undefined)
        ret
    }
    @scala.inline
    def withProg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prog")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

