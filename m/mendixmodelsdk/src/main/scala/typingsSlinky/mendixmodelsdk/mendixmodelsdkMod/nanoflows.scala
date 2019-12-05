package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaActionParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaScriptActionParameterMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "nanoflows")
@js.native
object nanoflows extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
    */
  /**
    * In version 8.4.0: introduced
    */
  @js.native
  class NanoflowParameterValue protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.nanoflows.NanoflowParameterValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object NanoflowParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenNanoflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): typingsSlinky.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): typingsSlinky.mendixmodelsdk.distGenNanoflowsMod.nanoflows.NanoflowParameterValue = js.native
  }
  
}

