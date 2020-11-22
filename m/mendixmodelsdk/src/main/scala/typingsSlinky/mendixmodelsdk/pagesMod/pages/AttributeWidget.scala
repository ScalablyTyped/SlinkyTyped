package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
abstract class AttributeWidget protected () extends MemberWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction: ClientAction = js.native
  def onChangeAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings: MicroflowSettings = js.native
  def onChangeMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def onEnterAction: ClientAction = js.native
  def onEnterAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onEnterMicroflowSettings: MicroflowSettings = js.native
  def onEnterMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def onLeaveAction: ClientAction = js.native
  def onLeaveAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onLeaveMicroflowSettings: MicroflowSettings = js.native
  def onLeaveMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def required: Boolean = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def requiredMessage: Text = js.native
  def requiredMessage_=(newValue: Text): Unit = js.native
  
  def required_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def sourceVariable: PageVariable | Null = js.native
  def sourceVariable_=(newValue: PageVariable | Null): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def validation: WidgetValidation = js.native
  def validation_=(newValue: WidgetValidation): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
object AttributeWidget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
