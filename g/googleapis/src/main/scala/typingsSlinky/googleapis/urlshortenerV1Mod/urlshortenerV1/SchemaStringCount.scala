package typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStringCount extends js.Object {
  /**
    * Number of clicks for this top entry, e.g. for this particular country or
    * browser.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Label assigned to this top entry, e.g. &quot;US&quot; or
    * &quot;Chrome&quot;.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaStringCount {
  @scala.inline
  def apply(): SchemaStringCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringCount]
  }
  @scala.inline
  implicit class SchemaStringCountOps[Self <: SchemaStringCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

