package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.PageForSpecialization")
@js.native
class PageForSpecialization protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.PageForSpecialization {
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
@JSImport("mendixmodelsdk", "pages.PageForSpecialization")
@js.native
object PageForSpecialization extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageForSpecialization = js.native
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPagesForSpecializations(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridEditButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageForSpecialization = js.native
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent PageClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPageClientActionUnderPagesForSpecializations(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.PageClientAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageForSpecialization = js.native
}

