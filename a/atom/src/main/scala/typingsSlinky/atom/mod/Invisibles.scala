package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invisibles extends js.Object {
  /**
    *  Character used to render carriage return characters (for Microsoft-style line
    *  endings) when the `Show Invisibles` setting is enabled.
    */
  var cr: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render newline characters (\n) when the `Show Invisibles`
    *  setting is enabled.
    */
  var eol: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render leading and trailing space characters when the
    *  `Show Invisibles` setting is enabled.
    */
  var space: js.UndefOr[Boolean | String] = js.native
  /**
    *  Character used to render hard tab characters (\t) when the `Show Invisibles`
    *  setting is enabled.
    */
  var tab: js.UndefOr[Boolean | String] = js.native
}

object Invisibles {
  @scala.inline
  def apply(): Invisibles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invisibles]
  }
  @scala.inline
  implicit class InvisiblesOps[Self <: Invisibles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCr(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cr")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
  }
  
}

