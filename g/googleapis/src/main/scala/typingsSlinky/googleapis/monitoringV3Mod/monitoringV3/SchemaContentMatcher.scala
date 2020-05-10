package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to perform string matching. It allows substring and regular
  * expressions, together with their negations.
  */
@js.native
trait SchemaContentMatcher extends js.Object {
  /**
    * String or regex content to match (max 1024 bytes)
    */
  var content: js.UndefOr[String] = js.native
}

object SchemaContentMatcher {
  @scala.inline
  def apply(): SchemaContentMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentMatcher]
  }
  @scala.inline
  implicit class SchemaContentMatcherOps[Self <: SchemaContentMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

