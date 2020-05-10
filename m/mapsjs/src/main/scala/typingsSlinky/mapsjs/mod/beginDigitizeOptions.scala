package typingsSlinky.mapsjs.mod

import typingsSlinky.mapsjs.mod.geometry.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait beginDigitizeOptions extends js.Object {
  var circleEndAction: js.UndefOr[js.Function1[/* circle */ polygon, Unit]] = js.native
  var envelopeEndAction: js.UndefOr[js.Function1[/* env */ envelope, Unit]] = js.native
  var geometryStyle: js.UndefOr[typingsSlinky.mapsjs.mod.geometryStyle] = js.native
  var key: js.UndefOr[String] = js.native
  var leavePath: js.UndefOr[Boolean] = js.native
  var nodeMoveAction: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* actionType */ String, _]] = js.native
  var nodeTapAndHoldAction: js.UndefOr[js.Function2[/* setIdx */ Double, /* idx */ Double, Boolean]] = js.native
  var shapeChangeAction: js.UndefOr[js.Function0[Unit]] = js.native
  var shapeType: String = js.native
  var styledGeometry: js.UndefOr[typingsSlinky.mapsjs.mod.styledGeometry] = js.native
  var suppressNodeAdd: js.UndefOr[Boolean] = js.native
}

object beginDigitizeOptions {
  @scala.inline
  def apply(shapeType: String): beginDigitizeOptions = {
    val __obj = js.Dynamic.literal(shapeType = shapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[beginDigitizeOptions]
  }
  @scala.inline
  implicit class beginDigitizeOptionsOps[Self <: beginDigitizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShapeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircleEndAction(value: /* circle */ polygon => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleEndAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCircleEndAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleEndAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvelopeEndAction(value: /* env */ envelope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopeEndAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnvelopeEndAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopeEndAction")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryStyle(value: geometryStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLeavePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavePath")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeMoveAction(value: (/* x */ Double, /* y */ Double, /* actionType */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeMoveAction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNodeMoveAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeMoveAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTapAndHoldAction(value: (/* setIdx */ Double, /* idx */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTapAndHoldAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeTapAndHoldAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTapAndHoldAction")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeChangeAction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeChangeAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShapeChangeAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeChangeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withStyledGeometry(value: styledGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyledGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressNodeAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNodeAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressNodeAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNodeAdd")(js.undefined)
        ret
    }
  }
  
}

