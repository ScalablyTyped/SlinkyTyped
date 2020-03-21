package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SettingEditor protected ()
    extends typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
  
  val ISettingEditorTracker: Token[typingsSlinky.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
}

