package typingsSlinky.rgroveParseXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var ignoreUndefinedEntities: js.UndefOr[Boolean] = js.native
  var preserveCdata: js.UndefOr[Boolean] = js.native
  var preserveComments: js.UndefOr[Boolean] = js.native
  var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ String, String]] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreUndefinedEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefinedEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefinedEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefinedEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveCdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveCdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveCdata")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveUndefinedEntity(value: /* ref */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveUndefinedEntity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveUndefinedEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveUndefinedEntity")(js.undefined)
        ret
    }
  }
  
}

