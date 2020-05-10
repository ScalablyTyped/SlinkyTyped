package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayChangedEventArgs extends js.Object {
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[_] = js.native
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: Boolean = js.native
}

object IDisplayChangedEventArgs {
  @scala.inline
  def apply(vrSupported: Boolean): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
  @scala.inline
  implicit class IDisplayChangedEventArgsOps[Self <: IDisplayChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVrSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrDisplay(value: Nullable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrDisplayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrDisplay")(null)
        ret
    }
  }
  
}

