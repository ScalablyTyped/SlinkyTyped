package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a NamedRange referencing the given range.
  */
@js.native
trait SchemaCreateNamedRangeRequest extends js.Object {
  /**
    * The name of the NamedRange. Names do not need to be unique.  Names must
    * be at least 1 character and no more than 256 characters, measured in
    * UTF-16 code units.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The range to apply the name to.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}

object SchemaCreateNamedRangeRequest {
  @scala.inline
  def apply(): SchemaCreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNamedRangeRequest]
  }
  @scala.inline
  implicit class SchemaCreateNamedRangeRequestOps[Self <: SchemaCreateNamedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: SchemaRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

