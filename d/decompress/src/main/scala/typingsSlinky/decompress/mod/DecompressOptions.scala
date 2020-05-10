package typingsSlinky.decompress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecompressOptions extends js.Object {
  /**
    * Filter out files before extracting
    */
  var filter: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.native
  /**
    * Map files before extracting
    */
  var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.native
  /**
    * Array of plugins to use.
    * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * Remove leading directory components from extracted files.
    * Default: 0
    */
  var strip: js.UndefOr[Double] = js.native
}

object DecompressOptions {
  @scala.inline
  def apply(): DecompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecompressOptions]
  }
  @scala.inline
  implicit class DecompressOptionsOps[Self <: DecompressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* file */ File => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* file */ File => File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withStrip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
  }
  
}

