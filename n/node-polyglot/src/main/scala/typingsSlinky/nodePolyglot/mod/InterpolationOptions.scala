package typingsSlinky.nodePolyglot.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePolyglot.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationOptions
  extends /* interpolationKey */ StringDictionary[js.Any] {
  @JSName("_")
  var _underscore: js.UndefOr[String] = js.native
  var smart_count: js.UndefOr[Double | Length] = js.native
}

object InterpolationOptions {
  @scala.inline
  def apply(): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationOptions]
  }
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_underscore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_underscore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(js.undefined)
        ret
    }
    @scala.inline
    def withSmart_count(value: Double | Length): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmart_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart_count")(js.undefined)
        ret
    }
  }
  
}

