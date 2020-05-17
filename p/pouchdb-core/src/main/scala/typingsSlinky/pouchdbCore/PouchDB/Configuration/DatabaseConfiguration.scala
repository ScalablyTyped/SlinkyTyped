package typingsSlinky.pouchdbCore.PouchDB.Configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
  - typingsSlinky.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
*/
trait DatabaseConfiguration extends js.Object

object DatabaseConfiguration {
  @scala.inline
  implicit def apply(value: LocalDatabaseConfiguration): DatabaseConfiguration = value.asInstanceOf[DatabaseConfiguration]
  @scala.inline
  implicit def apply(value: RemoteDatabaseConfiguration): DatabaseConfiguration = value.asInstanceOf[DatabaseConfiguration]
}

