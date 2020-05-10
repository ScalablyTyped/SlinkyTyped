package typingsSlinky.ffmpegJs.ffmpegWebmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var MEMFS: js.UndefOr[js.Array[Video]] = js.native
  var TOTAL_MEMORY: js.UndefOr[Double] = js.native
  var arguments: js.Array[String] = js.native
  var mounts: js.UndefOr[js.Array[Mount]] = js.native
  var onExit: js.UndefOr[js.Function1[/* code */ js.Any, Unit]] = js.native
  var print: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var printErr: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var stdin: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(arguments: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEMFS(value: js.Array[Video]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEMFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMEMFS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEMFS")(js.undefined)
        ret
    }
    @scala.inline
    def withTOTAL_MEMORY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_MEMORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTOTAL_MEMORY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_MEMORY")(js.undefined)
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[Mount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounts")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: /* code */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintErr(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrintErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
  }
  
}

