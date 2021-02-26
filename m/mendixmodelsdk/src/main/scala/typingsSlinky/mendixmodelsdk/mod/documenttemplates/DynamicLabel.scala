package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/dynamic-label-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel")
@js.native
class DynamicLabel protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.DynamicLabel {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DynamicLabel {
  
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel = js.native
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.createInDocumentTemplateUnderToplevels")
  @js.native
  def createInDocumentTemplateUnderToplevels(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel = js.native
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.createInDropZoneUnderWidget")
  @js.native
  def createInDropZoneUnderWidget(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DropZone): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
