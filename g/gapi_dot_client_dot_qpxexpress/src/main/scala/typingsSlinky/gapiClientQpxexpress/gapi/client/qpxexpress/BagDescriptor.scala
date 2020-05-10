package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BagDescriptor extends js.Object {
  /** Provides the commercial name for an optional service. */
  var commercialName: js.UndefOr[String] = js.native
  /** How many of this type of bag will be checked on this flight. */
  var count: js.UndefOr[Double] = js.native
  /** A description of the baggage. */
  var description: js.UndefOr[js.Array[String]] = js.native
  /** Identifies this as a baggage object. Value: the fixed string qpxexpress#bagDescriptor. */
  var kind: js.UndefOr[String] = js.native
  /** The standard IATA subcode used to identify this optional service. */
  var subcode: js.UndefOr[String] = js.native
}

object BagDescriptor {
  @scala.inline
  def apply(): BagDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BagDescriptor]
  }
  @scala.inline
  implicit class BagDescriptorOps[Self <: BagDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommercialName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercialName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommercialName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercialName")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSubcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subcode")(js.undefined)
        ret
    }
  }
  
}

