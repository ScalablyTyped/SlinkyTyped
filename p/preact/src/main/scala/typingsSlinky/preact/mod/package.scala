package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[P, S] = typingsSlinky.preact.mod.ComponentClass[P, S]
  type ComponentFactory[P] = typingsSlinky.preact.mod.ComponentType[P]
  //
  // Context
  // -----------------------------------
  type Consumer[T] = typingsSlinky.preact.mod.FunctionComponent[typingsSlinky.preact.anon.`0`[T]]
  type FunctionalComponent[P] = typingsSlinky.preact.mod.FunctionComponent[P]
  type PreactConsumer[T] = typingsSlinky.preact.mod.Consumer[T]
  type PreactContext[T] = typingsSlinky.preact.mod.Context[T]
  type PreactProvider[T] = typingsSlinky.preact.mod.Provider[T]
  type Provider[T] = typingsSlinky.preact.mod.FunctionComponent[typingsSlinky.preact.anon.Value[T]]
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  type RenderableProps[P, RefType] = P with typingsSlinky.preact.mod.Attributes with typingsSlinky.preact.anon.Ref[RefType]
}
