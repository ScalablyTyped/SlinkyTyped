package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container exits.
  */
@js.native
trait SchemaContainerStoppedEvent extends js.Object {
  /**
    * The numeric ID of the action that started this container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
  /**
    * The tail end of any content written to standard error by the container.
    * If the content emits large amounts of debugging noise or contains
    * sensitive information, you can prevent the content from being printed by
    * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.  Note that only a
    * small amount of the end of the stream is captured here. The entire stream
    * is stored in the `/google/logs` directory mounted into each action, and
    * can be copied off the machine as described elsewhere.
    */
  var stderr: js.UndefOr[String] = js.native
}

object SchemaContainerStoppedEvent {
  @scala.inline
  def apply(): SchemaContainerStoppedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerStoppedEvent]
  }
  @scala.inline
  implicit class SchemaContainerStoppedEventOps[Self <: SchemaContainerStoppedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExitStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
  }
  
}

