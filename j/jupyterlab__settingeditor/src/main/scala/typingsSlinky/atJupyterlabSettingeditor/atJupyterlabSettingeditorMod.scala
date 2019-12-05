package typingsSlinky.atJupyterlabSettingeditor

import typingsSlinky.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor", JSImport.Namespace)
@js.native
object atJupyterlabSettingeditorMod extends js.Object {
  @js.native
  class SettingEditor protected ()
    extends typingsSlinky.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
  
  val ISettingEditorTracker: Token[typingsSlinky.atJupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
}

