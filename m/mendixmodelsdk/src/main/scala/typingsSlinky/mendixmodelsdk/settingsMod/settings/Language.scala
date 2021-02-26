package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
class Language protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
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
}
object Language {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language.create")
  @js.native
  def create(model: IModel): Language = js.native
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language.createIn")
  @js.native
  def createIn(container: LanguageSettings): Language = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
