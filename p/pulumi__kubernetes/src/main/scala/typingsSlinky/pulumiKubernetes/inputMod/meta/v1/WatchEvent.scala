package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event represents a single event to a watched resource.
  */
@js.native
trait WatchEvent extends js.Object {
  /**
    * Object is:
    *  * If Type is Added or Modified: the new state of the object.
    *  * If Type is Deleted: the state of the object immediately before deletion.
    *  * If Type is Error: *Status is recommended; other types may make sense
    *    depending on context.
    */
  var `object`: Input[js.Object] = js.native
  var `type`: Input[String] = js.native
}

object WatchEvent {
  @scala.inline
  def apply(`object`: Input[js.Object], `type`: Input[String]): WatchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchEvent]
  }
  @scala.inline
  implicit class WatchEventOps[Self <: WatchEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

