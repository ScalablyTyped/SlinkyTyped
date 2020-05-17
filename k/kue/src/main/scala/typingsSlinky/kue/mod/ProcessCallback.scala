package typingsSlinky.kue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * job * / typingsSlinky.kue.mod.Job, 
/ * cb * / typingsSlinky.kue.mod.DoneCallback, 
scala.Unit]
  - js.Function3[
/ * job * / typingsSlinky.kue.mod.Job, 
/ * ctx * / typingsSlinky.kue.mod.WorkerCtx, 
/ * cb * / typingsSlinky.kue.mod.DoneCallback, 
scala.Unit]
*/
trait ProcessCallback extends js.Object

object ProcessCallback {
  @scala.inline
  implicit def apply(value: js.Function2[/* job */ Job, /* cb */ DoneCallback, Unit]): ProcessCallback = value.asInstanceOf[ProcessCallback]
  @scala.inline
  implicit def apply(value: js.Function3[/* job */ Job, /* ctx */ WorkerCtx, /* cb */ DoneCallback, Unit]): ProcessCallback = value.asInstanceOf[ProcessCallback]
}

