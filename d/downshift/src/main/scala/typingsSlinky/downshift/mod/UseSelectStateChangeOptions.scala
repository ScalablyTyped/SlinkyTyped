package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectStateChangeOptions[Item] extends js.Object {
  var changes: UseSelectState[Item] = js.native
  var props: UseSelectProps[Item] = js.native
  var `type`: UseSelectStateChangeTypes = js.native
}

object UseSelectStateChangeOptions {
  @scala.inline
  def apply[Item](changes: UseSelectState[Item], props: UseSelectProps[Item], `type`: UseSelectStateChangeTypes): UseSelectStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChangeOptions[Item]]
  }
  @scala.inline
  implicit class UseSelectStateChangeOptionsOps[Self[item] <: UseSelectStateChangeOptions[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withChanges(value: UseSelectState[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: UseSelectProps[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: UseSelectStateChangeTypes): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

