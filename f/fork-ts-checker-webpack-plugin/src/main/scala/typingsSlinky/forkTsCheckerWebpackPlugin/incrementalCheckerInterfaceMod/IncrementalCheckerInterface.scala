package typingsSlinky.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import typingsSlinky.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncrementalCheckerInterface extends js.Object {
  def getDiagnostics(cancellationToken: CancellationToken): js.Promise[js.Array[NormalizedMessage]] = js.native
  def getEsLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage] = js.native
  def getLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage] = js.native
  def hasEsLinter(): Boolean = js.native
  def hasLinter(): Boolean = js.native
  def nextIteration(): Unit = js.native
}

object IncrementalCheckerInterface {
  @scala.inline
  def apply(
    getDiagnostics: CancellationToken => js.Promise[js.Array[NormalizedMessage]],
    getEsLints: CancellationToken => js.Array[NormalizedMessage],
    getLints: CancellationToken => js.Array[NormalizedMessage],
    hasEsLinter: () => Boolean,
    hasLinter: () => Boolean,
    nextIteration: () => Unit
  ): IncrementalCheckerInterface = {
    val __obj = js.Dynamic.literal(getDiagnostics = js.Any.fromFunction1(getDiagnostics), getEsLints = js.Any.fromFunction1(getEsLints), getLints = js.Any.fromFunction1(getLints), hasEsLinter = js.Any.fromFunction0(hasEsLinter), hasLinter = js.Any.fromFunction0(hasLinter), nextIteration = js.Any.fromFunction0(nextIteration))
    __obj.asInstanceOf[IncrementalCheckerInterface]
  }
  @scala.inline
  implicit class IncrementalCheckerInterfaceOps[Self <: IncrementalCheckerInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDiagnostics(value: CancellationToken => js.Promise[js.Array[NormalizedMessage]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEsLints(value: CancellationToken => js.Array[NormalizedMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEsLints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLints(value: CancellationToken => js.Array[NormalizedMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasEsLinter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEsLinter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLinter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLinter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextIteration(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIteration")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

