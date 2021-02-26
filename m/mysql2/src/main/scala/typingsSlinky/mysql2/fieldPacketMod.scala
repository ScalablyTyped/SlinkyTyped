package typingsSlinky.mysql2

import typingsSlinky.mysql2.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldPacketMod {
  
  @js.native
  trait FieldPacket extends StObject {
    
    var default: js.Any = js.native
    
    var catalog: String = js.native
    
    var charsetNr: Double = js.native
    
    var constructor: `0` = js.native
    
    var db: String = js.native
    
    var decimals: Double = js.native
    
    var flags: Double = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var orgName: String = js.native
    
    var orgTable: String = js.native
    
    var protocol41: Boolean = js.native
    
    var table: String = js.native
    
    var `type`: Double = js.native
    
    var zerofill: Boolean = js.native
  }
  object FieldPacket {
    
    @scala.inline
    def apply(
      catalog: String,
      charsetNr: Double,
      constructor: `0`,
      db: String,
      decimals: Double,
      default: js.Any,
      flags: Double,
      length: Double,
      name: String,
      orgName: String,
      orgTable: String,
      protocol41: Boolean,
      table: String,
      `type`: Double,
      zerofill: Boolean
    ): FieldPacket = {
      val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], zerofill = zerofill.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPacket]
    }
    
    @scala.inline
    implicit class FieldPacketMutableBuilder[Self <: FieldPacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetNr(value: Double): Self = StObject.set(x, "charsetNr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructor(value: `0`): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
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
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
    }
  }
}
