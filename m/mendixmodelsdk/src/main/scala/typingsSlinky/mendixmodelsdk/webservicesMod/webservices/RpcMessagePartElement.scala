package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement")
@js.native
class RpcMessagePartElement protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsRpcOperationElement: RpcOperationElement = js.native
  
  def elementName: String = js.native
  def elementName_=(newValue: String): Unit = js.native
  
  def partName: String = js.native
  def partName_=(newValue: String): Unit = js.native
  
  def typeName: String = js.native
  def typeName_=(newValue: String): Unit = js.native
}
object RpcMessagePartElement {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement.create")
  @js.native
  def create(model: IModel): RpcMessagePartElement = js.native
  
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
    * of the parent RpcOperationElement element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement.createIn")
  @js.native
  def createIn(container: RpcOperationElement): RpcMessagePartElement = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
