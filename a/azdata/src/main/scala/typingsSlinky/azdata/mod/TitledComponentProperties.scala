package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitledComponentProperties extends js.Object {
  /**
  		 * The title for the component. This title will show when hovered over
  		 */
  var title: js.UndefOr[String] = js.native
}

object TitledComponentProperties {
  @scala.inline
  def apply(): TitledComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitledComponentProperties]
  }
  @scala.inline
  implicit class TitledComponentPropertiesOps[Self <: TitledComponentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

