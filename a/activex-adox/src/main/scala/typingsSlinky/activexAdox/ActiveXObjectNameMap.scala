package typingsSlinky.activexAdox

import typingsSlinky.activexAdox.ADOX.Catalog
import typingsSlinky.activexAdox.ADOX.Column
import typingsSlinky.activexAdox.ADOX.Group
import typingsSlinky.activexAdox.ADOX.Index
import typingsSlinky.activexAdox.ADOX.Key
import typingsSlinky.activexAdox.ADOX.Table
import typingsSlinky.activexAdox.ADOX.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ADOX.Catalog")
  var ADOXDotCatalog: Catalog = js.native
  
  @JSName("ADOX.Column")
  var ADOXDotColumn: Column = js.native
  
  @JSName("ADOX.Group")
  var ADOXDotGroup: Group = js.native
  
  @JSName("ADOX.Index")
  var ADOXDotIndex: Index = js.native
  
  @JSName("ADOX.Key")
  var ADOXDotKey: Key = js.native
  
  @JSName("ADOX.Table")
  var ADOXDotTable: Table = js.native
  
  @JSName("ADOX.User")
  var ADOXDotUser: User = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
    ADOXDotCatalog: Catalog,
    ADOXDotColumn: Column,
    ADOXDotGroup: Group,
    ADOXDotIndex: Index,
    ADOXDotKey: Key,
    ADOXDotTable: Table,
    ADOXDotUser: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADOX.Catalog")(ADOXDotCatalog.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Column")(ADOXDotColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Group")(ADOXDotGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Index")(ADOXDotIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Key")(ADOXDotKey.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Table")(ADOXDotTable.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.User")(ADOXDotUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADOXDotCatalog(value: Catalog): Self = StObject.set(x, "ADOX.Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotColumn(value: Column): Self = StObject.set(x, "ADOX.Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotGroup(value: Group): Self = StObject.set(x, "ADOX.Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotIndex(value: Index): Self = StObject.set(x, "ADOX.Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotKey(value: Key): Self = StObject.set(x, "ADOX.Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotTable(value: Table): Self = StObject.set(x, "ADOX.Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotUser(value: User): Self = StObject.set(x, "ADOX.User", value.asInstanceOf[js.Any])
  }
}
