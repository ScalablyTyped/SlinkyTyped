package typingsSlinky.expressMyconnection

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressMyconnection.anon.Typeofmysql
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.mysql.mod.ConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
