package typingsSlinky.mithril

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CVnode[A] = typingsSlinky.mithril.mod.Vnode[A, typingsSlinky.mithril.mod.ClassComponent[A]]
  type CVnodeDOM[A] = typingsSlinky.mithril.mod.VnodeDOM[A, typingsSlinky.mithril.mod.ClassComponent[A]]
  // Vnode children types
  type Child = js.UndefOr[
    (typingsSlinky.mithril.mod.Vnode[js.Any, js.Any]) | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type ChildArrayOrPrimitive = typingsSlinky.mithril.mod.ChildArray | java.lang.String | scala.Double | scala.Boolean
  type Children = typingsSlinky.mithril.mod.Child | typingsSlinky.mithril.mod.ChildArray
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type ClosureComponent[A] = typingsSlinky.mithril.mod.FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any Javascript object that has a view method is a Mithril component. Components can be consumed via the m() utility.
  	 */
  type Comp[Attrs, State /* <: typingsSlinky.mithril.mod.Lifecycle[Attrs, State] */] = (typingsSlinky.mithril.mod.Component[Attrs, State]) with State
  /** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mithril.mod.Component[A, S]
    - typingsSlinky.mithril.AnonInstantiable[A]
    - typingsSlinky.mithril.mod.FactoryComponent[A]
  */
  type ComponentTypes[A, S /* <: typingsSlinky.mithril.mod.Lifecycle[A, S] */] = (typingsSlinky.mithril.mod._ComponentTypes[A, S]) | typingsSlinky.mithril.mod.FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type FactoryComponent[A] = js.Function1[
    /* vnode */ typingsSlinky.mithril.mod.Vnode[A, js.Object], 
    typingsSlinky.mithril.mod.Component[A, js.Object]
  ]
  type Params = js.Object with typingsSlinky.mithril.mod.ParamsRec
  /** This represents a key-value mapping linking routes to components. */
  type RouteDefs = /** The key represents the route. The value represents the corresponding component. */
  org.scalablytyped.runtime.StringDictionary[
    (typingsSlinky.mithril.mod.ComponentTypes[js.Any, js.Any]) | (typingsSlinky.mithril.mod.RouteResolver[js.Any, js.Any])
  ]
}
