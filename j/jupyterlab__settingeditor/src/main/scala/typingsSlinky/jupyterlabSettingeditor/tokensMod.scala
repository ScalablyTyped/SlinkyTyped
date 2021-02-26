package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabApputils.mod.MainAreaWidget
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/tokens", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typingsSlinky.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}
