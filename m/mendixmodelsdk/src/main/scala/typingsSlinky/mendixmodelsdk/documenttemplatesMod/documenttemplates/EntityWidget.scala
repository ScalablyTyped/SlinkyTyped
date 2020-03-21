package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.EntityWidget")
@js.native
abstract class EntityWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityWidget: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  def entityRef(): js.Any = js.native
  def entityRef(newValue: EntityRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("entityRef")
  def entityRef_Union(): EntityRef | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.EntityWidget")
@js.native
object EntityWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

