package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedGroup...
  */
@js.native
trait INxDerivedGroup extends js.Object {
  /**
    * List of the derived fields in the group.
    */
  var qFieldDefs: js.Array[String] = js.native
  /**
    * Grouping type.
    * The grouping should be either H or C (Grouping is mandatory for derived definitions).
    * >> Is mandatory.
    */
  var qGrouping: NxGrpType = js.native
  /**
    * Identifier of the group.
    */
  var qId: String = js.native
  /**
    * Name of the derived group.
    */
  var qName: String = js.native
}

object INxDerivedGroup {
  @scala.inline
  def apply(qFieldDefs: js.Array[String], qGrouping: NxGrpType, qId: String, qName: String): INxDerivedGroup = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedGroup]
  }
  @scala.inline
  implicit class INxDerivedGroupOps[Self <: INxDerivedGroup] (val x: Self) extends AnyVal {
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
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

