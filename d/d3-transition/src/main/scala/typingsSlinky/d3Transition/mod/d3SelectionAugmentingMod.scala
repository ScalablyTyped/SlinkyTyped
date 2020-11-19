package typingsSlinky.d3Transition.mod

import typingsSlinky.d3Selection.mod.BaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("d3-selection", JSImport.Namespace)
@js.native
object d3SelectionAugmentingMod extends js.Object {
  
  /**
    * A D3 Selection of elements.
    *
    * The first generic "GElement" refers to the type of the selected element(s).
    * The second generic "Datum" refers to the type of the datum of a selected element(s).
    * The third generic "PElement" refers to the type of the parent element(s) in the D3 selection.
    * The fourth generic "PDatum" refers to the type of the datum of the parent element(s).
    */
  @js.native
  trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object {
    
    /**
      * Interrupts the active transition of the specified name on the selected elements, and cancels any pending transitions with the specified name, if any.
      * If a name is not specified, null is used.
      *
      * IMPORTANT: Interrupting a transition on an element has no effect on any transitions on any descendant elements.
      * For example, an axis transition consists of multiple independent, synchronized transitions on the descendants of the axis G element
      * (the tick lines, the tick labels, the domain path, etc.). To interrupt the axis transition, you must therefore interrupt the descendants.
      *
      * @param name Name of the transition.
      */
    def interrupt(): this.type = js.native
    def interrupt(name: String): this.type = js.native
    
    /**
      * Returns a new transition on the given selection with the specified name. If a name is not specified, null is used.
      * The new transition is only exclusive with other transitions of the same name.
      *
      * @param name Name of the transition.
      */
    def transition(): Transition_[GElement, Datum, PElement, PDatum] = js.native
    def transition(name: String): Transition_[GElement, Datum, PElement, PDatum] = js.native
    /**
      * Returns a new transition on the given selection.
      *
      * When using a transition instance, the returned transition has the same id and name as the specified transition.
      * If a transition with the same id already exists on a selected element, the existing transition is returned for that element.
      * Otherwise, the timing of the returned transition is inherited from the existing transition of the same id on the nearest ancestor of each selected element.
      * Thus, this method can be used to synchronize a transition across multiple selections,
      * or to re-select a transition for specific elements and modify its configuration.
      *
      * If the specified transition is not found on a selected node or its ancestors (such as if the transition already ended),
      * the default timing parameters are used; however, in a future release, this will likely be changed to throw an error.
      *
      * @param transition A transition instance.
      */
    def transition(transition: Transition_[BaseType, _, _, _]): Transition_[GElement, Datum, PElement, PDatum] = js.native
  }
}
