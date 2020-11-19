package typingsSlinky.codemirror.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(callback: js.Function1[/* host */ HTMLElement, Unit]): Editor = js.native
  def apply(callback: js.Function1[/* host */ HTMLElement, Unit], options: EditorConfiguration): Editor = js.native
  def apply(host: HTMLElement): Editor = js.native
  def apply(host: HTMLElement, options: EditorConfiguration): Editor = js.native
  
  var Doc: DocConstructor = js.native
  
  var Pos: PositionConstructor = js.native
  
  var StringStream: StringStreamConstructor = js.native
  
  /**
    * Commands are parameter-less actions that can be performed on an editor.
    * Their main use is for key bindings.
    * Commands are defined by adding properties to the CodeMirror.commands object.
    */
  var commands: CommandActions = js.native
  
  /** An object containing default values for all options.
    You can assign to its properties to modify defaults (though this won't affect editors that have already been created). */
  var defaults: js.Any = js.native
  
  /**
    * Maps MIME types to mode specs.
    */
  var mimeModes: MimeModeMap = js.native
  
  /**
    * Maps mode names to their constructors
    */
  var modes: ModeMap = js.native
  
  /** It contains a string that indicates the version of the library. This is a triple of integers "major.minor.patch",
    where patch is zero for releases, and something else (usually one) for dev snapshots. */
  var version: String = js.native
}
