package typingsSlinky.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object unionMod {
  
  type CustomCSProcessor[T] = (typingsSlinky.std.Exclude[T, typingsSlinky.mobxStateTree.snapshotProcessorMod.NotCustomized]) | typingsSlinky.mobxStateTree.snapshotProcessorMod.NotCustomized
  
  type ITypeDispatcher = js.Function1[/* snapshot */ js.Any, typingsSlinky.mobxStateTree.typeMod.IAnyType]
  
  type ITypeUnion[C, S, T] = typingsSlinky.mobxStateTree.typeMod.IType[
    typingsSlinky.mobxStateTree.unionMod.CustomCSProcessor[C], 
    typingsSlinky.mobxStateTree.unionMod.CustomCSProcessor[S], 
    T
  ]
}
