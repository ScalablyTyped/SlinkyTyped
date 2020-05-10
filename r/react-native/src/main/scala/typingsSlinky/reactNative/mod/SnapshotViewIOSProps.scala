package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotViewIOSProps extends ViewProps {
  // A name to identify the individual instance to the SnapshotView
  var testIdentifier: String = js.native
  // A callback when the Snapshot view is ready to be compared
  def onSnapshotReady(): js.Any = js.native
}

object SnapshotViewIOSProps {
  @scala.inline
  def apply(onSnapshotReady: () => js.Any, testIdentifier: String): SnapshotViewIOSProps = {
    val __obj = js.Dynamic.literal(onSnapshotReady = js.Any.fromFunction0(onSnapshotReady), testIdentifier = testIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotViewIOSProps]
  }
  @scala.inline
  implicit class SnapshotViewIOSPropsOps[Self <: SnapshotViewIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSnapshotReady(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSnapshotReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTestIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

