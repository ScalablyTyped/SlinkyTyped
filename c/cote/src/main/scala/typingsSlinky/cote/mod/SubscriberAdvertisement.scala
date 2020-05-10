package typingsSlinky.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriberAdvertisement extends Advertisement {
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.native
}

object SubscriberAdvertisement {
  @scala.inline
  def apply(name: String): SubscriberAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdvertisement]
  }
  @scala.inline
  implicit class SubscriberAdvertisementOps[Self <: SubscriberAdvertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribesTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribesTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribesTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribesTo")(js.undefined)
        ret
    }
  }
  
}

