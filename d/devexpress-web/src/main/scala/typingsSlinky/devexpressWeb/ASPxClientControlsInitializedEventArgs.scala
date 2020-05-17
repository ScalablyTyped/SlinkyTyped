package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@js.native
trait ASPxClientControlsInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean = js.native
}

object ASPxClientControlsInitializedEventArgs {
  @scala.inline
  def apply(isCallback: Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientControlsInitializedEventArgsOps[Self <: ASPxClientControlsInitializedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCallback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

