package typingsSlinky.d3Quadtree

import typingsSlinky.d3Quadtree.d3QuadtreeNumbers.`4`
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-quadtree", "quadtree")
  @js.native
  def quadtree[T](): Quadtree_[T] = js.native
  @JSImport("d3-quadtree", "quadtree")
  @js.native
  def quadtree[T](data: js.Array[T]): Quadtree_[T] = js.native
  @JSImport("d3-quadtree", "quadtree")
  @js.native
  def quadtree[T](data: js.Array[T], x: js.UndefOr[scala.Nothing], y: js.Function1[/* d */ T, Double]): Quadtree_[T] = js.native
  @JSImport("d3-quadtree", "quadtree")
  @js.native
  def quadtree[T](data: js.Array[T], x: js.Function1[/* d */ T, Double]): Quadtree_[T] = js.native
  @JSImport("d3-quadtree", "quadtree")
  @js.native
  def quadtree[T](data: js.Array[T], x: js.Function1[/* d */ T, Double], y: js.Function1[/* d */ T, Double]): Quadtree_[T] = js.native
  
  @js.native
  trait QuadtreeInternalNode[T]
    extends Array[js.UndefOr[QuadtreeInternalNode[T] | QuadtreeLeaf[T]]] {
    
    /**
      * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
      */
    @JSName("length")
    var length_QuadtreeInternalNode: `4` = js.native
  }
  
  @js.native
  trait QuadtreeLeaf[T] extends StObject {
    
    /**
      * The data associated with this point, as passed to quadtree.add.
      */
    var data: T = js.native
    
    /**
      * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
      */
    var length: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * The next datum in this leaf, if any.
      */
    var next: js.UndefOr[QuadtreeLeaf[T]] = js.native
  }
  object QuadtreeLeaf {
    
    @scala.inline
    def apply[T](data: T): QuadtreeLeaf[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuadtreeLeaf[T]]
    }
    
    @scala.inline
    implicit class QuadtreeLeafMutableBuilder[Self <: QuadtreeLeaf[_], T] (val x: Self with QuadtreeLeaf[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: QuadtreeLeaf[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait Quadtree_[T] extends StObject {
    
    /**
      * Adds the specified datum to the quadtree, deriving its coordinates ⟨x,y⟩ using the current x- and y-accessors, and returns the quadtree.
      * If the new point is outside the current extent of the quadtree, the quadtree is automatically expanded to cover the new point.
      *
      * @param datum The specified datum to add.
      */
    def add(datum: T): this.type = js.native
    
    /**
      * Adds the specified array of data to the quadtree, deriving each element’s coordinates ⟨x,y⟩ using the current x- and y-accessors, and return this quadtree.
      * This is approximately equivalent to calling quadtree.add repeatedly.
      * However, this method results in a more compact quadtree because the extent of the data is computed first before adding the data.
      *
      * @param data The specified array of data to add.
      */
    def addAll(data: js.Array[T]): this.type = js.native
    
    /**
      * Returns a copy of the quadtree. All nodes in the returned quadtree are identical copies of the corresponding node in the quadtree;
      * however, any data in the quadtree is shared by reference and not copied.
      */
    def copy(): Quadtree_[T] = js.native
    
    /**
      * Expands the quadtree to cover the specified point ⟨x,y⟩, and returns the quadtree.
      * * If the quadtree’s extent already covers the specified point, this method does nothing.
      * * If the quadtree has an extent, the extent is repeatedly doubled to cover the specified point, wrapping the root node as necessary.
      * * If the quadtree is empty, the extent is initialized to the extent `[[⌊x⌋, ⌊y⌋], [⌈x⌉, ⌈y⌉]]`.
      * Rounding is necessary such that if the extent is later doubled, the boundaries of existing quadrants do not change due to floating point error.
      *
      * @param x The x-coordinate for the specified point to cover.
      * @param y The y-coordinate for the specified point to cover.
      */
    def cover(x: Double, y: Double): this.type = js.native
    
    /**
      * Returns an array of all data in the quadtree.
      */
    def data(): js.Array[T] = js.native
    
    /**
      * Returns the quadtree's current extent `[[x0, y0], [x1, y1]]`,
      * where `x0` and `y0` are the inclusive lower bounds and `x1` and `y1` are the inclusive upper bounds,
      * or `undefined` if the quadtree has no extent.
      */
    def extent(): js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
    /**
      * Expands the quadtree to cover the specified points `[[x0, y0], [x1, y1]]` and returns the quadtree.
      * The extent may also be expanded by calling `quadtree.cover` or `quadtree.add`.
      *
      * @param extend The specified points to cover.
      */
    def extent(extend: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Returns the datum closest to the position ⟨x,y⟩ with the given search radius. If radius is not specified, it defaults to infinity.
      * If there is no datum within the search area, returns undefined.
      *
      * @param x The x-coordinate for the search position.
      * @param y The y-coordinate for the search position.
      * @param radius The optional search radius.
      */
    def find(x: Double, y: Double): js.UndefOr[T] = js.native
    def find(x: Double, y: Double, radius: Double): js.UndefOr[T] = js.native
    
    /**
      * Removes the specified datum to the quadtree, deriving its coordinates ⟨x,y⟩ using the current x- and y-accessors, and returns the quadtree.
      * If the specified datum does not exist in this quadtree, this method does nothing.
      *
      * @param datum The specified datum to remove.
      */
    def remove(datum: T): this.type = js.native
    
    /**
      * Removes the specified data to the quadtree, deriving their coordinates ⟨x,y⟩ using the current x- and y-accessors, and returns the quadtree.
      * If a specified datum does not exist in this quadtree, it is ignored.
      *
      * @param data The specified array of data to remove.
      */
    def removeAll(data: js.Array[T]): this.type = js.native
    
    /**
      * Returns the root node of the quadtree.
      */
    def root(): QuadtreeInternalNode[T] | QuadtreeLeaf[T] = js.native
    
    /**
      * Returns the total number of data in the quadtree.
      */
    def size(): Double = js.native
    
    /**
      * Visits each node in the quadtree in pre-order traversal, invoking the specified callback with arguments `node`, `x0`, `y0`, `x1`, `y1` for each node,
      * where `node` is the node being visited, ⟨x0, y0⟩ are the lower bounds of the node, and ⟨x1, y1⟩ are the upper bounds, and returns the quadtree.
      *
      * If the callback returns true for a given node, then the children of that node are not visited; otherwise, all child nodes are visited.
      * This can be used to quickly visit only parts of the tree.
      * Note, however, that child quadrants are always visited in sibling order: top-left, top-right, bottom-left, bottom-right.
      * In cases such as search, visiting siblings in a specific order may be faster.
      *
      * @param callback The callback invoked for each node.
      */
    def visit(
      callback: js.Function5[
          /* node */ QuadtreeInternalNode[T] | QuadtreeLeaf[T], 
          /* x0 */ Double, 
          /* y0 */ Double, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          Unit | Boolean
        ]
    ): this.type = js.native
    
    /**
      * Visits each node in the quadtree in post-order traversal, invoking the specified callback with arguments `node`, `x0`, `y0`, `x1`, `y1` for each node,
      * where `node` is the node being visited, ⟨x0, y0⟩ are the lower bounds of the node, and ⟨x1, y1⟩ are the upper bounds, and returns the quadtree.
      *
      * @param callback The callback invoked for each node.
      */
    def visitAfter(
      callback: js.Function5[
          /* node */ QuadtreeInternalNode[T] | QuadtreeLeaf[T], 
          /* x0 */ Double, 
          /* y0 */ Double, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Returns the current x-accessor, which defaults to: `x(d) => d[0]`.
      */
    def x(): js.Function1[/* d */ T, Double] = js.native
    /**
      * Sets the current x-coordinate accessor and returns the quadtree.
      * The x-accessors must be consistent, returning the same value given the same input.
      *
      * @param x The x-coordinate accessor.
      */
    def x(x: js.Function1[/* d */ T, Double]): this.type = js.native
    
    /**
      * Returns the current y-accessor, which defaults to: `y(d) => d[1]`.
      */
    def y(): js.Function1[/* d */ T, Double] = js.native
    /**
      * Sets the current y-coordinate accessor and returns the quadtree.
      * The y-accessors must be consistent, returning the same value given the same input.
      *
      * @param y The y-coordinate accessor.
      */
    def y(y: js.Function1[/* d */ T, Double]): this.type = js.native
  }
}
