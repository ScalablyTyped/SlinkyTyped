package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.jsonldStrings.`@always`
import typingsSlinky.jsonld.jsonldStrings.`@last`
import typingsSlinky.jsonld.jsonldStrings.`@link`
import typingsSlinky.jsonld.jsonldStrings.`@never`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var embed: js.UndefOr[`@last` | `@always` | `@never` | `@link`] = js.native
  var explicit: js.UndefOr[Boolean] = js.native
  var omitDefault: js.UndefOr[Boolean] = js.native
  var requireAll: js.UndefOr[Boolean] = js.native
}

object Frame {
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbed(value: `@last` | `@always` | `@never` | `@link`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAll")(js.undefined)
        ret
    }
  }
  
}

