package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.restMod.rest.ConsumedODataService
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration")
@js.native
class HttpConfiguration protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object HttpConfiguration {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.createInConsumedODataServiceUnderHttpConfiguration")
  @js.native
  def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.createInRestCallActionUnderHttpConfiguration")
  @js.native
  def createInRestCallActionUnderHttpConfiguration(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.createInWebServiceCallActionUnderHttpConfiguration")
  @js.native
  def createInWebServiceCallActionUnderHttpConfiguration(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
