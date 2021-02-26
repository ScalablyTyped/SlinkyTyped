package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.IODataKeyPart
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeType")
@js.native
abstract class AttributeType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAttribute: Attribute = js.native
  @JSName("containerAsAttribute")
  val containerAsAttribute_FAttributeType: IAttribute = js.native
  
  def containerAsEntityKeyPart: EntityKeyPart = js.native
  @JSName("containerAsEntityKeyPart")
  val containerAsEntityKeyPart_FAttributeType: IEntityKeyPart = js.native
  
  def containerAsODataKeyPart: ODataKeyPart = js.native
  @JSName("containerAsODataKeyPart")
  val containerAsODataKeyPart_FAttributeType: IODataKeyPart = js.native
}
object AttributeType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
