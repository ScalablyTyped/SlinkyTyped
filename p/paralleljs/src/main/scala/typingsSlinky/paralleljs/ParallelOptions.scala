package typingsSlinky.paralleljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelOptions extends js.Object {
  /**
  	* This is the path to the file eval.js.  This is required when running in node, and required for some browsers (IE 10) in order to work around cross-domain restrictions for web workers.  Defaults to the same location as parallel.js in node environments, and null in the browser.
  	**/
  var evalPath: js.UndefOr[String] = js.native
  /**
  	* The maximum number of permitted worker threads.  This will default to 4, or the number of cpus on your computer if you're running node.
  	**/
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
  	* If webworkers are not available, whether or not to fall back to synchronous processing using setTimeout.  Defaults to true.
  	**/
  var synchronous: js.UndefOr[Boolean] = js.native
}

object ParallelOptions {
  @scala.inline
  def apply(): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelOptions]
  }
  @scala.inline
  implicit class ParallelOptionsOps[Self <: ParallelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvalPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
  }
  
}

