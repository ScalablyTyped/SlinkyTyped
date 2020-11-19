package typingsSlinky.mockKnex.mod

import typingsSlinky.mockKnex.mod.Knex.Sql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDetails extends Sql {
  
  def reject(error: String): Unit = js.native
  /**
    * Function that needs to be called to mock database query result for knex.
    *
    * @param error The Error, string or instance of Error, which represents why the result was rejected
    */
  def reject(error: js.Error): Unit = js.native
  
  /**
    * Function that needs to be called to mock database query result for knex.
    *
    * @param values An array of mock data to be returned by database. For Bookshelf this is mostly array of objects. Knex could return any type of data.
    */
  def response(values: js.Any): Unit = js.native
  def response(values: js.Any, options: QueryDetailsResponseOption): Unit = js.native
  
  var transacting: Boolean = js.native
}
