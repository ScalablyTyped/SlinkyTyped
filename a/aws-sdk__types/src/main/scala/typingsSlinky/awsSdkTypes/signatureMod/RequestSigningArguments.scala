package typingsSlinky.awsSdkTypes.signatureMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSigningArguments extends SigningArguments {
  /**
    * A set of strings whose members represents headers that cannot be signed.
    * All headers in the provided request will have their names converted to
    * lower case and then checked for existence in the unsignableHeaders set.
    */
  var unsignableHeaders: js.UndefOr[Set[String]] = js.native
}

object RequestSigningArguments {
  @scala.inline
  def apply(): RequestSigningArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSigningArguments]
  }
  @scala.inline
  implicit class RequestSigningArgumentsOps[Self <: RequestSigningArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsignableHeaders(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsignableHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsignableHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsignableHeaders")(js.undefined)
        ret
    }
  }
  
}

