package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.18.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow")
@js.native
class OnClickMicroflow protected () extends OnClickBehavior {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def microflowSettings: MicroflowSettings = js.native
  def microflowSettings_=(newValue: MicroflowSettings): Unit = js.native
}
object OnClickMicroflow {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow.create")
  @js.native
  def create(model: IModel): OnClickMicroflow = js.native
  
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * The new OnClickMicroflow will be automatically stored in the 'onClickBehavior' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow.createIn")
  @js.native
  def createIn(container: DynamicImageViewer): OnClickMicroflow = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
