package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasets {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
  @js.native
  class DataSet protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object DataSet {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess")
  @js.native
  class DataSetAccess protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetAccess {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn")
  @js.native
  class DataSetColumn protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetColumn {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetColumn.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
  @js.native
  class DataSetConstraintAccess protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetConstraintAccess {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint")
  @js.native
  class DataSetDateTimeConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetDateTimeConstraint {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
  @js.native
  class DataSetModuleRoleAccess protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetModuleRoleAccess {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint")
  @js.native
  class DataSetNumericConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetNumericConstraint {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint")
  @js.native
  class DataSetObjectConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetObjectConstraint {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter")
  @js.native
  class DataSetParameter protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameter {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameter.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess")
  @js.native
  class DataSetParameterAccess protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterAccess {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterConstraint")
  @js.native
  abstract class DataSetParameterConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterConstraint {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetParameterConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetSource")
  @js.native
  abstract class DataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength")
  @js.native
  class DateTimeIntervalLength protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalLength {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Day")
    @js.native
    def Day: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Day_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Month")
    @js.native
    def Month: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Month_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Period")
    @js.native
    def Period: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Period_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Quarter")
    @js.native
    def Quarter: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Quarter_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Week")
    @js.native
    def Week: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Week_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalLength.Year")
    @js.native
    def Year: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Year_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier")
  @js.native
  class DateTimeIntervalModifier protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalModifier {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Always")
    @js.native
    def Always: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Always_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Future")
    @js.native
    def Future: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Future_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Future")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Last")
    @js.native
    def Last: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Last_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Next")
    @js.native
    def Next: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Next_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Past")
    @js.native
    def Past: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Past_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Past")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DateTimeIntervalModifier.This")
    @js.native
    def This: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def This_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("This")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource")
  @js.native
  class JavaDataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaDataSetSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource")
  @js.native
  class OqlDataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OqlDataSetSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
