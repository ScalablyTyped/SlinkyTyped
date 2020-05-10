package typingsSlinky.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait I2cModes extends js.Object {
  var CONTINUOUS_READ: I2C_MODE = js.native
  var READ: I2C_MODE = js.native
  var STOP_READING: I2C_MODE = js.native
  var WRITE: I2C_MODE = js.native
}

object I2cModes {
  @scala.inline
  def apply(CONTINUOUS_READ: I2C_MODE, READ: I2C_MODE, STOP_READING: I2C_MODE, WRITE: I2C_MODE): I2cModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ.asInstanceOf[js.Any], READ = READ.asInstanceOf[js.Any], STOP_READING = STOP_READING.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2cModes]
  }
  @scala.inline
  implicit class I2cModesOps[Self <: I2cModes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONTINUOUS_READ(value: I2C_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_READ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREAD(value: I2C_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTOP_READING(value: I2C_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STOP_READING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWRITE(value: I2C_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WRITE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

