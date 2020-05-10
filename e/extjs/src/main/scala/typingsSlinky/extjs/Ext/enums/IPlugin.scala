package typingsSlinky.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin extends js.Object {
  /** [Property] (String) */
  var bufferedrenderer: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var cellediting: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var gridheaderresizer: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var gridviewdragdrop: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var rowediting: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var rowexpander: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var treeviewdragdrop: js.UndefOr[String] = js.native
}

object IPlugin {
  @scala.inline
  def apply(): IPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlugin]
  }
  @scala.inline
  implicit class IPluginOps[Self <: IPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferedrenderer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferedrenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferedrenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferedrenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellediting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellediting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellediting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellediting")(js.undefined)
        ret
    }
    @scala.inline
    def withGridheaderresizer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridheaderresizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridheaderresizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridheaderresizer")(js.undefined)
        ret
    }
    @scala.inline
    def withGridviewdragdrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridviewdragdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridviewdragdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridviewdragdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withRowediting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowediting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowediting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowediting")(js.undefined)
        ret
    }
    @scala.inline
    def withRowexpander(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowexpander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowexpander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowexpander")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeviewdragdrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeviewdragdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeviewdragdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeviewdragdrop")(js.undefined)
        ret
    }
  }
  
}

