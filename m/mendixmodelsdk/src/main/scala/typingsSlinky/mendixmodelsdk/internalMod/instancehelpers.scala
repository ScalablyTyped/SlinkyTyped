package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.instancesMod.InstanceConstructor
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers")
@js.native
object instancehelpers extends js.Object {
  
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.unitsMod.AbstractUnit[IAbstractModel] | Null = js.native
  
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: js.UndefOr[scala.Nothing],
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    constructor: IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    constructor: IStructureConstructor[T],
    parentPropName: js.UndefOr[scala.Nothing],
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    constructor: IStructureConstructor[T],
    parentPropName: String
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
    owner: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  
  def createNewElementInstanceFromJSON(model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractElementJson): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
  
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  
  def createUnitFromJSON(model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
  def createUnitFromJSON(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    resolveByIdReferences: Boolean
  ): IAbstractUnit = js.native
  
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  
  def modelElementJsonToInstance(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
    container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    json: Null,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
    container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    json: IAbstractElementJson,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
  
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container> */ Boolean = js.native
}
