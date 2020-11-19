package typingsSlinky.azureKustoData.mod

import typingsSlinky.azureKustoData.anon.Mgmt
import typingsSlinky.azureKustoData.mod.Client.KustoResponseDataSetV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-kusto-data", "Client")
@js.native
class Client_ protected () extends js.Object {
  def this(kcsb: String) = this()
  def this(kcsb: KustoConnectionStringBuilder) = this()
  
  var aadHelper: js.Any = js.native
  
  var cluster: String = js.native
  
  var connectionString: KustoConnectionStringBuilder = js.native
  
  var endpoints: Mgmt = js.native
  
  def execute(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ js.Error, /* results */ KustoResponseDataSetV2[_], Unit]
  ): js.Any = js.native
  def execute(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ js.Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
  
  def executeMgmt(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ js.Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
  
  def executeQuery(
    db: js.Any,
    query: js.Any,
    callback: js.Function2[/* err */ js.Error, /* results */ KustoResponseDataSetV2[_], Unit],
    properties: js.Any
  ): js.Any = js.native
}
