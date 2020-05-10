package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedField...
  */
@js.native
trait INxDerivedField extends js.Object {
  /**
    * Expression of the derived field.
    * Example:
    * If qName is OrderDate.MyDefinition.Year,
    * the expression is as follows:
    *
    * =${Mydefinition(OrderDate).Year}
    */
  var qExpr: String = js.native
  /**
    * Identifier of the derived field.
    * >> The identifier is unique.
    */
  var qId: String = js.native
  /**
    * Method name associated to the derived field.
    */
  var qMethod: String = js.native
  /**
    * Combination of field name, definition and method.
    * Example:
    * OrderDate.MyDefinition.Year
    */
  var qName: String = js.native
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
}

object INxDerivedField {
  @scala.inline
  def apply(qExpr: String, qId: String, qMethod: String, qName: String, qTags: js.Array[String]): INxDerivedField = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qMethod = qMethod.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedField]
  }
  @scala.inline
  implicit class INxDerivedFieldOps[Self <: INxDerivedField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
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

