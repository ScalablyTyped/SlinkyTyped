package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of columns within a table which share a common configuration.
  */
@js.native
trait SchemaColumnFamily extends StObject {
  
  /**
    * Garbage collection rule specified as a protobuf. Must serialize to at
    * most 500 bytes.  NOTE: Garbage collection executes opportunistically in
    * the background, and so it&#39;s possible for reads to return a cell even
    * if it matches the active GC expression for its family.
    */
  var gcRule: js.UndefOr[SchemaGcRule] = js.native
}
object SchemaColumnFamily {
  
  @scala.inline
  def apply(): SchemaColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnFamily]
  }
  
  @scala.inline
  implicit class SchemaColumnFamilyMutableBuilder[Self <: SchemaColumnFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcRule(value: SchemaGcRule): Self = StObject.set(x, "gcRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcRuleUndefined: Self = StObject.set(x, "gcRule", js.undefined)
  }
}
