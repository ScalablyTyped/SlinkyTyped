package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for objects implementing different element styles.
  */
@js.native
trait StyleBase extends js.Object {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  val isDeleted: Boolean = js.native
  /**
    * Gets or sets the name of the style.
    */
  val name: String = js.native
}

object StyleBase {
  @scala.inline
  def apply(isDeleted: Boolean, name: String): StyleBase = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleBase]
  }
  @scala.inline
  implicit class StyleBaseOps[Self <: StyleBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

