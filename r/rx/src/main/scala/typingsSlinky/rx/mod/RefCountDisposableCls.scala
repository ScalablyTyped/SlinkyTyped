package typingsSlinky.rx.mod

import typingsSlinky.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "RefCountDisposable")
@js.native
class RefCountDisposableCls protected ()
  extends typingsSlinky.rx.Rx.RefCountDisposable {
  /**
    * Initializes a new instance of the RefCountDisposable with the specified disposable.
    * @constructor
    * @param {Disposable} disposable Underlying disposable.
    */
  def this(disposable: IDisposable) = this()
}

