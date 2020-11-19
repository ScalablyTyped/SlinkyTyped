package typingsSlinky.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fuse[T, O /* <: FuseOptions[T] */] extends js.Object {
  
  var list: js.Array[T] = js.native
  
  def search[/** Type of item of return */
  R, /** include score (boolean) */
  S, /** include matches (boolean) */
  M](pattern: String): js.Array[
    (FuseResultWithMatches[R] with FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
  ] = js.native
  def search[/** Type of item of return */
  R, /** include score (boolean) */
  S, /** include matches (boolean) */
  M](pattern: String, opts: SearchOpts): js.Array[
    (FuseResultWithMatches[R] with FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
  ] = js.native
  
  def setCollection(list: js.Array[T]): js.Array[T] = js.native
}
