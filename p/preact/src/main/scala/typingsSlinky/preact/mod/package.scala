package typingsSlinky.preact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  //
  // Preact Built-in Components
  // -----------------------------------
  // TODO: Revisit what the public type of this is...
  @scala.inline
  def Fragment: typingsSlinky.preact.mod.ComponentClass[js.Object, js.Object] = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typingsSlinky.preact.mod.ComponentClass[js.Object, js.Object]]
  
  type ComponentChild = js.UndefOr[
    typingsSlinky.preact.mod.VNode[js.Any] | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  
  type ComponentChildren = js.Array[typingsSlinky.preact.mod.ComponentChild] | typingsSlinky.preact.mod.ComponentChild
  
  type ComponentConstructor[P, S] = typingsSlinky.preact.mod.ComponentClass[P, S]
  
  type ComponentFactory[P] = typingsSlinky.preact.mod.ComponentType[P]
  
  type ComponentProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */] = /* import warning: importer.ImportType#apply Failed type conversion: preact.preact/src/jsx.JSXInternal.IntrinsicElements[C] */ js.Any
  
  type ComponentType[P] = (typingsSlinky.preact.mod.ComponentClass[P, js.Object]) | typingsSlinky.preact.mod.FunctionComponent[P]
  
  //
  // Context
  // -----------------------------------
  type Consumer[T] = typingsSlinky.preact.mod.FunctionComponent[typingsSlinky.preact.anon.`0`[T]]
  
  type FunctionalComponent[P] = typingsSlinky.preact.mod.FunctionComponent[P]
  
  //
  // Preact Component interface
  // -----------------------------------
  type Key = java.lang.String | scala.Double | js.Any
  
  type PreactConsumer[T] = typingsSlinky.preact.mod.Consumer[T]
  
  type PreactContext[T] = typingsSlinky.preact.mod.Context[T]
  
  type PreactProvider[T] = typingsSlinky.preact.mod.Provider[T]
  
  type Provider[T] = typingsSlinky.preact.mod.FunctionComponent[typingsSlinky.preact.anon.Value[T]]
  
  type Ref[T] = typingsSlinky.preact.mod.RefObject[T] | typingsSlinky.preact.mod.RefCallback[T]
  
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  
  type RenderableProps[P, RefType] = P with typingsSlinky.preact.mod.Attributes with typingsSlinky.preact.anon.Ref[RefType]
  
  @scala.inline
  def cloneElement(
    vnode: typingsSlinky.preact.mod.VNode[_],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.preact.mod.ComponentChildren*
  ): typingsSlinky.preact.mod.VNode[_] = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.preact.mod.VNode[_]]
  @scala.inline
  def cloneElement(
    vnode: typingsSlinky.preact.mod.VNode[_],
    props: js.Any,
    children: typingsSlinky.preact.mod.ComponentChildren*
  ): typingsSlinky.preact.mod.VNode[_] = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.preact.mod.VNode[_]]
  
  @scala.inline
  def cloneElement_P[P](
    vnode: typingsSlinky.preact.mod.VNode[P],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.preact.mod.ComponentChildren*
  ): typingsSlinky.preact.mod.VNode[P] = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.preact.mod.VNode[P]]
  @scala.inline
  def cloneElement_P[P](
    vnode: typingsSlinky.preact.mod.VNode[P],
    props: js.Any,
    children: typingsSlinky.preact.mod.ComponentChildren*
  ): typingsSlinky.preact.mod.VNode[P] = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.preact.mod.VNode[P]]
  
  @scala.inline
  def createContext[T](defaultValue: T): typingsSlinky.preact.mod.Context[T] = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.preact.mod.Context[T]]
  
  //
  // Preact helpers
  // -----------------------------------
  @scala.inline
  def createRef[T](): typingsSlinky.preact.mod.RefObject[T] = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typingsSlinky.preact.mod.RefObject[T]]
  
  @scala.inline
  def hydrate(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.Document): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hydrate(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.DocumentFragment): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hydrate(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.Element): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hydrate(vnode: typingsSlinky.preact.mod.ComponentChild, parent: typingsSlinky.std.ShadowRoot): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isValidElement(vnode: js.Any): /* is preact.preact.VNode<{}> */ scala.Boolean = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(vnode.asInstanceOf[js.Any]).asInstanceOf[/* is preact.preact.VNode<{}> */ scala.Boolean]
  
  @scala.inline
  def options: typingsSlinky.preact.mod.Options_ = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[typingsSlinky.preact.mod.Options_]
  
  @scala.inline
  def render(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.Document): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.DocumentFragment): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.DocumentFragment,
    replaceNode: org.scalajs.dom.raw.Element
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.DocumentFragment,
    replaceNode: org.scalajs.dom.raw.Text
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.Document,
    replaceNode: org.scalajs.dom.raw.Element
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.Document,
    replaceNode: org.scalajs.dom.raw.Text
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  //
  // Preact render
  // -----------------------------------
  @scala.inline
  def render(vnode: typingsSlinky.preact.mod.ComponentChild, parent: org.scalajs.dom.raw.Element): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.Element,
    replaceNode: org.scalajs.dom.raw.Element
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: org.scalajs.dom.raw.Element,
    replaceNode: org.scalajs.dom.raw.Text
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(vnode: typingsSlinky.preact.mod.ComponentChild, parent: typingsSlinky.std.ShadowRoot): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: typingsSlinky.std.ShadowRoot,
    replaceNode: org.scalajs.dom.raw.Element
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render(
    vnode: typingsSlinky.preact.mod.ComponentChild,
    parent: typingsSlinky.std.ShadowRoot,
    replaceNode: org.scalajs.dom.raw.Text
  ): scala.Unit = (typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def toChildArray(children: typingsSlinky.preact.mod.ComponentChildren): js.Array[typingsSlinky.preact.mod.VNode[js.Object] | java.lang.String | scala.Double] = typingsSlinky.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toChildArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.preact.mod.VNode[js.Object] | java.lang.String | scala.Double]]
}
