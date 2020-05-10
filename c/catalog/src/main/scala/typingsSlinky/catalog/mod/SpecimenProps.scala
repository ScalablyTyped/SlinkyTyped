package typingsSlinky.catalog.mod

import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecimenProps extends js.Object {
  var rawBody: js.UndefOr[String] = js.native
  var rawOptions: js.UndefOr[String] = js.native
  var span: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object SpecimenProps {
  @scala.inline
  def apply(): SpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenProps]
  }
  @scala.inline
  implicit class SpecimenPropsOps[Self <: SpecimenProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRawOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
  }
  
}

