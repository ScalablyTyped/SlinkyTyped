package typingsSlinky.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterRemoveEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String = js.native
  /**
    * An array of the object(s) that were removed. May be a single body, constraint, composite or a mixture of these.
    */
  var `object`: js.Array[_] = js.native
  /**
    * The source object of the event.
    */
  var source: js.Any = js.native
}

object AfterRemoveEvent {
  @scala.inline
  def apply(name: String, `object`: js.Array[_], source: js.Any): AfterRemoveEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterRemoveEvent]
  }
  @scala.inline
  implicit class AfterRemoveEventOps[Self <: AfterRemoveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

