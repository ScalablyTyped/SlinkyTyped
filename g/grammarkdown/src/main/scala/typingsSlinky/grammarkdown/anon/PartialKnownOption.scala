package typingsSlinky.grammarkdown.anon

import typingsSlinky.grammarkdown.optionsMod.RawArguments
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<grammarkdown.grammarkdown/dist/options.KnownOption> */
@js.native
trait PartialKnownOption extends js.Object {
  var aliasFor: js.UndefOr[js.Array[String]] = js.native
  var convert: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, _]] = js.native
  var description: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isUsage: js.UndefOr[Boolean] = js.native
  var longName: js.UndefOr[String] = js.native
  var many: js.UndefOr[Boolean] = js.native
  var param: js.UndefOr[String] = js.native
  var shortName: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | (Map[String, _])] = js.native
  var validate: js.UndefOr[
    js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
  ] = js.native
}

object PartialKnownOption {
  @scala.inline
  def apply(): PartialKnownOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKnownOption]
  }
  @scala.inline
  implicit class PartialKnownOptionOps[Self <: PartialKnownOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFor")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withLongName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longName")(js.undefined)
        ret
    }
    @scala.inline
    def withMany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(js.undefined)
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | (Map[String, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

