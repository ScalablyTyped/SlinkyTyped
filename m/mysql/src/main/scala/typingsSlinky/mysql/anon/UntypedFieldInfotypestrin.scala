package typingsSlinky.mysql.anon

import typingsSlinky.mysql.mod.GeometryType
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mysql.mysql.UntypedFieldInfo & {  type  :string,   length  :number, string (): string, buffer (): node.Buffer, geometry (): null | mysql.mysql.GeometryType} */
@js.native
trait UntypedFieldInfotypestrin extends js.Object {
  var catalog: String = js.native
  var charsetNr: Double = js.native
  var db: String = js.native
  var decimals: Double = js.native
  var default: js.UndefOr[String] = js.native
  var flags: Double = js.native
  var length: Double = js.native
  var name: String = js.native
  var orgName: String = js.native
  var orgTable: String = js.native
  var protocol41: Boolean = js.native
  var table: String = js.native
  var `type`: String = js.native
  var zeroFill: Boolean = js.native
  def buffer(): Buffer = js.native
  def geometry(): Null | GeometryType = js.native
  def string(): String = js.native
}

object UntypedFieldInfotypestrin {
  @scala.inline
  def apply(
    buffer: () => Buffer,
    catalog: String,
    charsetNr: Double,
    db: String,
    decimals: Double,
    flags: Double,
    geometry: () => Null | GeometryType,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    string: () => String,
    table: String,
    `type`: String,
    zeroFill: Boolean
  ): UntypedFieldInfotypestrin = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], geometry = js.Any.fromFunction0(geometry), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], string = js.Any.fromFunction0(string), table = table.asInstanceOf[js.Any], zeroFill = zeroFill.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntypedFieldInfotypestrin]
  }
  @scala.inline
  implicit class UntypedFieldInfotypestrinOps[Self <: UntypedFieldInfotypestrin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCatalog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharsetNr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetNr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: () => Null | GeometryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrgName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrgTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol41(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol41")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

