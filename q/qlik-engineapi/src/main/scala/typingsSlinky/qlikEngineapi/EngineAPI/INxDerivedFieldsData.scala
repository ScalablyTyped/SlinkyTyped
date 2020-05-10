package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedFieldsData...
  */
@js.native
trait INxDerivedFieldsData extends js.Object {
  /**
    * Name of the derived definition.
    */
  var qDerivedDefinitionName: String = js.native
  /**
    * List of the derived fields.
    */
  var qFieldDefs: js.Array[INxDerivedField] = js.native
  /**
    * List of the derived groups.
    */
  var qGroupDefs: js.Array[INxDerivedGroup] = js.native
  /**
    * List of tags on the derived fields.
    */
  var qTags: js.Array[String] = js.native
}

object INxDerivedFieldsData {
  @scala.inline
  def apply(
    qDerivedDefinitionName: String,
    qFieldDefs: js.Array[INxDerivedField],
    qGroupDefs: js.Array[INxDerivedGroup],
    qTags: js.Array[String]
  ): INxDerivedFieldsData = {
    val __obj = js.Dynamic.literal(qDerivedDefinitionName = qDerivedDefinitionName.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGroupDefs = qGroupDefs.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldsData]
  }
  @scala.inline
  implicit class INxDerivedFieldsDataOps[Self <: INxDerivedFieldsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDerivedDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDerivedDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFieldDefs(value: js.Array[INxDerivedField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupDefs(value: js.Array[INxDerivedGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

