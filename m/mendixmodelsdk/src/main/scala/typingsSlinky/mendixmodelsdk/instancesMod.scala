package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsSlinky.mendixmodelsdk.unitsMod.AbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.Version
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancesMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "AbstractEnum")
  @js.native
  abstract class AbstractEnum protected () extends StObject {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    
    def checkEnumVersion(metaModelVersion: Version, includeWarnings: Boolean): Unit = js.native
    
    def name: String = js.native
    
    def qualifiedTsLiteralName(): String = js.native
    
    var qualifiedTsTypeName: String = js.native
    
    var versionInfo: LifeCycle = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "createElementFromJSON")
  @js.native
  def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): Element[IAbstractModel] = js.native
  @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "createElementFromJSON")
  @js.native
  def createElementFromJSON(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[Structure[IAbstractModel, IContainer | Null]]
  ): Element[IAbstractModel] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "createModelUnitFromJSON")
  @js.native
  def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): ModelUnit[IAbstractModel] = js.native
  
  object instancehelpers {
    
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.abstractUnitJsonToInstance")
    @js.native
    def abstractUnitJsonToInstance(model: AbstractModel, json: IAbstractUnitJson, isPartial: Boolean): AbstractUnit[IAbstractModel] | Null = js.native
    
    /**
      * Creates a new element for a SDK user.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: js.UndefOr[scala.Nothing],
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](owner: AbstractElement[IAbstractModel, Container], constructor: IStructureConstructor[T]): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: js.UndefOr[scala.Nothing],
      parentPropIsList: Boolean
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String
    ): T = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createElement")
    @js.native
    def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createNewElementInstanceFromJSON")
    @js.native
    def createNewElementInstanceFromJSON(model: AbstractModel, json: IAbstractElementJson): Element[IAbstractModel] = js.native
    
    /**
      * Creates a new unit for a SDK user.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createUnit")
    @js.native
    def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createUnitFromJSON")
    @js.native
    def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.createUnitFromJSON")
    @js.native
    def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson, resolveByIdReferences: Boolean): IAbstractUnit = js.native
    
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.lookupClass")
    @js.native
    def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.modelElementJsonToInstance")
    @js.native
    def modelElementJsonToInstance(
      model: AbstractModel,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container],
      json: Null,
      isPartial: Boolean
    ): Element[IAbstractModel] | Null = js.native
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.modelElementJsonToInstance")
    @js.native
    def modelElementJsonToInstance(
      model: AbstractModel,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container],
      json: IAbstractElementJson,
      isPartial: Boolean
    ): Element[IAbstractModel] | Null = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.structureAffectsQualifiedNames")
    @js.native
    def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers.structureIsByNameReferrable")
    @js.native
    def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container> */ Boolean = js.native
  }
  
  @js.native
  trait IList[T] extends Array[T] {
    
    def clear(): js.Array[T] = js.native
    
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.UndefOr[scala.Nothing],
      fromIndex: Double
    ): js.UndefOr[T] = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any,
      fromIndex: Double
    ): js.UndefOr[T] = js.native
    
    def remove(value: T): Boolean = js.native
    
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mendixmodelsdk.elementsMod.IElementConstructor
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
  */
  trait InstanceConstructor extends StObject
}
