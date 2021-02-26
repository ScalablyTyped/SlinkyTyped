package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CodeActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nanoflowsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/nanoflows", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object nanoflows {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
      */
    /**
      * In version 8.4.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue")
    @js.native
    class NanoflowParameterValue protected () extends CodeActionParameterValue {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def nanoflow: INanoflow | Null = js.native
      
      def nanoflowQualifiedName: String | Null = js.native
      
      def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
    }
    object NanoflowParameterValue {
      
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue.create")
      @js.native
      def create(model: IModel): NanoflowParameterValue = js.native
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue.createInJavaActionParameterMappingUnderParameterValue")
      @js.native
      def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): NanoflowParameterValue = js.native
      
      /**
        * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
        * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
        * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.4.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
      @js.native
      def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): NanoflowParameterValue = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nanoflows", "nanoflows.NanoflowParameterValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
  }
}
