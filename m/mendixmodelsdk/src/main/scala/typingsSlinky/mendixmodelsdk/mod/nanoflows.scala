package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nanoflows {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Nanoflows`.
    */
  /**
    * In version 8.4.0: introduced
    */
  @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue")
  @js.native
  class NanoflowParameterValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nanoflows.NanoflowParameterValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NanoflowParameterValue {
    
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.createInJavaActionParameterMappingUnderParameterValue")
    @js.native
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): typingsSlinky.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    
    /**
      * Creates and returns a new NanoflowParameterValue instance in the SDK and on the server.
      * The new NanoflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent microflows.JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.4.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
    @js.native
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): typingsSlinky.mendixmodelsdk.nanoflowsMod.nanoflows.NanoflowParameterValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nanoflows.NanoflowParameterValue.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nanoflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nanoflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
