package typingsSlinky.maquette

import org.scalajs.dom.raw.Element
import typingsSlinky.maquette.interfacesMod.Projection
import typingsSlinky.maquette.interfacesMod.ProjectionOptions
import typingsSlinky.maquette.interfacesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("maquette/dist/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/dom", "applyDefaultProjectionOptions")
  @js.native
  def applyDefaultProjectionOptions: js.Function1[/* projectorOptions */ js.UndefOr[ProjectionOptions], ProjectionOptions] = js.native
  @scala.inline
  def applyDefaultProjectionOptions_=(x: js.Function1[/* projectorOptions */ js.UndefOr[ProjectionOptions], ProjectionOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyDefaultProjectionOptions")(x.asInstanceOf[js.Any])
  
  object dom {
    
    /**
      * Appends a new child node to the DOM which is generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param parentNode - The parent node for the new child node.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    @JSImport("maquette/dist/dom", "dom.append")
    @js.native
    def append(parentNode: Element, vnode: VNode): Projection = js.native
    @JSImport("maquette/dist/dom", "dom.append")
    @js.native
    def append(parentNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Creates a real DOM tree from `vnode`. The [[Projection]] object returned will contain the resulting DOM Node in
      * its [[Projection.domNode|domNode]] property.
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection.
      * @returns The [[Projection]] which also contains the DOM Node that was created.
      */
    @JSImport("maquette/dist/dom", "dom.create")
    @js.native
    def create(vnode: VNode): Projection = js.native
    @JSImport("maquette/dist/dom", "dom.create")
    @js.native
    def create(vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Inserts a new DOM node which is generated from a [[VNode]].
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function.
      * NOTE: [[VNode]] objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    @JSImport("maquette/dist/dom", "dom.insertBefore")
    @js.native
    def insertBefore(beforeNode: Element, vnode: VNode): Projection = js.native
    @JSImport("maquette/dist/dom", "dom.insertBefore")
    @js.native
    def insertBefore(beforeNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Merges a new DOM node which is generated from a [[VNode]] with an existing DOM Node.
      * This means that the virtual DOM and the real DOM will have one overlapping element.
      * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided.
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param element - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]] objects
      * may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    @JSImport("maquette/dist/dom", "dom.merge")
    @js.native
    def merge(element: Element, vnode: VNode): Projection = js.native
    @JSImport("maquette/dist/dom", "dom.merge")
    @js.native
    def merge(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Replaces an existing DOM node with a node generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param element - The node for the [[VNode]] to replace.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    @JSImport("maquette/dist/dom", "dom.replace")
    @js.native
    def replace(element: Element, vnode: VNode): Projection = js.native
    @JSImport("maquette/dist/dom", "dom.replace")
    @js.native
    def replace(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
  }
}
