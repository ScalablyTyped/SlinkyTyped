package typingsSlinky.rx.mod

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends typingsSlinky.rxLite.Rx.RefCountDisposable {
  def this(disposable: IDisposable) = this()
}

