package typingsSlinky.feathersjsAuthenticationJwt.anon

import typingsSlinky.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromAuthHeader extends js.Object {
  def fromAuthHeader(): JwtFromRequestFunction = js.native
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
  def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
  def fromHeader(header_name: String): JwtFromRequestFunction = js.native
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
}

object FromAuthHeader {
  @scala.inline
  def apply(
    fromAuthHeader: () => JwtFromRequestFunction,
    fromAuthHeaderAsBearerToken: () => JwtFromRequestFunction,
    fromAuthHeaderWithScheme: String => JwtFromRequestFunction,
    fromBodyField: String => JwtFromRequestFunction,
    fromExtractors: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction,
    fromHeader: String => JwtFromRequestFunction,
    fromUrlQueryParameter: String => JwtFromRequestFunction
  ): FromAuthHeader = {
    val __obj = js.Dynamic.literal(fromAuthHeader = js.Any.fromFunction0(fromAuthHeader), fromAuthHeaderAsBearerToken = js.Any.fromFunction0(fromAuthHeaderAsBearerToken), fromAuthHeaderWithScheme = js.Any.fromFunction1(fromAuthHeaderWithScheme), fromBodyField = js.Any.fromFunction1(fromBodyField), fromExtractors = js.Any.fromFunction1(fromExtractors), fromHeader = js.Any.fromFunction1(fromHeader), fromUrlQueryParameter = js.Any.fromFunction1(fromUrlQueryParameter))
    __obj.asInstanceOf[FromAuthHeader]
  }
  @scala.inline
  implicit class FromAuthHeaderOps[Self <: FromAuthHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromAuthHeader(value: () => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAuthHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFromAuthHeaderAsBearerToken(value: () => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAuthHeaderAsBearerToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFromAuthHeaderWithScheme(value: String => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAuthHeaderWithScheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromBodyField(value: String => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBodyField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromExtractors(value: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromExtractors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromHeader(value: String => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromUrlQueryParameter(value: String => JwtFromRequestFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrlQueryParameter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

