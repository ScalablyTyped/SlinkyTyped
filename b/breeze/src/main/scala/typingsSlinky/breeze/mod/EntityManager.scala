package typingsSlinky.breeze.mod

import typingsSlinky.breeze.AnonMergeStrategy
import typingsSlinky.breeze.breeze.EntityManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends typingsSlinky.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}

/* static members */
@JSImport("breeze", "EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): typingsSlinky.breeze.breeze.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: AnonMergeStrategy): typingsSlinky.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String): typingsSlinky.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String, config: AnonMergeStrategy): typingsSlinky.breeze.breeze.EntityManager = js.native
}

