package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/button-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Button")
@js.native
abstract class Button protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def buttonStyle: ButtonStyle = js.native
  def buttonStyle_=(newValue: ButtonStyle): Unit = js.native
  
  def caption: ClientTemplate = js.native
  def caption_=(newValue: ClientTemplate): Unit = js.native
  
  def icon: Icon | Null = js.native
  def icon_=(newValue: Icon | Null): Unit = js.native
  
  @JSName("model")
  var model_FButton: IModel = js.native
  
  def renderType: RenderType = js.native
  def renderType_=(newValue: RenderType): Unit = js.native
  
  def tooltip: Text = js.native
  def tooltip_=(newValue: Text): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Button")
@js.native
object Button extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
