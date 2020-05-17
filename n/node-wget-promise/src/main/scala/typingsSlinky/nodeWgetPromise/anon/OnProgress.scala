package typingsSlinky.nodeWgetPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnProgress extends js.Object {
  var onProgress: js.UndefOr[js.Any] = js.native
  var onStart: js.UndefOr[js.Any] = js.native
  var output: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object OnProgress {
  @scala.inline
  def apply(): OnProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgress]
  }
  @scala.inline
  implicit class OnProgressOps[Self <: OnProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnProgress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
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

