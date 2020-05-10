package typingsSlinky.raty

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryRatyOptions extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.native
  var cancelClass: js.UndefOr[String] = js.native
  var cancelHint: js.UndefOr[String] = js.native
  var cancelOff: js.UndefOr[String] = js.native
  var cancelOn: js.UndefOr[String] = js.native
  var cancelPlace: js.UndefOr[String] = js.native
  var click: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  var half: js.UndefOr[Boolean] = js.native
  var halfShow: js.UndefOr[Boolean] = js.native
  var hints: js.UndefOr[js.Array[String]] = js.native
  var iconRange: js.UndefOr[js.Array[js.Array[_]]] = js.native
  var mouseout: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  var mouseover: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  var noRatedMsg: js.UndefOr[String] = js.native
  var number: js.UndefOr[Double] = js.native
  var numberMax: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var precision: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[JQueryRatyRoundingOptions] = js.native
  var score: js.UndefOr[Double] = js.native
  var scoreName: js.UndefOr[String] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var space: js.UndefOr[Boolean] = js.native
  var starHalf: js.UndefOr[String] = js.native
  var starOff: js.UndefOr[String] = js.native
  var starOn: js.UndefOr[String] = js.native
  var starType: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
  var targetFormat: js.UndefOr[String] = js.native
  var targetKeep: js.UndefOr[Boolean] = js.native
  var targetScore: js.UndefOr[String] = js.native
  var targetText: js.UndefOr[String] = js.native
  var targetType: js.UndefOr[String] = js.native
}

object JQueryRatyOptions {
  @scala.inline
  def apply(): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryRatyOptions]
  }
  @scala.inline
  implicit class JQueryRatyOptionsOps[Self <: JQueryRatyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelHint")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOff")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelPlace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withHalf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("half")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("half")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfShow")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRange(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRatedMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRatedMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRatedMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRatedMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberMax")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: JQueryRatyRoundingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreName")(js.undefined)
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withStarHalf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starHalf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarHalf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starHalf")(js.undefined)
        ret
    }
    @scala.inline
    def withStarOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starOff")(js.undefined)
        ret
    }
    @scala.inline
    def withStarOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starOn")(js.undefined)
        ret
    }
    @scala.inline
    def withStarType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starType")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetKeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKeep")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetScore")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetText")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(js.undefined)
        ret
    }
  }
  
}

