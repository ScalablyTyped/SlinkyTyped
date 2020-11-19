package typingsSlinky.rx.rxAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.async", "AsyncSubject")
@js.native
/**
  * Creates a subject that can only receive one value and that value is cached for all future observations.
  * @constructor
  */
class AsyncSubjectCls[T] ()
  extends typingsSlinky.rx.Rx.Subject[T]
