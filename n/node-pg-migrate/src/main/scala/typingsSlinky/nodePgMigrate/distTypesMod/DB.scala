package typingsSlinky.nodePgMigrate.distTypesMod

import typingsSlinky.pg.mod.QueryArrayConfig
import typingsSlinky.pg.mod.QueryArrayResult
import typingsSlinky.pg.mod.QueryConfig
import typingsSlinky.pg.mod.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DB extends StObject {
  
  def query(queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[QueryArrayResult[js.Array[_]]] = js.native
  def query(queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[QueryArrayResult[js.Array[_]]] = js.native
  def query(queryConfig: QueryConfig[js.Array[_]]): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: String, values: js.Array[_]): js.Promise[QueryResult[_]] = js.native
  def query(queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[QueryResult[_]] = js.native
  
  def select(queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
  def select(queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryConfig: QueryConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def select(queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
}
