package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KZT extends js.Object {
  var JPY: js.Array[String] = js.native
  var KZT: js.Array[String] = js.native
  var RUB: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object KZT {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KZT: js.Array[String],
    RUB: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): KZT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KZT]
  }
  @scala.inline
  implicit class KZTOps[Self <: KZT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKZT(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KZT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

