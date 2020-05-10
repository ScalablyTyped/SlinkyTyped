package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLibraryDimensionDef
  */
@js.native
trait INxLibraryDimensionDef extends js.Object {
  /**
    * Array of dimension names.
    */
  var qFieldDefs: js.Array[String] = js.native
  /**
    * Array of dimension labels.
    */
  var qFieldLabels: js.Array[String] = js.native
  /**
    * Information about the grouping.
    */
  var qGrouping: NxGrpType = js.native
  /**
    * no docu
    */
  var qLabelExpression: String = js.native
}

object INxLibraryDimensionDef {
  @scala.inline
  def apply(
    qFieldDefs: js.Array[String],
    qFieldLabels: js.Array[String],
    qGrouping: NxGrpType,
    qLabelExpression: String
  ): INxLibraryDimensionDef = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qFieldLabels = qFieldLabels.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qLabelExpression = qLabelExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
  @scala.inline
  implicit class INxLibraryDimensionDefOps[Self <: INxLibraryDimensionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldDefs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFieldLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLabelExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabelExpression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

