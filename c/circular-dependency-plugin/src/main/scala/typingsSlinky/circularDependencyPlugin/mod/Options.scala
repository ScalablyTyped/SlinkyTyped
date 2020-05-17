package typingsSlinky.circularDependencyPlugin.mod

import typingsSlinky.circularDependencyPlugin.anon.Compilation
import typingsSlinky.circularDependencyPlugin.anon.CompilationCompilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowAsyncCycles: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var exclude: js.UndefOr[js.RegExp] = js.native
  var failOnError: js.UndefOr[Boolean] = js.native
  var onDetected: js.UndefOr[js.Function1[/* x */ Compilation, Unit]] = js.native
  var onEnd: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.native
  var onStart: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.native
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
    def withAllowAsyncCycles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAsyncCycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAsyncCycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAsyncCycles")(js.undefined)
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
    def withExclude(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDetected(value: /* x */ Compilation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDetected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* x */ CompilationCompilation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* x */ CompilationCompilation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

