package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initial State for shielded instance, these are public keys which are safe
  * to store in public
  */
@js.native
trait SchemaInitialStateConfig extends StObject {
  
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[SchemaFileContentBuffer] = js.native
}
object SchemaInitialStateConfig {
  
  @scala.inline
  def apply(): SchemaInitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitialStateConfig]
  }
  
  @scala.inline
  implicit class SchemaInitialStateConfigMutableBuilder[Self <: SchemaInitialStateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbs(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "dbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbsUndefined: Self = StObject.set(x, "dbs", js.undefined)
    
    @scala.inline
    def setDbsVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "dbs", js.Array(value :_*))
    
    @scala.inline
    def setDbxs(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "dbxs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbxsUndefined: Self = StObject.set(x, "dbxs", js.undefined)
    
    @scala.inline
    def setDbxsVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "dbxs", js.Array(value :_*))
    
    @scala.inline
    def setKeks(value: js.Array[SchemaFileContentBuffer]): Self = StObject.set(x, "keks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeksUndefined: Self = StObject.set(x, "keks", js.undefined)
    
    @scala.inline
    def setKeksVarargs(value: SchemaFileContentBuffer*): Self = StObject.set(x, "keks", js.Array(value :_*))
    
    @scala.inline
    def setPk(value: SchemaFileContentBuffer): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
  }
}
