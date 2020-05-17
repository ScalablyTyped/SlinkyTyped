package typingsSlinky.mendixmodelsdk.instancesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsSlinky.mendixmodelsdk.unitsMod.AbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers")
@js.native
object instancehelpers extends js.Object {
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(model: AbstractModel, json: IAbstractUnitJson, isPartial: Boolean): AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: Element */](
    owner: AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(model: AbstractModel, json: IAbstractElementJson): Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
  def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson, resolveByIdReferences: Boolean): IAbstractUnit = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(model: AbstractModel, unit: ModelUnit, container: AbstractElement, json: Null, isPartial: Boolean): Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: AbstractModel,
    unit: ModelUnit,
    container: AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

