package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/settingeditor", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typingsSlinky.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  
  @JSImport("@jupyterlab/settingeditor", "SettingEditor")
  @js.native
  class SettingEditor protected ()
    extends typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
}
