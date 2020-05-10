package typingsSlinky.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceProjection extends js.Object {
  var b: Double = js.native
  var datum: String = js.native
  var e: Double = js.native
  var ep2: Double = js.native
  var es: Double = js.native
  var rf: Double = js.native
  var sphere: Double = js.native
  def forward(coordinates: TemplateCoordinates): js.Array[Double] = js.native
  def inverse(coordinates: TemplateCoordinates): js.Array[Double] = js.native
}

object InterfaceProjection {
  @scala.inline
  def apply(
    b: Double,
    datum: String,
    e: Double,
    ep2: Double,
    es: Double,
    forward: TemplateCoordinates => js.Array[Double],
    inverse: TemplateCoordinates => js.Array[Double],
    rf: Double,
    sphere: Double
  ): InterfaceProjection = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), rf = rf.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceProjection]
  }
  @scala.inline
  implicit class InterfaceProjectionOps[Self <: InterfaceProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withForward(value: TemplateCoordinates => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInverse(value: TemplateCoordinates => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSphere(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

