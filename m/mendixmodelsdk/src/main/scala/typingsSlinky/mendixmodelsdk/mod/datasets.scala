package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
  @JSImport("mendixmodelsdk", "datasets.DataSet")
  @js.native
  class DataSet protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSet {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object DataSet {
    
    @JSImport("mendixmodelsdk", "datasets.DataSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSet.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSet.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSet.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetAccess")
  @js.native
  class DataSetAccess protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetAccess {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetColumn")
  @js.native
  class DataSetColumn protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetColumn {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetColumn {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess")
  @js.native
  class DataSetConstraintAccess protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetConstraintAccess {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetConstraintAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
  @js.native
  class DataSetDateTimeConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetDateTimeConstraint {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetDateTimeConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess")
  @js.native
  class DataSetModuleRoleAccess protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetModuleRoleAccess {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetModuleRoleAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint")
  @js.native
  class DataSetNumericConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetNumericConstraint {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetNumericConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
  @js.native
  class DataSetObjectConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetObjectConstraint {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetObjectConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameter")
  @js.native
  class DataSetParameter protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameter {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameter {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
  @js.native
  class DataSetParameterAccess protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameterAccess {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
  @js.native
  abstract class DataSetParameterConstraint protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameterConstraint {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetSource")
  @js.native
  abstract class DataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetSource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength")
  @js.native
  class DateTimeIntervalLength protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DateTimeIntervalLength {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalLength {
    
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Day")
    @js.native
    def Day: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Day_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Month")
    @js.native
    def Month: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Month_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Period")
    @js.native
    def Period: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Period_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Quarter")
    @js.native
    def Quarter: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Quarter_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Week")
    @js.native
    def Week: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Week_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Year")
    @js.native
    def Year: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Year_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier")
  @js.native
  class DateTimeIntervalModifier protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DateTimeIntervalModifier {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalModifier {
    
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Always")
    @js.native
    def Always: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Always_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Future")
    @js.native
    def Future: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Future_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Future")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Last")
    @js.native
    def Last: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Last_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Next")
    @js.native
    def Next: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Next_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Past")
    @js.native
    def Past: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Past_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Past")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.This")
    @js.native
    def This: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def This_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("This")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource")
  @js.native
  class JavaDataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.JavaDataSetSource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaDataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
  @js.native
  class OqlDataSetSource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.OqlDataSetSource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OqlDataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
