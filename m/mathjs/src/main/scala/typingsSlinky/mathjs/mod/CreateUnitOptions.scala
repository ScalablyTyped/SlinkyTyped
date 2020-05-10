package typingsSlinky.mathjs.mod

import typingsSlinky.mathjs.mathjsStrings.binary_long
import typingsSlinky.mathjs.mathjsStrings.binary_short
import typingsSlinky.mathjs.mathjsStrings.long
import typingsSlinky.mathjs.mathjsStrings.none
import typingsSlinky.mathjs.mathjsStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUnitOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var `override`: js.UndefOr[Boolean] = js.native
  var prefixes: js.UndefOr[none | short | long | binary_short | binary_long] = js.native
}

object CreateUnitOptions {
  @scala.inline
  def apply(): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnitOptions]
  }
  @scala.inline
  implicit class CreateUnitOptionsOps[Self <: CreateUnitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixes(value: none | short | long | binary_short | binary_long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(js.undefined)
        ret
    }
  }
  
}

