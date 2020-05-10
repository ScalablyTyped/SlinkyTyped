package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
@js.native
trait HyperlinkLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.native
}

object HyperlinkLoadOptions {
  @scala.inline
  def apply(): HyperlinkLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkLoadOptions]
  }
  @scala.inline
  implicit class HyperlinkLoadOptionsOps[Self <: HyperlinkLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Boolean): Self = {
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
    def withExtraInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAddress")(js.undefined)
        ret
    }
  }
  
}

