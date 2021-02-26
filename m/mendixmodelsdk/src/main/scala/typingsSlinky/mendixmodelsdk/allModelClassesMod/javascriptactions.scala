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

object javascriptactions {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptAction")
  @js.native
  class JavaScriptAction protected ()
    extends typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object JavaScriptAction {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new JavaScriptAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptAction.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptAction = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptAction.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptActionParameter")
  @js.native
  class JavaScriptActionParameter protected ()
    extends typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaScriptActionParameter {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptActionParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptActionParameter.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptActionParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.JavaScriptActionParameter.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.4.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.NanoflowJavaScriptActionParameterType")
  @js.native
  class NanoflowJavaScriptActionParameterType protected ()
    extends typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NanoflowJavaScriptActionParameterType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.NanoflowJavaScriptActionParameterType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NanoflowJavaScriptActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.NanoflowJavaScriptActionParameterType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.NanoflowJavaScriptActionParameterType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions.NanoflowJavaScriptActionParameterType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
