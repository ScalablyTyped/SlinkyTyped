package typingsSlinky.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyNode[Datum] extends js.Object {
  /**
    * An array of child nodes, if any; undefined for leaf nodes.
    */
  var children: js.UndefOr[js.Array[this.type]] = js.native
  /**
    * The associated data, as specified to the constructor.
    */
  var data: Datum = js.native
  /**
    * Zero for the root node, and increasing by one for each descendant generation.
    */
  val depth: Double = js.native
  /**
    * Zero for leaf nodes, and the greatest distance from any descendant leaf for internal nodes.
    */
  val height: Double = js.native
  /**
    * Optional node id string set by `StratifyOperator`, if hierarchical data was created from tabular data using stratify().
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The parent node, or null for the root node.
    */
  var parent: this.type | Null = js.native
  /**
    * Aggregated numeric value as calculated by `sum(value)` or `count()`, if previously invoked.
    */
  val value: js.UndefOr[Double] = js.native
  /**
    * Returns the array of ancestors nodes, starting with this node, then followed by each parent up to the root.
    */
  def ancestors(): js.Array[this.type] = js.native
  /**
    * Return a deep copy of the subtree starting at this node. The returned deep copy shares the same data, however.
    * The returned node is the root of a new tree; the returned node’s parent is always null and its depth is always zero.
    */
  def copy(): this.type = js.native
  /**
    * Computes the number of leaves under this node and assigns it to `node.value`, and similarly for every descendant of node.
    * If this node is a leaf, its count is one. Returns this node.
    */
  def count(): this.type = js.native
  /**
    * Returns the array of descendant nodes, starting with this node, then followed by each child in topological order.
    */
  def descendants(): js.Array[this.type] = js.native
  /**
    * Invokes the specified function for node and each descendant in breadth-first order,
    * such that a given node is only visited if all nodes of lesser depth have already been visited,
    * as well as all preceding nodes of the same depth.
    *
    * @param func The specified function is passed the current node.
    */
  def each(func: js.Function1[/* node */ this.type, Unit]): this.type = js.native
  /**
    * Invokes the specified function for node and each descendant in post-order traversal,
    * such that a given node is only visited after all of its descendants have already been visited.
    *
    * @param func The specified function is passed the current node.
    */
  def eachAfter(func: js.Function1[/* node */ this.type, Unit]): this.type = js.native
  /**
    * Invokes the specified function for node and each descendant in pre-order traversal,
    * such that a given node is only visited after all of its ancestors have already been visited.
    *
    * @param func The specified function is passed the current node.
    */
  def eachBefore(func: js.Function1[/* node */ this.type, Unit]): this.type = js.native
  /**
    * Returns the array of leaf nodes in traversal order; leaves are nodes with no children.
    */
  def leaves(): js.Array[this.type] = js.native
  /**
    * Returns an array of links for this node, where each link is an object that defines source and target properties.
    * The source of each link is the parent node, and the target is a child node.
    */
  def links(): js.Array[HierarchyLink[Datum]] = js.native
  /**
    * Returns the shortest path through the hierarchy from this node to the specified target node.
    * The path starts at this node, ascends to the least common ancestor of this node and the target node, and then descends to the target node.
    *
    * @param target The target node.
    */
  def path(target: this.type): js.Array[this.type] = js.native
  /**
    * Sorts the children of this node, if any, and each of this node’s descendants’ children,
    * in pre-order traversal using the specified compare function, and returns this node.
    *
    * @param compare The compare function is passed two nodes a and b to compare.
    * If a should be before b, the function must return a value less than zero;
    * if b should be before a, the function must return a value greater than zero;
    * otherwise, the relative order of a and b are not specified. See `array.sort` for more.
    */
  def sort(compare: js.Function2[/* a */ this.type, /* b */ this.type, Double]): this.type = js.native
  /**
    * Evaluates the specified value function for this node and each descendant in post-order traversal, and returns this node.
    * The `node.value` property of each node is set to the numeric value returned by the specified function plus the combined value of all descendants.
    *
    * @param value The value function is passed the node’s data, and must return a non-negative number.
    */
  def sum(value: js.Function1[/* d */ Datum, Double]): this.type = js.native
}

object HierarchyNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyNode[Datum]],
    copy: () => HierarchyNode[Datum],
    count: () => HierarchyNode[Datum],
    data: Datum,
    depth: Double,
    descendants: () => js.Array[HierarchyNode[Datum]],
    each: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum],
    eachAfter: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum],
    eachBefore: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum],
    height: Double,
    leaves: () => js.Array[HierarchyNode[Datum]],
    links: () => js.Array[HierarchyLink[Datum]],
    path: HierarchyNode[Datum] => js.Array[HierarchyNode[Datum]],
    sort: js.Function2[HierarchyNode[Datum], HierarchyNode[Datum], Double] => HierarchyNode[Datum],
    sum: js.Function1[/* d */ Datum, Double] => HierarchyNode[Datum]
  ): HierarchyNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height.asInstanceOf[js.Any], leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum))
    __obj.asInstanceOf[HierarchyNode[Datum]]
  }
  @scala.inline
  implicit class HierarchyNodeOps[Self[datum] <: HierarchyNode[datum], Datum] (val x: Self[Datum]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Datum] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Datum]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Datum] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Datum] with Other]
    @scala.inline
    def withAncestors(value: () => js.Array[HierarchyNode[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: () => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: Datum): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescendants(value: () => js.Array[HierarchyNode[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendants")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEach(value: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEachAfter(value: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEachBefore(value: js.Function1[HierarchyNode[Datum], Unit] => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaves(value: () => js.Array[HierarchyNode[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaves")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLinks(value: () => js.Array[HierarchyLink[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: HierarchyNode[Datum] => js.Array[HierarchyNode[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: js.Function2[HierarchyNode[Datum], HierarchyNode[Datum], Double] => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSum(value: js.Function1[/* d */ Datum, Double] => HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[HierarchyNode[Datum]]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: HierarchyNode[Datum]): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[Datum] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

