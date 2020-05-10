package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocaleNumberPatternDescriptor extends js.Object {
  var gSize: Double = js.native
  var lgSize: Double = js.native
  var maxFrac: Double = js.native
  var minFrac: Double = js.native
  var minInt: Double = js.native
  var negPre: String = js.native
  var negSuf: String = js.native
  var posPre: String = js.native
  var posSuf: String = js.native
}

object ILocaleNumberPatternDescriptor {
  @scala.inline
  def apply(
    gSize: Double,
    lgSize: Double,
    maxFrac: Double,
    minFrac: Double,
    minInt: Double,
    negPre: String,
    negSuf: String,
    posPre: String,
    posSuf: String
  ): ILocaleNumberPatternDescriptor = {
    val __obj = js.Dynamic.literal(gSize = gSize.asInstanceOf[js.Any], lgSize = lgSize.asInstanceOf[js.Any], maxFrac = maxFrac.asInstanceOf[js.Any], minFrac = minFrac.asInstanceOf[js.Any], minInt = minInt.asInstanceOf[js.Any], negPre = negPre.asInstanceOf[js.Any], negSuf = negSuf.asInstanceOf[js.Any], posPre = posPre.asInstanceOf[js.Any], posSuf = posSuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
  @scala.inline
  implicit class ILocaleNumberPatternDescriptorOps[Self <: ILocaleNumberPatternDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLgSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFrac(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFrac(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegPre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negPre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegSuf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negSuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosPre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posPre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosSuf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posSuf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

