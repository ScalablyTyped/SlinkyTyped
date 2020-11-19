package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/argumentstoobservables", JSImport.Namespace)
@js.native
object argumentstoobservablesMod extends js.Object {
  
  def argumentsToObservables[T](args: js.Array[default[T] | js.Array[default[T]] | T]): js.Array[default[T]] = js.native
  
  def argumentsToObservablesAndFunction[V](args: IArguments): js.Tuple2[js.Array[default[_]], js.Function1[/* repeated */ _, V]] = js.native
}
