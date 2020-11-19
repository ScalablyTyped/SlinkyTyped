package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IConcreteEntityType extends IEntityType {
  
  /**
    * This property is required and cannot be set to null.
    */
  val entity: IEntity = js.native
  
  val entityQualifiedName: String = js.native
}
