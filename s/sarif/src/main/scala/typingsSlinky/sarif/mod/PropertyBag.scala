package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBag
  extends /**
  * Additional Properties
  */
/* key */ StringDictionary[js.Any] {
  /**
    * A set of distinct strings that provide additional information.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object PropertyBag {
  @scala.inline
  def apply(): PropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBag]
  }
  @scala.inline
  implicit class PropertyBagOps[Self <: PropertyBag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

