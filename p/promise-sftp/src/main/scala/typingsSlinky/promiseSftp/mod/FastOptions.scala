package typingsSlinky.promiseSftp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for `PromiseSftp#fast{Get,Put}` */
@js.native
trait FastOptions extends js.Object {
  /**
    * Size of each read in bytes
    * @default 32768
    */
  var chunkSize: Double = js.native
  /**
    * Number of concurrent reads
    * @default 25
    */
  var concurrency: js.UndefOr[Double] = js.native
  /** Called every time a part of a file is transferred */
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.native
}

object FastOptions {
  @scala.inline
  def apply(chunkSize: Double): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastOptions]
  }
  @scala.inline
  implicit class FastOptionsOps[Self <: FastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

