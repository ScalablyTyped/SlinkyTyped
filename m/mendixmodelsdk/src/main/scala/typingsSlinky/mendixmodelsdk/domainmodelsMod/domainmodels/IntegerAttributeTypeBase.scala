package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.INumericAttributeTypeBase because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IIntegerAttributeTypeBase because var conflicts: containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IntegerAttributeTypeBase")
@js.native
abstract class IntegerAttributeTypeBase protected () extends NumericAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MIntegerAttributeTypeBase: Attribute = js.native
  
  @JSName("containerAsEntityKeyPart")
  def containerAsEntityKeyPart_MIntegerAttributeTypeBase: EntityKeyPart = js.native
  
  @JSName("containerAsODataKeyPart")
  def containerAsODataKeyPart_MIntegerAttributeTypeBase: ODataKeyPart = js.native
  
  @JSName("model")
  var model_FIntegerAttributeTypeBase: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IntegerAttributeTypeBase")
@js.native
object IntegerAttributeTypeBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
