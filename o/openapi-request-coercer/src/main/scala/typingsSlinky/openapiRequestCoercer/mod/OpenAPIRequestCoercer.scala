package typingsSlinky.openapiRequestCoercer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
  var coerceFormData: js.Any = js.native
  var coerceHeaders: js.Any = js.native
  var coerceParams: js.Any = js.native
  var coerceQuery: js.Any = js.native
  var enableObjectCoercion: js.Any = js.native
  def coerce(request: js.Any): Unit = js.native
}

object OpenAPIRequestCoercer {
  @scala.inline
  def apply(
    coerce: js.Any => Unit,
    coerceFormData: js.Any,
    coerceHeaders: js.Any,
    coerceParams: js.Any,
    coerceQuery: js.Any,
    enableObjectCoercion: js.Any
  ): OpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestCoercer]
  }
  @scala.inline
  implicit class OpenAPIRequestCoercerOps[Self <: OpenAPIRequestCoercer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerce(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCoerceFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceFormData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoerceHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoerceParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoerceQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableObjectCoercion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableObjectCoercion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

