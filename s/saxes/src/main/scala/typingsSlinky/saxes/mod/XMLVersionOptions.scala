package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesStrings.`1Dot0`
import typingsSlinky.saxes.saxesStrings.`1Dot1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLVersionOptions extends js.Object {
  /**
    * The default XML version to use. If unspecified, and there is no XML
    * encoding declaration, the default version is "1.0".
    */
  var defaultXMLVersion: js.UndefOr[`1Dot0` | `1Dot1`] = js.native
  /**
    * A flag indicating whether to force the XML version used for parsing to the
    * value of ``defaultXMLVersion``. When this flag is ``true``,
    * ``defaultXMLVersion`` must be specified. If unspecified, the default value
    * of this flag is ``false``.
    */
  var forceXMLVersion: js.UndefOr[Boolean] = js.native
}

object XMLVersionOptions {
  @scala.inline
  def apply(): XMLVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLVersionOptions]
  }
  @scala.inline
  implicit class XMLVersionOptionsOps[Self <: XMLVersionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultXMLVersion(value: `1Dot0` | `1Dot1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultXMLVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXMLVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withForceXMLVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceXMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceXMLVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceXMLVersion")(js.undefined)
        ret
    }
  }
  
}

