package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define overloaded variants for when  generating code
  */
@js.native
trait OperationDefinitionOverload extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'parameterName'.
    */
  var _parameterName: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Comments to go on overload
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Name of parameter to include in overload
    */
  var parameterName: js.UndefOr[js.Array[String]] = js.native
}

object OperationDefinitionOverload {
  @scala.inline
  def apply(): OperationDefinitionOverload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDefinitionOverload]
  }
  @scala.inline
  implicit class OperationDefinitionOverloadOps[Self <: OperationDefinitionOverload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_comment(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(js.undefined)
        ret
    }
    @scala.inline
    def with_parameterName(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_parameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(js.undefined)
        ret
    }
  }
  
}

