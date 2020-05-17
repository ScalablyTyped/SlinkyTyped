package typingsSlinky.googleGax.apitypesMod

import typingsSlinky.googleGax.callMod.CancellablePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleGax.callMod.CancellablePromise[typingsSlinky.googleGax.apitypesMod.ResultTuple]
  - typingsSlinky.googleGax.apitypesMod.CancellableStream
*/
trait GaxCallResult extends js.Object

object GaxCallResult {
  @scala.inline
  implicit def apply(value: CancellablePromise[ResultTuple]): GaxCallResult = value.asInstanceOf[GaxCallResult]
  @scala.inline
  implicit def apply(value: CancellableStream): GaxCallResult = value.asInstanceOf[GaxCallResult]
}

