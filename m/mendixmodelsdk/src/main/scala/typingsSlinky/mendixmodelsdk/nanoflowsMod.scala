package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CodeActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/nanoflows", JSImport.Namespace)
@js.native
object nanoflowsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object nanoflows extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
      */
    /**
      * In version 8.4.0: introduced
      */
    @js.native
    class NanoflowParameterValue protected () extends CodeActionParameterValue {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FNanoflowParameterValue: IModel = js.native
      def nanoflow(): js.Any = js.native
      def nanoflow(newValue: INanoflow): js.Any = js.native
      def nanoflowQualifiedName(): String | Null = js.native
      @JSName("nanoflow")
      def nanoflow_Union(): INanoflow | Null = js.native
    }
    
    /* static members */
    @js.native
    object NanoflowParameterValue extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NanoflowParameterValue = js.native
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): NanoflowParameterValue = js.native
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): NanoflowParameterValue = js.native
    }
    
  }
  
}

