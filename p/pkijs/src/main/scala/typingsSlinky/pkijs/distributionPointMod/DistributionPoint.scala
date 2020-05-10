package typingsSlinky.pkijs.distributionPointMod

import typingsSlinky.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionPoint extends js.Object {
  var cRLIssuer: js.UndefOr[js.Array[typingsSlinky.pkijs.generalNameMod.default]] = js.native
  var distributionPoint: js.UndefOr[js.Array[typingsSlinky.pkijs.generalNameMod.default]] = js.native
  var reasons: js.UndefOr[BitString] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object DistributionPoint {
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): DistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[DistributionPoint]
  }
  @scala.inline
  implicit class DistributionPointOps[Self <: DistributionPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCRLIssuer(value: js.Array[typingsSlinky.pkijs.generalNameMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cRLIssuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCRLIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cRLIssuer")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionPoint(value: js.Array[typingsSlinky.pkijs.generalNameMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: BitString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(js.undefined)
        ret
    }
  }
  
}

