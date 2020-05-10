package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProperties extends js.Object {
  var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.native
}

object ListProperties {
  @scala.inline
  def apply(): ListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProperties]
  }
  @scala.inline
  implicit class ListPropertiesOps[Self <: ListProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNestingLevels(value: js.Array[NestingLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevels")(js.undefined)
        ret
    }
  }
  
}

