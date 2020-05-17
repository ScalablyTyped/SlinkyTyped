package typingsSlinky.ckeditorCkeditor5Engine.anon

import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boundaries extends js.Object {
  var boundaries: js.UndefOr[Range] = js.native
  var direction: js.UndefOr[forward | backward] = js.native
  var ignoreElementEnd: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Boolean] = js.native
  var singleCharacters: js.UndefOr[Boolean] = js.native
  var startPosition: Position = js.native
}

object Boundaries {
  @scala.inline
  def apply(startPosition: Position): Boundaries = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  @scala.inline
  implicit class BoundariesOps[Self <: Boundaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundaries(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: forward | backward): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreElementEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreElementEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreElementEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreElementEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShallow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleCharacters")(js.undefined)
        ret
    }
  }
  
}

