package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
class TemplateGridContents protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.TemplateGridContents {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
object TemplateGridContents extends js.Object {
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderEvenRowsContents(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderOddRowsContents(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
