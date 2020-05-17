package typingsSlinky.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  var methods: StringDictionary[MethodConfig | Null] = js.native
  var retry_codes: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var retry_params: js.UndefOr[StringDictionary[RetryParamsConfig]] = js.native
}

object ServiceConfig {
  @scala.inline
  def apply(methods: StringDictionary[MethodConfig | Null]): ServiceConfig = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: StringDictionary[MethodConfig | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry_codes(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_codes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_codes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_codes")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_params(value: StringDictionary[RetryParamsConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_params")(js.undefined)
        ret
    }
  }
  
}

