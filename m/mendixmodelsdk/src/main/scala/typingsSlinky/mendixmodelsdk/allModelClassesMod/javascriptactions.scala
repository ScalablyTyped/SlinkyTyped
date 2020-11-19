package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions")
@js.native
object javascriptactions extends js.Object {
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
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
  /* static members */
  @js.native
  object JavaScriptAction extends js.Object {
    
    /**
      * Creates a new JavaScriptAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptAction = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionParameter protected ()
    extends typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object JavaScriptActionParameter extends js.Object {
    
    /**
      * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 8.4.0: introduced
    */
  @js.native
  class NanoflowJavaScriptActionParameterType protected ()
    extends typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object NanoflowJavaScriptActionParameterType extends js.Object {
    
    /**
      * Creates and returns a new NanoflowJavaScriptActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
  }
}
