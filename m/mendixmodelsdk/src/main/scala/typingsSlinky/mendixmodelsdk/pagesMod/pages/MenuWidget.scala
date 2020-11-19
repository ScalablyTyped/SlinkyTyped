package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/menu-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuWidget")
@js.native
abstract class MenuWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def menuSource: MenuSource = js.native
  def menuSource_=(newValue: MenuSource): Unit = js.native
  
  @JSName("model")
  var model_FMenuWidget: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuWidget")
@js.native
object MenuWidget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
