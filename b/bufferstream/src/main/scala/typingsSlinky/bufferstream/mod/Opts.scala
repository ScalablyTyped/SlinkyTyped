package typingsSlinky.bufferstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /*
  			if true and the source is a child_process the stream will block the entire process (timeouts wont work anymore, but splitting and listening on data still works, because they work sync)
  		*/
  var blocking: js.UndefOr[Boolean] = js.native
  /*
  			immediately call disable
  		*/
  var disabled: js.UndefOr[Boolean] = js.native
  /*
  			default encoding for writing strings
  		*/
  var encoding: js.UndefOr[String] = js.native
  /*
  			defines buffer level or sets buffer to given size (see ↓setSize for more)
  		*/
  var size: js.UndefOr[js.Any] = js.native
  /*
  			short form for:
  			split(token, function (chunk) {emit('data', chunk)})
  		*/
  // String or Buffer
  var split: js.UndefOr[js.Any] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
  }
  
}

