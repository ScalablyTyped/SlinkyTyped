package typingsSlinky.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[Data] extends js.Object {
  /**
    * Constructor reference used to crop the exception call stack output
    */
  var ctor: js.UndefOr[js.Function] = js.native
  /**
    * Additional error information
    */
  var data: js.UndefOr[Data] = js.native
  /**
    * Error message string
    *
    * @default none
    */
  var message: js.UndefOr[String] = js.native
  /**
    * If false, the err provided is a Boom object, and a statusCode or message are provided, the values are ignored
    *
    * @default true
    */
  var `override`: js.UndefOr[Boolean] = js.native
  /**
    * The HTTP status code
    *
    * @default 500
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[Data](): Options[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Data]]
  }
  @scala.inline
  implicit class OptionsOps[Self[data] <: Options[data], Data] (val x: Self[Data]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Data] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Data]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Data] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Data] with Other]
    @scala.inline
    def withCtor(value: js.Function): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtor: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctor")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: Boolean): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

