package typingsSlinky.ckeditorCkeditor5Engine.anon

import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shallow extends js.Object {
  var boundaries: js.UndefOr[Range] = js.native
  var direction: js.UndefOr[TreeWalkerDirection] = js.native
  var ignoreElementEnd: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Boolean] = js.native
  var singleCharacters: js.UndefOr[Boolean] = js.native
  var startPosition: js.UndefOr[Position] = js.native
}

object Shallow {
  @scala.inline
  def apply(): Shallow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shallow]
  }
  @scala.inline
  implicit class ShallowOps[Self <: Shallow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDirection(value: TreeWalkerDirection): Self = {
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
    @scala.inline
    def withStartPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
  }
  
}

