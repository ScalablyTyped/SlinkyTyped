package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analog extends js.Object {
  var analog: js.UndefOr[Hour] = js.native
  var digital: js.UndefOr[Text] = js.native
}

object Analog {
  @scala.inline
  def apply(): Analog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analog]
  }
  @scala.inline
  implicit class AnalogOps[Self <: Analog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalog(value: Hour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analog")(js.undefined)
        ret
    }
    @scala.inline
    def withDigital(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigital: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital")(js.undefined)
        ret
    }
  }
  
}

