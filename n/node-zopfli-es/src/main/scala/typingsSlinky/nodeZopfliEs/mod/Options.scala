package typingsSlinky.nodeZopfliEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
    * Block splitting gives better compression.
    */
  var blocksplitting: js.UndefOr[Boolean] = js.native
  /**
    * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
    * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
    * Depending on the file, either first or last gives the best compression.
    */
  var blocksplittinglast: js.UndefOr[Boolean] = js.native
  /**
    * Maximum amount of blocks to split into (0 for unlimited,
    * but this can give extreme results that hurt compression on some files).
    */
  var blocksplittingmax: js.UndefOr[Double] = js.native
  /**
    * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
    * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
    */
  var numiterations: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var verbose_more: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocksplitting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocksplitting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplitting")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocksplittinglast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplittinglast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocksplittinglast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplittinglast")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocksplittingmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplittingmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocksplittingmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksplittingmax")(js.undefined)
        ret
    }
    @scala.inline
    def withNumiterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numiterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumiterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numiterations")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose_more: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose_more")(js.undefined)
        ret
    }
  }
  
}

