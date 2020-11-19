package typingsSlinky.reactCodemirror.ReactCodeMirror

import typingsSlinky.codemirror.mod.Editor
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCodeMirror
  extends Component[ReactCodeMirrorProps, js.Object, js.Any] {
  
  /** Focuses the CodeMirror instance. */
  def focus(): Unit = js.native
  
  /** Returns the CodeMirror instance, if available. */
  def getCodeMirror(): Editor = js.native
}
