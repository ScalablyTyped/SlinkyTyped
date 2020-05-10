package typingsSlinky.hardSourceWebpackPlugin.mod.ParallelModulePlugin

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var fork: js.UndefOr[
    js.Function3[/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String, Unit]
  ] = js.native
  var minModules: js.UndefOr[Double] = js.native
  var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.native
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
    def withFork(value: (/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(js.undefined)
        ret
    }
    @scala.inline
    def withMinModules(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minModules")(js.undefined)
        ret
    }
    @scala.inline
    def withNumWorkersFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumWorkers(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(js.undefined)
        ret
    }
  }
  
}

