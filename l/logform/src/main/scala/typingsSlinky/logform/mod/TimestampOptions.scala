package typingsSlinky.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampOptions extends js.Object {
  /**
    * The name of an alias for the timestamp property, that will be added to the `info` object.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Either the format as a string accepted by the [fecha](https://github.com/taylorhakes/fecha)
    * module or a function that returns a formatted date. If no format is provided `new
    * Date().toISOString()` will be used.
    */
  var format: js.UndefOr[String] = js.native
}

object TimestampOptions {
  @scala.inline
  def apply(): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampOptions]
  }
  @scala.inline
  implicit class TimestampOptionsOps[Self <: TimestampOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

