package typingsSlinky.memorystream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bufoverflow: Double = js.native
  var frequence: Double = js.native
  var maxbufsize: Double = js.native
  var readable: Boolean = js.native
  var writeable: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(bufoverflow: Double, frequence: Double, maxbufsize: Double, readable: Boolean, writeable: Boolean): Options = {
    val __obj = js.Dynamic.literal(bufoverflow = bufoverflow.asInstanceOf[js.Any], frequence = frequence.asInstanceOf[js.Any], maxbufsize = maxbufsize.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writeable = writeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufoverflow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufoverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxbufsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxbufsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

