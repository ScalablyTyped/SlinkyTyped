package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
@js.native
trait IEntityType extends IDataType {
  /**
    * This property is required and cannot be set to null.
    */
  val entity: IEntity = js.native
  val entityQualifiedName: String = js.native
}

