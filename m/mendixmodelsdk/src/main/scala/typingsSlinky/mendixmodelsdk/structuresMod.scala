package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.propertiesMod.PartListProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.PartProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildProperty
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuresMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/structures", "Structure")
  @js.native
  abstract class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected () extends IStructure {
    def this(_model: AbstractModel, structureTypeName: String, id: String) = this()
    def this(_model: AbstractModel, structureTypeName: String, id: String, _isPartial: Boolean) = this()
    def this(
      _model: AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: js.UndefOr[scala.Nothing],
      container: IContainer
    ) = this()
    def this(
      _model: AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean,
      container: IContainer
    ) = this()
    
    @JSName("container")
    def container_MStructure: TContainer = js.native
    
    /**
      * Deletes a model from the model.
      * This will automatically remove the item from its model parent,
      * and update incoming references and send server changes.
      */
    def delete(): Unit = js.native
    
    /* protected */ def getContainerAs[T /* <: IContainer */](containerType: js.Any): T = js.native
    
    @JSName("isLoaded")
    def isLoaded_MStructure: Boolean = js.native
    
    @JSName("model")
    def model_MStructure: TModel = js.native
    
    @JSName("unit")
    def unit_MStructure: IAbstractUnit = js.native
  }
  
  type AbstractStructureProperty = PartProperty[js.Any] | PartListProperty[js.Any] | StructuralChildProperty[js.Any] | StructuralChildListProperty[js.Any]
  
  @js.native
  trait IChildHandle extends StObject {
    
    var containingProperty: AbstractStructureProperty = js.native
    
    def delete(): Unit = js.native
    
    def detach(): Unit = js.native
  }
  object IChildHandle {
    
    @scala.inline
    def apply(containingProperty: AbstractStructureProperty, delete: () => Unit, detach: () => Unit): IChildHandle = {
      val __obj = js.Dynamic.literal(containingProperty = containingProperty.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), detach = js.Any.fromFunction0(detach))
      __obj.asInstanceOf[IChildHandle]
    }
    
    @scala.inline
    implicit class IChildHandleMutableBuilder[Self <: IChildHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainingProperty(value: AbstractStructureProperty): Self = StObject.set(x, "containingProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IStructure extends StObject {
    
    def allProperties(): js.Array[AbstractProperty[_, _]] = js.native
    
    val container: IContainer | Null = js.native
    
    var id: String = js.native
    
    var isLoaded: Boolean = js.native
    
    /**
      * Returns all properties when this structure is loaded, otherwise just the public properties.
      */
    def loadedProperties(): js.Array[AbstractProperty[_, _]] = js.native
    
    var model: IAbstractModel = js.native
    
    def publicProperties(): js.Array[AbstractProperty[_, _]] = js.native
    
    var structureTypeName: String = js.native
    
    /**
      * Renders the structure as plain JSON (without observables magic).
      * This is intended for debugging and development convenience.
      * Note that the resulting object is not of the interface type corresponding to this structure.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * Traverses this structure by calling the provided visitor function
      * on itself and all the structures contained (as part) by it,
      * in depth-first order, and it returns synchronously after that.
      */
    def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
    
    /**
      * Traverses this structure, returning immediately when `visit` returns something other than `null`.
      */
    def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null = js.native
    
    /**
      * Traverses this structure, only visiting children contained in public properties.
      */
    def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
    
    /**
      * Unit that owns/contains this thing.
      */
    var unit: IAbstractUnit = js.native
  }
  object IStructure {
    
    @scala.inline
    def apply(
      allProperties: () => js.Array[AbstractProperty[_, _]],
      id: String,
      isLoaded: Boolean,
      loadedProperties: () => js.Array[AbstractProperty[_, _]],
      model: IAbstractModel,
      publicProperties: () => js.Array[AbstractProperty[_, _]],
      structureTypeName: String,
      toJSON: () => js.Object,
      traverse: js.Function1[IStructure, Unit] => Unit,
      traverseFind: js.Function1[IStructure, js.Any] => js.Any | Null,
      traversePublicParts: js.Function1[IStructure, Unit] => Unit,
      unit: IAbstractUnit
    ): IStructure = {
      val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructure]
    }
    
    @scala.inline
    implicit class IStructureMutableBuilder[Self <: IStructure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = StObject.set(x, "allProperties", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainer(value: IContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = StObject.set(x, "loadedProperties", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModel(value: IAbstractModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = StObject.set(x, "publicProperties", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStructureTypeName(value: String): Self = StObject.set(x, "structureTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTraverse(value: js.Function1[IStructure, Unit] => Unit): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraverseFind(value: js.Function1[IStructure, js.Any] => js.Any | Null): Self = StObject.set(x, "traverseFind", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraversePublicParts(value: js.Function1[IStructure, Unit] => Unit): Self = StObject.set(x, "traversePublicParts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnit(value: IAbstractUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStructureClass extends StObject {
    
    var versionInfo: StructureVersionInfo = js.native
  }
  object IStructureClass {
    
    @scala.inline
    def apply(versionInfo: StructureVersionInfo): IStructureClass = {
      val __obj = js.Dynamic.literal(versionInfo = versionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructureClass]
    }
    
    @scala.inline
    implicit class IStructureClassMutableBuilder[Self <: IStructureClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersionInfo(value: StructureVersionInfo): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStructureConstructor[T /* <: IStructure */]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.`new`
    - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.attached
    - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.detached
    - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deleted
  */
  trait StructureState extends StObject
  object StructureState {
    
    @scala.inline
    def attached: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.attached = "attached".asInstanceOf[typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.attached]
    
    @scala.inline
    def deleted: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deleted = "deleted".asInstanceOf[typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deleted]
    
    @scala.inline
    def detached: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.detached = "detached".asInstanceOf[typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.detached]
    
    @scala.inline
    def `new`: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.`new` = "new".asInstanceOf[typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.`new`]
  }
  
  object aliases {
    
    type Container = StructuralUnit[IAbstractModel] | (AbstractElement[
        IAbstractModel, 
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container */ js.Object
      ])
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
      - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
    */
    trait IContainer extends StObject
  }
}
