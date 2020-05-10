package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlWriteOptions extends js.Object {
  /** The characters to use to create an indent in the XML data. Default: \t */
  var indentChars: js.UndefOr[String] = js.native
  /** The characters to use to create a new line in the XML data. Default: \r\n */
  var newLineChars: js.UndefOr[String] = js.native
  /** A boolean indicating if the generated XML should be use new lines and indents to make the generated nicely formatted. Default: true */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if Location and LocationRect values should be rounded off to 6 decimals. Default: false */
  var roundLocations: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating if the shapes should be made valid before writing. If set to true, will use the
    * Geometry.makeValid function of the SpatialMath module. Default: false
    */
  var validate: js.UndefOr[Boolean] = js.native
  /** The XML format to write the shapes to. Default: Kml */
  var xmlFormat: js.UndefOr[GeoXmlFormat] = js.native
}

object IGeoXmlWriteOptions {
  @scala.inline
  def apply(): IGeoXmlWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlWriteOptions]
  }
  @scala.inline
  implicit class IGeoXmlWriteOptionsOps[Self <: IGeoXmlWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentChars")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLineChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLineChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineChars")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlFormat(value: GeoXmlFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlFormat")(js.undefined)
        ret
    }
  }
  
}

