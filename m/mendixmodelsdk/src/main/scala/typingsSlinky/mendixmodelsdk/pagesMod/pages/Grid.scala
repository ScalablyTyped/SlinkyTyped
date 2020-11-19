package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
@js.native
abstract class Grid protected () extends ListenTargetWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def controlBar: GridControlBar = js.native
  def controlBar_=(newValue: GridControlBar): Unit = js.native
  
  def defaultButtonTrigger: ClickTypeType = js.native
  def defaultButtonTrigger_=(newValue: ClickTypeType): Unit = js.native
  
  def isControlBarVisible: Boolean = js.native
  def isControlBarVisible_=(newValue: Boolean): Unit = js.native
  
  def isPagingEnabled: Boolean = js.native
  def isPagingEnabled_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FGrid: IModel = js.native
  
  def refreshTime: Double = js.native
  def refreshTime_=(newValue: Double): Unit = js.native
  
  def selectFirst: Boolean = js.native
  def selectFirst_=(newValue: Boolean): Unit = js.native
  
  def selectionMode: GridSelectionMode = js.native
  def selectionMode_=(newValue: GridSelectionMode): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
@js.native
object Grid extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
