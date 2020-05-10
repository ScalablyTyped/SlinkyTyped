package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeGetJsonOptions extends js.Object {
  /**
    * return flat JSON instead of nested
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * do not include A attributes
    */
  var no_a_attr: js.UndefOr[Boolean] = js.native
  /**
    * do not include children
    */
  var no_children: js.UndefOr[Boolean] = js.native
  /**
    * do not include node data
    */
  var no_data: js.UndefOr[Boolean] = js.native
  /**
    * do not return ID
    */
  var no_id: js.UndefOr[Boolean] = js.native
  /**
    * do not include LI attributes
    */
  var no_li_attr: js.UndefOr[Boolean] = js.native
  /**
    * do not return state information
    */
  var no_state: js.UndefOr[Boolean] = js.native
}

object JSTreeGetJsonOptions {
  @scala.inline
  def apply(): JSTreeGetJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeGetJsonOptions]
  }
  @scala.inline
  implicit class JSTreeGetJsonOptionsOps[Self <: JSTreeGetJsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_a_attr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_a_attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_a_attr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_a_attr")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_children(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_children: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_children")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_data(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_id(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_id")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_li_attr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_li_attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_li_attr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_li_attr")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_state(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_state")(js.undefined)
        ret
    }
  }
  
}

