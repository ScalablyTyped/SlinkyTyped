package typingsSlinky.activexDashAdox

import typingsSlinky.activexDashAdox.ADOX.Catalog
import typingsSlinky.activexDashAdox.ADOX.Column
import typingsSlinky.activexDashAdox.ADOX.Group
import typingsSlinky.activexDashAdox.ADOX.Index
import typingsSlinky.activexDashAdox.ADOX.Key
import typingsSlinky.activexDashAdox.ADOX.Table
import typingsSlinky.activexDashAdox.ADOX.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("ADOX.Catalog")
  var ADOXDotCatalog: Catalog
  @JSName("ADOX.Column")
  var ADOXDotColumn: Column
  @JSName("ADOX.Group")
  var ADOXDotGroup: Group
  @JSName("ADOX.Index")
  var ADOXDotIndex: Index
  @JSName("ADOX.Key")
  var ADOXDotKey: Key
  @JSName("ADOX.Table")
  var ADOXDotTable: Table
  @JSName("ADOX.User")
  var ADOXDotUser: User
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
}

