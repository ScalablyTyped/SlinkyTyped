package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabApputils.mod.MainAreaWidget
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val ISettingEditorTracker: Token[typingsSlinky.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}

