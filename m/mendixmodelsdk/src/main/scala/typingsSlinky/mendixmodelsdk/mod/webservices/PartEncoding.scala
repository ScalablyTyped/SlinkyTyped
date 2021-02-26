package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.PartEncoding")
@js.native
class PartEncoding protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.PartEncoding {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PartEncoding {
  
  @JSImport("mendixmodelsdk", "webservices.PartEncoding")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PartEncoding.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PartEncoding.createInOperationInfoUnderRequestBodyPartEncodings")
  @js.native
  def createInOperationInfoUnderRequestBodyPartEncodings(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PartEncoding.createInOperationInfoUnderRequestHeaderPartEncoding")
  @js.native
  def createInOperationInfoUnderRequestHeaderPartEncoding(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PartEncoding.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PartEncoding.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
