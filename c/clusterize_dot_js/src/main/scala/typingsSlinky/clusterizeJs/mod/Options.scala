package typingsSlinky.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var blocks_in_cluster: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[Callbacks] = js.native
  var contentId: String = js.native
  var keep_parity: js.UndefOr[Boolean] = js.native
  var no_data_class: js.UndefOr[String] = js.native
  var no_data_text: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[String]] = js.native
  var rows_in_block: js.UndefOr[Double] = js.native
  var scrollId: String = js.native
  var show_no_data_row: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(contentId: String, scrollId: String): Options = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocks_in_cluster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks_in_cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks_in_cluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks_in_cluster")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: Callbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_parity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_parity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_parity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_parity")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_data_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_data_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data_class")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_data_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_data_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_data_text")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRows_in_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows_in_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows_in_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows_in_block")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_no_data_row(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_no_data_row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_no_data_row: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_no_data_row")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

