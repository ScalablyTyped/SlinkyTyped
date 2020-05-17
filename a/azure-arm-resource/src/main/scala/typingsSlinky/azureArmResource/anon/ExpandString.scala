package typingsSlinky.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandString extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var expand: js.UndefOr[String] = js.native
}

object ExpandString {
  @scala.inline
  def apply(): ExpandString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandString]
  }
  @scala.inline
  implicit class ExpandStringOps[Self <: ExpandString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
  }
  
}

