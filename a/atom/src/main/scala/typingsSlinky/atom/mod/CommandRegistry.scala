package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.Node
import typingsSlinky.atom.anon.DisplayName
import typingsSlinky.atom.anon.Target
import typingsSlinky.atom.atomStrings.`atom-text-editor`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandRegistry extends js.Object {
  
  /** Register a single command. */
  def add[T /* <: Node */](target: T, commandName: String, listener: CommandRegistryListener[T]): Disposable = js.native
  /** Register multiple commands. */
  def add[T /* <: Node */](target: T, commands: StringDictionary[CommandRegistryListener[T]]): CompositeDisposable = js.native
  /** Register a single command. */
  @JSName("add")
  def add_atomtexteditor(
    target: `atom-text-editor`,
    commandName: String,
    listener: CommandRegistryListener[TextEditorElement]
  ): Disposable = js.native
  /** Register multiple commands. */
  @JSName("add")
  def add_atomtexteditor(target: `atom-text-editor`, commands: StringDictionary[CommandRegistryListener[TextEditorElement]]): CompositeDisposable = js.native
  
  /**
    *  Simulate the dispatch of a command on a DOM node.
    *  @return Either a Promise that resolves after all handlers complete or null if
    *  no handlers were matched.
    */
  def dispatch(target: Node, commandName: String): js.Promise[Unit] | Null = js.native
  
  /** Find all registered commands matching a query. */
  def findCommands(params: Target): js.Array[DisplayName] = js.native
  
  /** Invoke the given callback after dispatching a command event. */
  def onDidDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
  
  /** Invoke the given callback before dispatching a command event. */
  def onWillDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
}
