package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
}
