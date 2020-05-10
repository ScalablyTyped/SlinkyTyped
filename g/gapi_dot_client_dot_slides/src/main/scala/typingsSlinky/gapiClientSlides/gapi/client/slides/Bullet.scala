package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bullet extends js.Object {
  /** The paragraph specific text style applied to this bullet. */
  var bulletStyle: js.UndefOr[TextStyle] = js.native
  /** The rendered bullet glyph for this paragraph. */
  var glyph: js.UndefOr[String] = js.native
  /** The ID of the list this paragraph belongs to. */
  var listId: js.UndefOr[String] = js.native
  /** The nesting level of this paragraph in the list. */
  var nestingLevel: js.UndefOr[Double] = js.native
}

object Bullet {
  @scala.inline
  def apply(): Bullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bullet]
  }
  @scala.inline
  implicit class BulletOps[Self <: Bullet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(js.undefined)
        ret
    }
  }
  
}

