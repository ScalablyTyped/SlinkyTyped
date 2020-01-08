package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/starting-microflows relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.MicroflowSettings")
@js.native
class MicroflowSettings protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.MicroflowSettings {
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
@JSImport("mendixmodelsdk", "pages.MicroflowSettings")
@js.native
object MicroflowSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  def createInMicroflowClientActionUnderMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  def createInMicroflowSourceUnderMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSource): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  def createInOnClickMicroflowUnderMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.OnClickMicroflow): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SelectorMicroflowSource): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings = js.native
}

