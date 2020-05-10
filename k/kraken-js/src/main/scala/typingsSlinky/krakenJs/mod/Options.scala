package typingsSlinky.krakenJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var basedir: js.UndefOr[String] = js.native
  var configdir: js.UndefOr[String] = js.native
  var inheritViews: js.UndefOr[Boolean] = js.native
  var mountpath: js.UndefOr[String] = js.native
  var onconfig: js.UndefOr[
    js.Function2[
      /* config */ Map[String, _], 
      /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], _], 
      _
    ]
  ] = js.native
  var protocols: js.UndefOr[js.Object] = js.native
  var startupHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var uncaughtException: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
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
    def withBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configdir")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritViews")(js.undefined)
        ret
    }
    @scala.inline
    def withMountpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountpath")(js.undefined)
        ret
    }
    @scala.inline
    def withOnconfig(
      value: (/* config */ Map[String, _], /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], _]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconfig")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withUncaughtException(value: /* err */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUncaughtException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(js.undefined)
        ret
    }
  }
  
}

