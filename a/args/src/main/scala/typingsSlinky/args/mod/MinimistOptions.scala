package typingsSlinky.args.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimistOptions extends js.Object {
  var `--`: js.UndefOr[Boolean] = js.native
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var default: js.UndefOr[StringDictionary[js.Any]] = js.native
  var stopEarly: js.UndefOr[Boolean] = js.native
  var string: js.UndefOr[String | js.Array[String]] = js.native
  var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.native
}

object MinimistOptions {
  @scala.inline
  def apply(): MinimistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimistOptions]
  }
  @scala.inline
  implicit class MinimistOptionsOps[Self <: MinimistOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with--`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without--`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(js.undefined)
        ret
    }
    @scala.inline
    def withAlias(value: StringDictionary[String | js.Array[String]]): Self = {
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
    def withBoolean(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEarly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: /* param */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

