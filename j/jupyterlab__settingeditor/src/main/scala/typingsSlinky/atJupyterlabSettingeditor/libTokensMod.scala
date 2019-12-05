package typingsSlinky.atJupyterlabSettingeditor

import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val ISettingEditorTracker: Token[typingsSlinky.atJupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}

