package typingsSlinky.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cote.mod.Advertisement because Already inherited
- typingsSlinky.cote.mod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo
- typingsSlinky.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts
- typingsSlinky.cote.mod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ @js.native
trait StatusAdvertisement extends RequesterAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}

object StatusAdvertisement {
  @scala.inline
  def apply(name: String): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusAdvertisement]
  }
  @scala.inline
  implicit class StatusAdvertisementOps[Self <: StatusAdvertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcasts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcasts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcasts")(js.undefined)
        ret
    }
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

