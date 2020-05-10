package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropertiesReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.native
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor] = js.native
}

object GetPropertiesReturnType {
  @scala.inline
  def apply(result: js.Array[PropertyDescriptor]): GetPropertiesReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesReturnType]
  }
  @scala.inline
  implicit class GetPropertiesReturnTypeOps[Self <: GetPropertiesReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: js.Array[PropertyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptionDetails(value: ExceptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalProperties")(js.undefined)
        ret
    }
  }
  
}

