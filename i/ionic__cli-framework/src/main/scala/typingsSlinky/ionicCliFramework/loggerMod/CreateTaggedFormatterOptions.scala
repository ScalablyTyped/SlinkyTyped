package typingsSlinky.ionicCliFramework.loggerMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.formatMod.WordWrapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaggedFormatterOptions extends js.Object {
  var colors: js.UndefOr[Colors] = js.native
  var prefix: js.UndefOr[String | js.Function0[String]] = js.native
  var titleize: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean | WordWrapOptions] = js.native
}

object CreateTaggedFormatterOptions {
  @scala.inline
  def apply(): CreateTaggedFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaggedFormatterOptions]
  }
  @scala.inline
  implicit class CreateTaggedFormatterOptionsOps[Self <: CreateTaggedFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefix(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleize")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean | WordWrapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

