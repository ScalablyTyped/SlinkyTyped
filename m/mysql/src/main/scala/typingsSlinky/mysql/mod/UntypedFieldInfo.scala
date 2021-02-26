package typingsSlinky.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntypedFieldInfo extends StObject {
  
  var default: js.UndefOr[String] = js.native
  
  var catalog: String = js.native
  
  var charsetNr: Double = js.native
  
  var db: String = js.native
  
  var decimals: Double = js.native
  
  var flags: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var orgName: String = js.native
  
  var orgTable: String = js.native
  
  var protocol41: Boolean = js.native
  
  var table: String = js.native
  
  var zeroFill: Boolean = js.native
}
object UntypedFieldInfo {
  
  @scala.inline
  def apply(
    catalog: String,
    charsetNr: Double,
    db: String,
    decimals: Double,
    flags: Double,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    table: String,
    zeroFill: Boolean
  ): UntypedFieldInfo = {
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], zeroFill = zeroFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntypedFieldInfo]
  }
  
  @scala.inline
  implicit class UntypedFieldInfoMutableBuilder[Self <: UntypedFieldInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetNr(value: Double): Self = StObject.set(x, "charsetNr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgName(value: String): Self = StObject.set(x, "orgName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgTable(value: String): Self = StObject.set(x, "orgTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol41(value: Boolean): Self = StObject.set(x, "protocol41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroFill(value: Boolean): Self = StObject.set(x, "zeroFill", value.asInstanceOf[js.Any])
  }
}
