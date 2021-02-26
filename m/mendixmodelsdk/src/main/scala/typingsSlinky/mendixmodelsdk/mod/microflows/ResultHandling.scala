package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ResultHandling")
@js.native
class ResultHandling protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.ResultHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ResultHandling {
  
  @JSImport("mendixmodelsdk", "microflows.ResultHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.createInImportXmlActionUnderResultHandling")
  @js.native
  def createInImportXmlActionUnderResultHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ImportXmlAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.createInRestCallActionUnderResultHandling")
  @js.native
  def createInRestCallActionUnderResultHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.createInWebServiceCallActionUnderResultHandling")
  @js.native
  def createInWebServiceCallActionUnderResultHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
