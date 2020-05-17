package typingsSlinky.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skiptoken extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var skiptoken: js.UndefOr[String] = js.native
}

object Skiptoken {
  @scala.inline
  def apply(): Skiptoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skiptoken]
  }
  @scala.inline
  implicit class SkiptokenOps[Self <: Skiptoken] (val x: Self) extends AnyVal {
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
    def withSkiptoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skiptoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkiptoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skiptoken")(js.undefined)
        ret
    }
  }
  
}

