package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase")
@js.native
class EnumerationCase protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EnumerationCase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EnumerationCase {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EnumerationCase instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EnumerationCase = js.native
  
  /**
    * Creates and returns a new EnumerationCase instance in the SDK and on the server.
    * The new EnumerationCase will be automatically stored in the 'caseValue' property
    * of the parent SequenceFlow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SequenceFlow): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EnumerationCase = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EnumerationCase.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
