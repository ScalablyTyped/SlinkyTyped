package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
class Language protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def checkCompleteness: Boolean = js.native
  def checkCompleteness_=(newValue: Boolean): Unit = js.native
  
  def code: String = js.native
  def code_=(newValue: String): Unit = js.native
  
  def containerAsLanguageSettings: LanguageSettings = js.native
  
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def customDateTimeFormat: String = js.native
  def customDateTimeFormat_=(newValue: String): Unit = js.native
  
  def customTimeFormat: String = js.native
  def customTimeFormat_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FLanguage: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
object Language extends js.Object {
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Language = js.native
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  def createIn(container: LanguageSettings): Language = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
