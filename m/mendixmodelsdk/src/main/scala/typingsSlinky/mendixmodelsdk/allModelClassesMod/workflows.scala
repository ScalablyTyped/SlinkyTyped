package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflows {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome")
  @js.native
  class BooleanSplitOutcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BooleanSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = js.native
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * The new BooleanSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask")
  @js.native
  class CallMicroflowTask protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallMicroflowTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = js.native
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * The new CallMicroflowTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity")
  @js.native
  class CallWorkflowActivity protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallWorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = js.native
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * The new CallWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity")
  @js.native
  class EndWorkflowActivity protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EndWorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * The new EndWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome")
  @js.native
  class EnumerationValueSplitOutcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationValueSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = js.native
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * The new EnumerationValueSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity")
  @js.native
  class ExclusiveSplitActivity protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = js.native
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * The new ExclusiveSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome")
  @js.native
  abstract class ExclusiveSplitOutcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow")
  @js.native
  class Flow protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Flow {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Outcome element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.createInOutcomeUnderFlow")
    @js.native
    def createInOutcomeUnderFlow(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Outcome): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.createInWorkflowUnderFlow")
    @js.native
    def createInWorkflowUnderFlow(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome")
  @js.native
  abstract class Outcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Outcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Outcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.0.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
  @js.native
  class ParallelSplitActivity protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * The new ParallelSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.0.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome")
  @js.native
  class ParallelSplitOutcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = js.native
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ParallelSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource")
  @js.native
  abstract class UserSource protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask")
  @js.native
  class UserTask protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * The new UserTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow")
  @js.native
  class Workflow protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Workflow {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Workflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity")
  @js.native
  abstract class WorkflowActivity protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask")
  @js.native
  abstract class WorkflowTask protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
  @js.native
  class WorkflowTaskOutcome protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTaskOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * The new WorkflowTaskOutcome will be automatically stored in the 'outcomes' property
      * of the parent WorkflowTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTask): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource")
  @js.native
  class XPathBasedUserSource protected ()
    extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XPathBasedUserSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * The new XPathBasedUserSource will be automatically stored in the 'userSource' property
      * of the parent UserTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
