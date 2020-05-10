package typingsSlinky.phosphorDatagrid.sectionlistMod.SectionList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a section list.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The size of new sections added to the list.
    */
  var baseSize: Double = js.native
}

object IOptions {
  @scala.inline
  def apply(baseSize: Double): IOptions = {
    val __obj = js.Dynamic.literal(baseSize = baseSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

