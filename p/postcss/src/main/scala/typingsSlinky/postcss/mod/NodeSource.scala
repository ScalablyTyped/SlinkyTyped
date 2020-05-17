package typingsSlinky.postcss.mod

import typingsSlinky.postcss.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSource extends js.Object {
  /**
    * The ending position of the node's source.
    */
  var end: js.UndefOr[Column] = js.native
  var input: Input = js.native
  /**
    * The starting position of the node's source.
    */
  var start: js.UndefOr[Column] = js.native
}

object NodeSource {
  @scala.inline
  def apply(input: Input): NodeSource = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSource]
  }
  @scala.inline
  implicit class NodeSourceOps[Self <: NodeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: Input): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

