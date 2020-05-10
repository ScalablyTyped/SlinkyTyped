package typingsSlinky.ckeditorCkeditor5Engine

import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreElementEnd extends js.Object {
  var ignoreElementEnd: Boolean = js.native
  var shallow: Boolean = js.native
  var singleCharacters: Boolean = js.native
  var startPosition: Position = js.native
}

object AnonIgnoreElementEnd {
  @scala.inline
  def apply(ignoreElementEnd: Boolean, shallow: Boolean, singleCharacters: Boolean, startPosition: Position): AnonIgnoreElementEnd = {
    val __obj = js.Dynamic.literal(ignoreElementEnd = ignoreElementEnd.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], singleCharacters = singleCharacters.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreElementEnd]
  }
  @scala.inline
  implicit class AnonIgnoreElementEndOps[Self <: AnonIgnoreElementEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreElementEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreElementEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

