package typingsSlinky.geodesy.latlonEllipsoidalReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TxParam extends js.Object {
  var epoch: String = js.native
  var params: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
  var rates: js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
}

object TxParam {
  @scala.inline
  def apply(
    epoch: String,
    params: js.Tuple6[Double, Double, Double, Double, Double, Double],
    rates: js.Tuple6[Double, Double, Double, Double, Double, Double]
  ): TxParam = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxParam]
  }
  @scala.inline
  implicit class TxParamOps[Self <: TxParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpoch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRates(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

