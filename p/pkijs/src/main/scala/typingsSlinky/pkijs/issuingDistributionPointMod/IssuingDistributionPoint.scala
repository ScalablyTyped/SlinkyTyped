package typingsSlinky.pkijs.issuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuingDistributionPoint extends js.Object {
  var distributionPoint: js.UndefOr[
    js.Array[typingsSlinky.pkijs.generalNameMod.default] | typingsSlinky.pkijs.relativeDistinguishedNamesMod.default
  ] = js.native
  var indirectCRL: Boolean = js.native
  var onlyContainsAttributeCerts: Boolean = js.native
  var onlyContainsUserCerts: Boolean = js.native
  var onlySomeReasons: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object IssuingDistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    indirectCRL: Boolean,
    onlyContainsAttributeCerts: Boolean,
    onlyContainsUserCerts: Boolean,
    onlySomeReasons: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any], onlySomeReasons = onlySomeReasons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
  @scala.inline
  implicit class IssuingDistributionPointOps[Self <: IssuingDistributionPoint] (val x: Self) extends AnyVal {
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
    def withIndirectCRL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indirectCRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyContainsAttributeCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyContainsAttributeCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyContainsUserCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyContainsUserCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlySomeReasons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySomeReasons")(value.asInstanceOf[js.Any])
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
    def withDistributionPoint(
      value: js.Array[typingsSlinky.pkijs.generalNameMod.default] | typingsSlinky.pkijs.relativeDistinguishedNamesMod.default
    ): Self = {
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
  }
  
}

