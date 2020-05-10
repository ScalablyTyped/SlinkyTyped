package typingsSlinky.loglevelPluginPrefix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoglevelPluginPrefixOptions extends js.Object {
  var format: js.UndefOr[
    js.Function3[
      /* level */ String, 
      /* name */ js.UndefOr[String], 
      /* timestamp */ js.Date, 
      js.UndefOr[String]
    ]
  ] = js.native
  var levelFormatter: js.UndefOr[js.Function1[/* level */ String, String]] = js.native
  var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], String]] = js.native
  var template: js.UndefOr[String] = js.native
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
}

object LoglevelPluginPrefixOptions {
  @scala.inline
  def apply(): LoglevelPluginPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoglevelPluginPrefixOptions]
  }
  @scala.inline
  implicit class LoglevelPluginPrefixOptionsOps[Self <: LoglevelPluginPrefixOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(
      value: (/* level */ String, /* name */ js.UndefOr[String], /* timestamp */ js.Date) => js.UndefOr[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFormatter(value: /* level */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLevelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFormatter(value: /* name */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNameFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampFormatter(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimestampFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormatter")(js.undefined)
        ret
    }
  }
  
}

