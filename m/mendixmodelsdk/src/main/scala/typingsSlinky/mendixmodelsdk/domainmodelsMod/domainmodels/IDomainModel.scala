package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/domain-model relevant section in reference guide}
  */
@js.native
trait IDomainModel extends IModuleDocument {
  
  val associations: IList[IAssociation] = js.native
  
  val crossAssociations: IList[ICrossAssociation] = js.native
  
  val entities: IList[IEntity] = js.native
}
