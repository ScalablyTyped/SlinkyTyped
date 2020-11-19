package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.securityMod.security.IUserRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
class RetrievalQuery protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def allowedUserRoles: IList[IUserRole] = js.native
  
  def allowedUserRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def entityPath: String = js.native
  def entityPath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FRetrievalQuery: IModel = js.native
  
  /**
    * In version 7.14.0: introduced
    */
  def pageName: String = js.native
  def pageName_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def parameters: IList[RetrievalQueryParameter] = js.native
  
  def queryId: String = js.native
  def queryId_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def schemaId: String = js.native
  def schemaId_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def usedAssociations: IList[String] = js.native
  
  /**
    * In version 8.11.0: introduced
    */
  def usedAttributes: IList[String] = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def widgetName: String = js.native
  def widgetName_=(newValue: String): Unit = js.native
  
  def xPath: String = js.native
  def xPath_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
object RetrievalQuery extends js.Object {
  
  /**
    * Creates and returns a new RetrievalQuery instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RetrievalQuery = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
