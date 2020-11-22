package typingsSlinky.jupyterlabApputils.commandlinkerMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.commandlinkerMod.CommandLinker.IOptions
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoVirtualdom.mod.ElementDataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/commandlinker", "CommandLinker")
@js.native
class CommandLinker_ protected () extends IDisposable {
  /**
    * Instantiate a new command linker.
    */
  def this(options: IOptions) = this()
  
  var _commands: js.Any = js.native
  
  /**
    * The global click handler that deploys commands/argument pairs that are
    * attached to the node being clicked.
    */
  var _evtClick: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Connect a command/argument pair to a given node so that when it is clicked,
    * the command will execute.
    *
    * @param node - The node being connected.
    *
    * @param command - The command ID to execute upon click.
    *
    * @param args - The arguments with which to invoke the command.
    *
    * @returns The same node that was passed in, after it has been connected.
    *
    * #### Notes
    * Only `click` events will execute the command on a connected node. So, there
    * are two considerations that are relevant:
    * 1. If a node is connected, the default click action will be prevented.
    * 2. The `HTMLElement` passed in should be clickable.
    */
  def connectNode(node: HTMLElement, command: String): HTMLElement = js.native
  def connectNode(node: HTMLElement, command: String, args: ReadonlyPartialJSONObject): HTMLElement = js.native
  
  /**
    * Disconnect a node that has been connected to execute a command on click.
    *
    * @param node - The node being disconnected.
    *
    * @returns The same node that was passed in, after it has been disconnected.
    *
    * #### Notes
    * This method is safe to call multiple times and is safe to call on nodes
    * that were never connected.
    *
    * This method can be called on rendered virtual DOM nodes that were populated
    * using the `populateVNodeDataset` method in order to disconnect them from
    * executing their command/argument pair.
    */
  def disconnectNode(node: HTMLElement): HTMLElement = js.native
  
  /**
    * Handle the DOM events for the command linker helper class.
    *
    * @param event - The DOM event sent to the class.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * Test whether the linker is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MCommandLinker_ : Boolean = js.native
  
  /**
    * Populate the `dataset` attribute within the collection of attributes used
    * to instantiate a virtual DOM node with the values necessary for its
    * rendered DOM node to respond to clicks by executing a command/argument
    * pair.
    *
    * @param command - The command ID to execute upon click.
    *
    * @param args - The arguments with which to invoke the command.
    *
    * @returns A `dataset` collection for use within virtual node attributes.
    *
    * #### Notes
    * The return value can be used on its own as the value for the `dataset`
    * attribute of a virtual element, or it can be added to an existing `dataset`
    * as in the example below.
    *
    * #### Example
    * ```typescript
    * let command = 'some:command-id';
    * let args = { alpha: 'beta' };
    * let anchor = h.a({
    *   className: 'some-class',
    *   dataset: {
    *     foo: '1',
    *     bar: '2',
    *     ../...linker.populateVNodeDataset(command, args)
    *   }
    * }, 'some text');
    * ```
    */
  def populateVNodeDataset(command: String): ElementDataset = js.native
  def populateVNodeDataset(command: String, args: ReadonlyPartialJSONObject): ElementDataset = js.native
}
