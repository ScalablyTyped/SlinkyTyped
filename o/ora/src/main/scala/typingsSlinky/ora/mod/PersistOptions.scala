package typingsSlinky.ora.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistOptions extends js.Object {
  /**
  		Text to be persisted before the symbol. No prefix text will be displayed if set to an empty string.
  		Default: Current `prefixText`.
  		*/
  val prefixText: js.UndefOr[String] = js.native
  /**
  		Symbol to replace the spinner with.
  		@default ' '
  		*/
  val symbol: js.UndefOr[String] = js.native
  /**
  		Text to be persisted after the symbol.
  		Default: Current `text`.
  		*/
  val text: js.UndefOr[String] = js.native
}

object PersistOptions {
  @scala.inline
  def apply(): PersistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistOptions]
  }
  @scala.inline
  implicit class PersistOptionsOps[Self <: PersistOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

