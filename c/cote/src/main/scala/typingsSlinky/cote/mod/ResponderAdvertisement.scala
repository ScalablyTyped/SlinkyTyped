package typingsSlinky.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponderAdvertisement extends Advertisement {
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}

object ResponderAdvertisement {
  @scala.inline
  def apply(name: String): ResponderAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponderAdvertisement]
  }
  @scala.inline
  implicit class ResponderAdvertisementOps[Self <: ResponderAdvertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRespondsTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespondsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(js.undefined)
        ret
    }
  }
  
}

