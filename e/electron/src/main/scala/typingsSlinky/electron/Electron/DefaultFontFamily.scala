package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFontFamily extends js.Object {
  /**
    * Defaults to Script.
    */
  var cursive: js.UndefOr[String] = js.native
  /**
    * Defaults to Impact.
    */
  var fantasy: js.UndefOr[String] = js.native
  /**
    * Defaults to Courier New.
    */
  var monospace: js.UndefOr[String] = js.native
  /**
    * Defaults to Arial.
    */
  var sansSerif: js.UndefOr[String] = js.native
  /**
    * Defaults to Times New Roman.
    */
  var serif: js.UndefOr[String] = js.native
  /**
    * Defaults to Times New Roman.
    */
  var standard: js.UndefOr[String] = js.native
}

object DefaultFontFamily {
  @scala.inline
  def apply(): DefaultFontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultFontFamily]
  }
  @scala.inline
  implicit class DefaultFontFamilyOps[Self <: DefaultFontFamily] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursive")(js.undefined)
        ret
    }
    @scala.inline
    def withFantasy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fantasy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFantasy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fantasy")(js.undefined)
        ret
    }
    @scala.inline
    def withMonospace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monospace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonospace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monospace")(js.undefined)
        ret
    }
    @scala.inline
    def withSansSerif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sansSerif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSansSerif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sansSerif")(js.undefined)
        ret
    }
    @scala.inline
    def withSerif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serif")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
  }
  
}

