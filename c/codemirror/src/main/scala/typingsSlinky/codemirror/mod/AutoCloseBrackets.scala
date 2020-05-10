package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCloseBrackets extends js.Object {
  /**
    * If the next character is in the string, opening a bracket should be auto-closed.
    */
  var closeBefore: js.UndefOr[String] = js.native
  /**
    * explode should be a similar string that gives the pairs of characters that, when enter is pressed between them, should have the second character also moved to its own line.
    */
  var explode: js.UndefOr[String] = js.native
  /**
    * By default, if the active mode has a closeBrackets property, that overrides the configuration given in the option.
    * But you can add an override property with a truthy value to override mode-specific configuration.
    */
  var `override`: js.UndefOr[Boolean] = js.native
  /**
    * String containing pairs of matching characters.
    */
  var pairs: js.UndefOr[String] = js.native
  /**
    * String containing chars that could do a triple quote.
    */
  var triples: js.UndefOr[String] = js.native
}

object AutoCloseBrackets {
  @scala.inline
  def apply(): AutoCloseBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCloseBrackets]
  }
  @scala.inline
  implicit class AutoCloseBracketsOps[Self <: AutoCloseBrackets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withExplode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explode")(js.undefined)
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
    def withPairs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(js.undefined)
        ret
    }
    @scala.inline
    def withTriples(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triples")(js.undefined)
        ret
    }
  }
  
}

