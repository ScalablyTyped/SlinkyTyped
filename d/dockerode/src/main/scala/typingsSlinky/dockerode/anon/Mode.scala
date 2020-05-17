package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var Destination: String = js.native
  var Mode: String = js.native
  var Name: js.UndefOr[String] = js.native
  var Propagation: String = js.native
  var RW: Boolean = js.native
  var Source: String = js.native
}

object Mode {
  @scala.inline
  def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String): Mode = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Propagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRW(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

