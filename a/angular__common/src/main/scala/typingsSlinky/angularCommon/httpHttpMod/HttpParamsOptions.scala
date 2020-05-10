package typingsSlinky.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options used to construct an `HttpParams` instance.
  *
  * @publicApi
  */
@js.native
trait HttpParamsOptions extends js.Object {
  /** Encoding codec used to parse and serialize the parameters. */
  var encoder: js.UndefOr[HttpParameterCodec] = js.native
  /** Object map of the HTTP parameters. Mutually exclusive with `fromString`. */
  var fromObject: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  /**
    * String representation of the HTTP parameters in URL-query-string format.
    * Mutually exclusive with `fromObject`.
    */
  var fromString: js.UndefOr[String] = js.native
}

object HttpParamsOptions {
  @scala.inline
  def apply(): HttpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParamsOptions]
  }
  @scala.inline
  implicit class HttpParamsOptionsOps[Self <: HttpParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoder(value: HttpParameterCodec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withFromObject(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromObject")(js.undefined)
        ret
    }
    @scala.inline
    def withFromString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromString")(js.undefined)
        ret
    }
  }
  
}

