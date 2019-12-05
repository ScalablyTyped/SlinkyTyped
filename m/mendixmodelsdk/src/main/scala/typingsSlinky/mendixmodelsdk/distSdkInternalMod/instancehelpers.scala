package typingsSlinky.mendixmodelsdk.distSdkInternalMod

import typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.InstanceConstructor
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructureConstructor
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractUnitJson
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnitConstructor
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String
  ): T = js.native
  def createElement[T /* <: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    json: IAbstractElementJson
  ): typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    json: Null,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

