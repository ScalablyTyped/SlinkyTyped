package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ContextStatus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datasource[K, D] extends js.Object {
  
  var datasource: (DataProvider[K, D]) | Null = js.native
  
  var mode: edit | navigation = js.native
  
  var status: ContextStatus[K] = js.native
}
object Datasource {
  
  @scala.inline
  def apply[K, D](mode: edit | navigation, status: ContextStatus[K]): Datasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datasource[K, D]]
  }
  
  @scala.inline
  implicit class DatasourceOps[Self <: Datasource[_, _], K, D] (val x: Self with (Datasource[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: edit | navigation): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ContextStatus[K]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourceNull: Self = this.set("datasource", null)
  }
}
