package typingsSlinky.pulumiAws.wafGeoMatchSetMod

import typingsSlinky.pulumiAws.inputMod.waf.GeoMatchSetGeoMatchConstraint
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetState extends js.Object {
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]] = js.native
  /**
    * The name or description of the GeoMatchSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object GeoMatchSetState {
  @scala.inline
  def apply(): GeoMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchSetState]
  }
  @scala.inline
  implicit class GeoMatchSetStateOps[Self <: GeoMatchSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoMatchConstraints(value: Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoMatchConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoMatchConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoMatchConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

