package typingsSlinky.radius.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusencodeargs} for more info.
  **/
@js.native
trait EncodeArgs extends js.Object {
  var add_message_authenticator: js.UndefOr[Boolean] = js.native
  /**
    * This can be an object: { attribute_name: attribute_value, ... }, 
    * an array within an array: [ [ attribute_name, attribute_value ], ... ],
    * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
    * 
    * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
    **/
  var attributes: js.UndefOr[js.Any] = js.native
  var code: String = js.native
  var identifier: js.UndefOr[Double] = js.native
  var secret: String = js.native
}

object EncodeArgs {
  @scala.inline
  def apply(code: String, secret: String): EncodeArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeArgs]
  }
  @scala.inline
  implicit class EncodeArgsOps[Self <: EncodeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd_message_authenticator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_message_authenticator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd_message_authenticator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_message_authenticator")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
  }
  
}

