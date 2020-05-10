package typingsSlinky.formSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[Result] extends js.Object {
  /** If true serialize disabled fields. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** If true serialize empty fields */
  var empty: js.UndefOr[Boolean] = js.native
  /** Configure the output type. If true, the output will be a js object. */
  var hash: js.UndefOr[Boolean] = js.native
  /**
    * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
    * value) and should return new result hash and url encoded str serializers are provided with this module
    */
  var serializer: js.UndefOr[js.Function3[/* result */ Result, /* key */ String, /* value */ String, Result]] = js.native
}

object Options {
  @scala.inline
  def apply[Result](): Options[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Result]]
  }
  @scala.inline
  implicit class OptionsOps[Self[result] <: Options[result], Result] (val x: Self[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Result] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Result] with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: (/* result */ Result, /* key */ String, /* value */ String) => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSerializer: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
  }
  
}

