package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.nock.mod.StatusCode]
  - js.Tuple2[typingsSlinky.nock.mod.StatusCode, typingsSlinky.nock.mod.ReplyBody]
  - js.Tuple3[
typingsSlinky.nock.mod.StatusCode, 
typingsSlinky.nock.mod.ReplyBody, 
typingsSlinky.nock.mod.ReplyHeaders]
*/
trait ReplyFnResult extends js.Object

object ReplyFnResult {
  @scala.inline
  implicit def apply(value: js.Array[StatusCode]): ReplyFnResult = value.asInstanceOf[ReplyFnResult]
  @scala.inline
  implicit def apply(value: js.Tuple2[StatusCode, ReplyBody]): ReplyFnResult = value.asInstanceOf[ReplyFnResult]
  @scala.inline
  implicit def apply(value: js.Tuple3[StatusCode, ReplyBody, ReplyHeaders]): ReplyFnResult = value.asInstanceOf[ReplyFnResult]
}

