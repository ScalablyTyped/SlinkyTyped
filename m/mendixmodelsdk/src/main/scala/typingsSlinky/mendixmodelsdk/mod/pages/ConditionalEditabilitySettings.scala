package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
@js.native
class ConditionalEditabilitySettings protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.ConditionalEditabilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConditionalEditabilitySettings {
  
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.0.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.createInConditionallyEditableWidgetUnderConditionalEditabilitySettings")
  @js.native
  def createInConditionallyEditableWidgetUnderConditionalEditabilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.createInCustomWidgetUnderConditionalEditabilitySettings")
  @js.native
  def createInCustomWidgetUnderConditionalEditabilitySettings(container: CustomWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
