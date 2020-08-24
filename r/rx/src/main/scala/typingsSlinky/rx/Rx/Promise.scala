package typingsSlinky.rx.Rx

import typingsSlinky.rx.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T]
  extends PromiseLike[T]
     with ObservableOrPromise[T]

