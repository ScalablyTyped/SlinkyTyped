package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLibraryMeasureDef...
  */
@js.native
trait INxLibraryMeasureDef extends js.Object {
  /**
    * Index to the active expression in a measure.
    */
  var qActiveExpression: Double = js.native
  /**
    * Definition of the measure.
    */
  var qDef: String = js.native
  /**
    * Array of expressions.
    */
  var qExpressions: js.Array[String] = js.native
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  /**
    * Label of the measure.
    */
  var qLabel: String = js.native
}

object INxLibraryMeasureDef {
  @scala.inline
  def apply(qActiveExpression: Double, qDef: String, qExpressions: js.Array[String], qLabel: String): INxLibraryMeasureDef = {
    val __obj = js.Dynamic.literal(qActiveExpression = qActiveExpression.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qLabel = qLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryMeasureDef]
  }
  @scala.inline
  implicit class INxLibraryMeasureDefOps[Self <: INxLibraryMeasureDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQActiveExpression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQExpressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(js.undefined)
        ret
    }
  }
  
}

