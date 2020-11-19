package typingsSlinky.enzyme.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme", "ShallowWrapper")
@js.native
class ShallowWrapper[P, S, C] protected () extends CommonWrapper[P, S, C] {
  def this(nodes: js.Array[ReactElement]) = this()
  def this(nodes: ReactElement) = this()
  def this(nodes: js.Array[ReactElement], root: ShallowWrapper[_, _, ReactComponentClass[js.Object]]) = this()
  def this(nodes: ReactElement, root: ShallowWrapper[_, _, ReactComponentClass[js.Object]]) = this()
  def this(nodes: js.Array[ReactElement], root: js.UndefOr[scala.Nothing], options: ShallowRendererProps) = this()
  def this(
    nodes: js.Array[ReactElement],
    root: ShallowWrapper[_, _, ReactComponentClass[js.Object]],
    options: ShallowRendererProps
  ) = this()
  def this(nodes: ReactElement, root: js.UndefOr[scala.Nothing], options: ShallowRendererProps) = this()
  def this(
    nodes: ReactElement,
    root: ShallowWrapper[_, _, ReactComponentClass[js.Object]],
    options: ShallowRendererProps
  ) = this()
  
  /**
    * Returns a new wrapper with child at the specified index.
    */
  def childAt(index: Double): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  @JSName("childAt")
  def childAt_P2S2[P2, S2](index: Double): ShallowWrapper[P2, S2, ReactComponentClass[js.Object]] = js.native
  
  def children(): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def children(props: EnzymePropSelector): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def children(selector: String): ShallowWrapper[HTMLAttributes, _, ReactComponentClass[js.Object]] = js.native
  def children[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, ReactComponentClass[js.Object]] = js.native
  /**
    * Returns a new wrapper with all of the children of the node(s) in the current wrapper. Optionally, a selector
    * can be provided and it will filter the children by this selector.
    */
  def children[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, ReactComponentClass[js.Object]] = js.native
  
  def closest(props: EnzymePropSelector): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def closest(selector: String): ShallowWrapper[HTMLAttributes, _, ReactComponentClass[js.Object]] = js.native
  def closest[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, ReactComponentClass[js.Object]] = js.native
  /**
    * Returns a wrapper of the first element that matches the selector by traversing up through the current node's
    * ancestors in the tree, starting with itself.
    *
    * Note: can only be called on a wrapper of a single node.
    */
  def closest[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, ReactComponentClass[js.Object]] = js.native
  
  def dive[P2, S2](): ShallowWrapper[P2, S2, ReactComponentClass[js.Object]] = js.native
  def dive[P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, ReactComponentClass[js.Object]] = js.native
  /**
    * Shallow render the one non-DOM child of the current wrapper, and return a wrapper around the result.
    * NOTE: can only be called on wrapper of a single non-DOM component element node.
    */
  @JSName("dive")
  def dive_C2_ComponentObjectObjectWildcardP2S2[C2 /* <: ReactComponentClass[js.Object] */, P2, S2](): ShallowWrapper[P2, S2, C2] = js.native
  @JSName("dive")
  def dive_C2_ComponentObjectObjectWildcardP2S2[C2 /* <: ReactComponentClass[js.Object] */, P2, S2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
  @JSName("dive")
  def dive_P2S2C2[P2, S2, C2](): ShallowWrapper[P2, S2, C2] = js.native
  @JSName("dive")
  def dive_P2S2C2[P2, S2, C2](options: ShallowRendererProps): ShallowWrapper[P2, S2, C2] = js.native
  
  def filter(props: String): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  def filter(props: EnzymePropSelector): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  def filter[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, ReactComponentClass[js.Object]] = js.native
  /**
    * Removes nodes in the current wrapper that do not match the provided selector.
    * @param selector The selector to match.
    */
  def filter[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, ReactComponentClass[js.Object]] = js.native
  
  def find(props: EnzymePropSelector): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def find(selector: String): ShallowWrapper[HTMLAttributes, _, ReactComponentClass[js.Object]] = js.native
  def find[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, ReactComponentClass[js.Object]] = js.native
  /**
    * Find every node in the render tree that matches the provided selector.
    * @param selector The selector to match.
    */
  def find[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, ReactComponentClass[js.Object]] = js.native
  
  /**
    * Finds every node in the render tree that returns true for the provided predicate function.
    */
  def findWhere(
    predicate: js.Function1[/* wrapper */ ShallowWrapper[_, _, ReactComponentClass[js.Object]], Boolean]
  ): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  
  @JSName("find")
  def find_props[C2 /* <: ReactComponentClass[js.Object] */](
    componentClass: ComponentClass[
      /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any
    ]
  ): ShallowWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: C2['props'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: C2['state'] */ js.Any, 
    C2
  ] = js.native
  
  /**
    * If a wrappingComponent was passed in options,
    * this methods returns a ShallowWrapper around the rendered wrappingComponent.
    * This ShallowWrapper can be used to update the wrappingComponent's props and state
    */
  def getWrappingComponent(): ShallowWrapper[js.Object, js.Object, ReactComponentClass[js.Object]] = js.native
  
  /**
    * Strips out all the not host-nodes from the list of nodes
    *
    * This method is useful if you want to check for the presence of host nodes
    * (actually rendered HTML elements) ignoring the React nodes.
    */
  def hostNodes(): ShallowWrapper[HTMLAttributes, js.Object, ReactComponentClass[js.Object]] = js.native
  
  /**
    * Returns a wrapper with the direct parent of the node in the current wrapper.
    */
  def parent(): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  
  def parents(): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def parents(props: EnzymePropSelector): ShallowWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  def parents(selector: String): ShallowWrapper[HTMLAttributes, _, ReactComponentClass[js.Object]] = js.native
  def parents[P2](component: ComponentType[P2]): ShallowWrapper[P2, _, ReactComponentClass[js.Object]] = js.native
  /**
    * Returns a wrapper around all of the parents/ancestors of the wrapper. Does not include the node in the
    * current wrapper. Optionally, a selector can be provided and it will filter the parents by this selector.
    *
    * Note: can only be called on a wrapper of a single node.
    */
  def parents[P2](statelessComponent: StatelessComponent[P2]): ShallowWrapper[P2, scala.Nothing, ReactComponentClass[js.Object]] = js.native
  
  /**
    * Returns a wrapper of the node rendered by the provided render prop.
    */
  def renderProp[PropName /* <: /* keyof P */ String */](prop: PropName): js.Function1[
    /* params */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: P[PropName] */ js.Any
    ], 
    ShallowWrapper[_, scala.Nothing, ReactComponentClass[js.Object]]
  ] = js.native
  
  def shallow(): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  def shallow(options: ShallowRendererProps): ShallowWrapper[P, S, ReactComponentClass[js.Object]] = js.native
  
  def unmount(): this.type = js.native
}
