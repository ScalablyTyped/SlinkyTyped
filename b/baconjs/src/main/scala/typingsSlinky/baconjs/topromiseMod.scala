package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/topromise", JSImport.Namespace)
@js.native
object topromiseMod extends js.Object {
  
  def firstToPromise[V](src: default[V]): js.Promise[V] = js.native
  def firstToPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = js.native
  
  def toPromise[V](src: default[V]): js.Promise[V] = js.native
  def toPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = js.native
}
