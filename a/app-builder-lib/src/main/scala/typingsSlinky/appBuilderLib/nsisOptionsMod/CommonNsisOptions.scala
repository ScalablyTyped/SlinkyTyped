package typingsSlinky.appBuilderLib.nsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonNsisOptions extends js.Object {
  /**
    * See [GUID vs Application Name](../configuration/nsis#guid-vs-application-name).
    */
  val guid: js.UndefOr[String | Null] = js.native
  /**
    * Whether to create [Unicode installer](http://nsis.sourceforge.net/Docs/Chapter1.html#intro-unicode).
    * @default true
    */
  val unicode: js.UndefOr[Boolean] = js.native
  /**
    * @private
    * @default false
    */
  val useZip: js.UndefOr[Boolean] = js.native
  /**
    * If `warningsAsErrors` is `true` (default): NSIS will treat warnings as errors. If `warningsAsErrors` is `false`: NSIS will allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[Boolean] = js.native
}

object CommonNsisOptions {
  @scala.inline
  def apply(): CommonNsisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonNsisOptions]
  }
  @scala.inline
  implicit class CommonNsisOptionsOps[Self <: CommonNsisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withGuidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(null)
        ret
    }
    @scala.inline
    def withUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(js.undefined)
        ret
    }
    @scala.inline
    def withUseZip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZip")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningsAsErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsAsErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningsAsErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsAsErrors")(js.undefined)
        ret
    }
  }
  
}

