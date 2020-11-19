package typingsSlinky.ink

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.ink.anon.readonlymarginnumberundef
import typingsSlinky.ink.domMod.DOMElement
import typingsSlinky.ink.measureElementMod.Output
import typingsSlinky.ink.newlineMod.Props
import typingsSlinky.ink.renderMod.RenderFunction
import typingsSlinky.ink.useFocusMod.Input
import typingsSlinky.ink.useInputMod.Handler
import typingsSlinky.ink.useInputMod.Options
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ink", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * `<Box>` is an essential Ink component to build your layout. It's like `<div style="display: flex">` in the browser.
    */
  val Box: ForwardRefExoticComponent[readonlymarginnumberundef] = js.native
  
  /**
    * Adds one or more newline (\n) characters. Must be used within <Text> components.
    */
  val Newline: ReactComponentClass[Props] = js.native
  
  /**
    * A flexible space that expands along the major axis of its containing layout.
    * It's useful as a shortcut for filling all the available spaces between elements.
    */
  val Spacer: ReactComponentClass[js.Object] = js.native
  
  /**
    * This component can display text, and change its style to make it colorful, bold, underline, italic or strikethrough.
    */
  val Text: ReactComponentClass[typingsSlinky.ink.textMod.Props] = js.native
  
  /**
    * Transform a string representation of React components before they are written to output.
    * For example, you might want to apply a gradient to text, add a clickable link or create some text effects.
    * These use cases can't accept React nodes as input, they are expecting a string.
    * That's what <Transform> component does, it gives you an output string of its child components and lets you transform it in any way.
    */
  val Transform: ReactComponentClass[typingsSlinky.ink.transformMod.Props] = js.native
  
  def measureElement(node: DOMElement): Output = js.native
  
  /**
    * Mount a component and render the output.
    */
  val render: RenderFunction = js.native
  
  def useApp(): typingsSlinky.ink.appContextMod.Props = js.native
  
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  def useFocus(): typingsSlinky.ink.useFocusMod.Output = js.native
  def useFocus(hasIsActiveAutoFocus: Input): typingsSlinky.ink.useFocusMod.Output = js.native
  
  /**
    * This hook exposes methods to enable or disable focus management for all
    * components or manually switch focus to next or previous components.
    */
  def useFocusManager(): typingsSlinky.ink.useFocusManagerMod.Output = js.native
  
  /**
    * This hook is used for handling user input.
    * It's a more convienient alternative to using `StdinContext` and listening to `data` events.
    * The callback you pass to `useInput` is called for each character when user enters any input.
    * However, if user pastes text and it's more than one character, the callback will be called only once and the whole string will be passed as `input`.
    *
    * ```
    * import {useInput} from 'ink';
    *
    * const UserInput = () => {
    *   useInput((input, key) => {
    *     if (input === 'q') {
    *       // Exit program
    *     }
    *
    *     if (key.leftArrow) {
    *       // Left arrow key pressed
    *     }
    *   });
    *
    *   return …
    * };
    * ```
    */
  def useInput(inputHandler: Handler): Unit = js.native
  def useInput(inputHandler: Handler, options: Options): Unit = js.native
  
  def useStderr(): typingsSlinky.ink.stderrContextMod.Props = js.native
  
  def useStdin(): typingsSlinky.ink.stdinContextMod.Props = js.native
  
  def useStdout(): typingsSlinky.ink.stdoutContextMod.Props = js.native
  
  /**
    * `<Static>` component permanently renders its output above everything else.
    * It's useful for displaying activity like completed tasks or logs - things that
    * are not changing after they're rendered (hence the name "Static").
    *
    * It's preferred to use `<Static>` for use cases like these, when you can't know
    * or control the amount of items that need to be rendered.
    *
    * For example, [Tap](https://github.com/tapjs/node-tap) uses `<Static>` to display
    * a list of completed tests. [Gatsby](https://github.com/gatsbyjs/gatsby) uses it
    * to display a list of generated pages, while still displaying a live progress bar.
    */
  @js.native
  object Static extends js.Object {
    
    def apply[T](props: typingsSlinky.ink.staticMod.Props[T]): ReactElement = js.native
    
    var displayName: String = js.native
  }
}
