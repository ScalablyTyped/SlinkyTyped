package typingsSlinky.reactTransitionGroup

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactTransitionGroup.anon.Dictprop
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.div
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionGroupMod {
  
  /**
    * The `<TransitionGroup>` component manages a set of `<Transition>` components
    * in a list. Like with the `<Transition>` component, `<TransitionGroup>`, is a
    * state machine for managing the mounting and unmounting of components over
    * time.
    *
    * Consider the example below using the `Fade` CSS transition from before.
    * As items are removed or added to the TodoList the `in` prop is toggled
    * automatically by the `<TransitionGroup>`. You can use _any_ `<Transition>`
    * component in a `<TransitionGroup>`, not just css.
    *
    * ```jsx
    * import TransitionGroup from 'react-transition-group/TransitionGroup';
    *
    * class TodoList extends React.Component {
    *   constructor(props) {
    *     super(props)
    *     this.state = {items: ['hello', 'world', 'click', 'me']}
    *   }
    *   handleAdd() {
    *     const newItems = this.state.items.concat([
    *       prompt('Enter some text')
    *     ]);
    *     this.setState({ items: newItems });
    *   }
    *   handleRemove(i) {
    *     let newItems = this.state.items.slice();
    *     newItems.splice(i, 1);
    *     this.setState({items: newItems});
    *   }
    *   render() {
    *     return (
    *       <div>
    *         <button onClick={() => this.handleAdd()}>Add Item</button>
    *         <TransitionGroup>
    *           {this.state.items.map((item, i) => (
    *             <FadeTransition key={item}>
    *               <div>
    *                 {item}{' '}
    *                 <button onClick={() => this.handleRemove(i)}>
    *                   remove
    *                 </button>
    *               </div>
    *             </FadeTransition>
    *           ))}
    *         </TransitionGroup>
    *       </div>
    *     );
    *   }
    * }
    * ```
    *
    * Note that `<TransitionGroup>`  does not define any animation behavior!
    * Exactly _how_ a list item animates is up to the individual `<Transition>`
    * components. This means you can mix and match animations across different
    * list items.
    */
  @JSImport("react-transition-group/TransitionGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[TransitionGroupProps[div, js.Any], js.Object, js.Any]
  
  @js.native
  trait ComponentTransitionGroupProps[T /* <: ReactType[_] */] extends TransitionActions {
    
    var component: T = js.native
  }
  object ComponentTransitionGroupProps {
    
    @scala.inline
    def apply[T /* <: ReactType[_] */](component: T): ComponentTransitionGroupProps[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
    }
    
    @scala.inline
    implicit class ComponentTransitionGroupPropsMutableBuilder[Self <: ComponentTransitionGroupProps[_], T /* <: ReactType[_] */] (val x: Self with ComponentTransitionGroupProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntrinsicTransitionGroupProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends TransitionActions {
    
    var component: js.UndefOr[T | Null] = js.native
  }
  object IntrinsicTransitionGroupProps {
    
    @scala.inline
    def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): IntrinsicTransitionGroupProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntrinsicTransitionGroupProps[T]]
    }
    
    @scala.inline
    implicit class IntrinsicTransitionGroupPropsMutableBuilder[Self <: IntrinsicTransitionGroupProps[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self with IntrinsicTransitionGroupProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNull: Self = StObject.set(x, "component", null)
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  /**
    * The `<TransitionGroup>` component manages a set of `<Transition>` components
    * in a list. Like with the `<Transition>` component, `<TransitionGroup>`, is a
    * state machine for managing the mounting and unmounting of components over
    * time.
    *
    * Consider the example below using the `Fade` CSS transition from before.
    * As items are removed or added to the TodoList the `in` prop is toggled
    * automatically by the `<TransitionGroup>`. You can use _any_ `<Transition>`
    * component in a `<TransitionGroup>`, not just css.
    *
    * ```jsx
    * import TransitionGroup from 'react-transition-group/TransitionGroup';
    *
    * class TodoList extends React.Component {
    *   constructor(props) {
    *     super(props)
    *     this.state = {items: ['hello', 'world', 'click', 'me']}
    *   }
    *   handleAdd() {
    *     const newItems = this.state.items.concat([
    *       prompt('Enter some text')
    *     ]);
    *     this.setState({ items: newItems });
    *   }
    *   handleRemove(i) {
    *     let newItems = this.state.items.slice();
    *     newItems.splice(i, 1);
    *     this.setState({items: newItems});
    *   }
    *   render() {
    *     return (
    *       <div>
    *         <button onClick={() => this.handleAdd()}>Add Item</button>
    *         <TransitionGroup>
    *           {this.state.items.map((item, i) => (
    *             <FadeTransition key={item}>
    *               <div>
    *                 {item}{' '}
    *                 <button onClick={() => this.handleRemove(i)}>
    *                   remove
    *                 </button>
    *               </div>
    *             </FadeTransition>
    *           ))}
    *         </TransitionGroup>
    *       </div>
    *     );
    *   }
    * }
    * ```
    *
    * Note that `<TransitionGroup>`  does not define any animation behavior!
    * Exactly _how_ a list item animates is up to the individual `<Transition>`
    * components. This means you can mix and match animations across different
    * list items.
    */
  type TransitionGroup = ReactComponentClass[TransitionGroupProps[div, js.Any]]
  
  type TransitionGroupProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, V /* <: ReactType[_] */] = (IntrinsicTransitionGroupProps[T] with (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)) | (ComponentTransitionGroupProps[V] with Dictprop)
}
