package typingsSlinky.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDatum extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var datum_type: Double = js.native
  var ep2: Double = js.native
  var es: Double = js.native
}

object InterfaceDatum {
  @scala.inline
  def apply(a: Double, b: Double, datum_type: Double, ep2: Double, es: Double): InterfaceDatum = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], datum_type = datum_type.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDatum]
  }
  @scala.inline
  implicit class InterfaceDatumOps[Self <: InterfaceDatum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatum_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEp2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ep2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

