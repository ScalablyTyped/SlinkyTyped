package typingsSlinky.rxDom.mod

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typingsSlinky.rx.mod.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

