package typingsSlinky.activexStdole.stdole

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GUID extends js.Object {
  val Data1: Double = js.native
  val Data2: Double = js.native
  val Data3: Double = js.native
  val Data4: SafeArray[Double] = js.native
}

object GUID {
  @scala.inline
  def apply(Data1: Double, Data2: Double, Data3: Double, Data4: SafeArray[Double]): GUID = {
    val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any])
    __obj.asInstanceOf[GUID]
  }
  @scala.inline
  implicit class GUIDOps[Self <: GUID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData4(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

