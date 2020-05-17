package typingsSlinky.rxLite.global.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typingsSlinky.rxLite.Rx.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

