package typingsSlinky.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Choices[Macos, Windows, Linux, Default] extends js.Object {
  val default: js.UndefOr[Default | js.Function0[Default]] = js.native
  val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.native
  val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.native
  val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.native
}

object _Choices {
  @scala.inline
  def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
  }
  @scala.inline
  implicit class _ChoicesOps[Self[macos, windows, linux, default] <: _Choices[macos, windows, linux, default], Macos, Windows, Linux, Default] (val x: Self[Macos, Windows, Linux, Default]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Macos, Windows, Linux, Default] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Macos, Windows, Linux, Default]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Macos, Windows, Linux, Default]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Macos, Windows, Linux, Default]) with Other]
    @scala.inline
    def withDefaultFunction0(value: () => Default): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefault(value: Default | js.Function0[Default]): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withLinuxFunction0(value: () => Linux): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLinux(value: Linux | js.Function0[Linux]): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinux: Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(js.undefined)
        ret
    }
    @scala.inline
    def withMacosFunction0(value: () => Macos): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMacos(value: Macos | js.Function0[Macos]): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacos: Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macos")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsFunction0(value: () => Windows): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWindows(value: Windows | js.Function0[Windows]): Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindows: Self[Macos, Windows, Linux, Default] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.undefined)
        ret
    }
  }
  
}

