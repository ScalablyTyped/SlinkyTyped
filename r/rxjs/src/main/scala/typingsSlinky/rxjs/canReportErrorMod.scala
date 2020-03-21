package typingsSlinky.rxjs

import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/canReportError", JSImport.Namespace)
@js.native
object canReportErrorMod extends js.Object {
  def canReportError(observer: Subject[_]): Boolean = js.native
  def canReportError(observer: Subscriber[_]): Boolean = js.native
}

