package typingsSlinky.atom.mod

import typingsSlinky.atom.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package extends js.Object {
  /** The name of the Package. */
  val name: String = js.native
  /** The path to the Package on disk. */
  val path: String = js.native
  /** If a previous rebuild failed, get the contents of stderr. */
  def getBuildFailureOutput(): String | Null = js.native
  // Native Module Compatibility
  /**
    *  Are all native modules depended on by this package correctly compiled
    *  against the current version of Atom?
    */
  def isCompatible(): Boolean = js.native
  // Event Subscription
  /** Invoke the given callback when all packages have been activated. */
  def onDidDeactivate(callback: js.Function0[Unit]): Disposable = js.native
  /**
    *  Rebuild native modules in this package's dependencies for the current
    *  version of Atom.
    */
  def rebuild(): js.Promise[AnonCode] = js.native
}

object Package {
  @scala.inline
  def apply(
    getBuildFailureOutput: () => String | Null,
    isCompatible: () => Boolean,
    name: String,
    onDidDeactivate: js.Function0[Unit] => Disposable,
    path: String,
    rebuild: () => js.Promise[AnonCode]
  ): Package = {
    val __obj = js.Dynamic.literal(getBuildFailureOutput = js.Any.fromFunction0(getBuildFailureOutput), isCompatible = js.Any.fromFunction0(isCompatible), name = name.asInstanceOf[js.Any], onDidDeactivate = js.Any.fromFunction1(onDidDeactivate), path = path.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild))
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBuildFailureOutput(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuildFailureOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCompatible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompatible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDidDeactivate(value: js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDeactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebuild(value: () => js.Promise[AnonCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

