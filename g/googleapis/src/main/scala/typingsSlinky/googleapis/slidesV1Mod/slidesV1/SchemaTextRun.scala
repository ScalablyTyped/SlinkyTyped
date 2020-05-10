package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents a run of text that all has the same
  * styling.
  */
@js.native
trait SchemaTextRun extends js.Object {
  /**
    * The text of this run.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this run.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaTextRun {
  @scala.inline
  def apply(): SchemaTextRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextRun]
  }
  @scala.inline
  implicit class SchemaTextRunOps[Self <: SchemaTextRun] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStyle(value: SchemaTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

