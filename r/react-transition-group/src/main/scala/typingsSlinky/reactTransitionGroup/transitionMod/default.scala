package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Transition component lets you describe a transition from one component
  * state to another _over time_ with a simple declarative API. Most commonly
  * It's used to animate the mounting and unmounting of Component, but can also
  * be used to describe in-place transition states as well.
  *
  * By default the `Transition` component does not alter the behavior of the
  * component it renders, it only tracks "enter" and "exit" states for the components.
  * It's up to you to give meaning and effect to those states. For example we can
  * add styles to a component when it enters or exits:
  *
  * ```jsx
  * import Transition from 'react-transition-group/Transition';
  *
  * const duration = 300;
  *
  * const defaultStyle = {
  *   transition: `opacity ${duration}ms ease-in-out`,
  *   opacity: 0,
  * }
  *
  * const transitionStyles = {
  *   entering: { opacity: 1 },
  *   entered:  { opacity: 1 },
  * };
  *
  * const Fade = ({ in: inProp }) => (
  *   <Transition in={inProp} timeout={duration}>
  *     {(state) => (
  *       <div style={{
  *         ...defaultStyle,
  *         ...transitionStyles[state]
  *       }}>
  *         I'm A fade Transition!
  *       </div>
  *     )}
  *   </Transition>
  * );
  * ```
  *
  */
@JSImport("react-transition-group/Transition", JSImport.Default)
@js.native
class default[RefElement /* <: js.UndefOr[HTMLElement] */] ()
  extends Component[TransitionProps[RefElement], js.Object, js.Any]
