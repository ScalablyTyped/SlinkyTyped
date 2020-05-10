package typingsSlinky.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicaOptions extends js.Object {
  // max webworkers pool size. Default is autodetected CPU count, but not more than 4.
  var concurrency: js.UndefOr[Double] = js.native
  // list of features to use.
  // Default is [ 'js', 'wasm', 'ww' ]. Can be [ 'js', 'wasm', 'cib', 'ww' ] or [ 'all' ].
  // Note, resize via createImageBitmap() ('cib') disabled by default due problems with quality.
  var features: js.UndefOr[js.Array[String]] = js.native
  // cache timeout, ms. Webworkers create is not fast.
  // This option allow reuse webworkers effectively. Default 2000.
  var idle: js.UndefOr[Double] = js.native
  // tile width/height.
  // Images are processed by regions, to restrict peak memory use. Default 1024.
  var tile: js.UndefOr[Double] = js.native
}

object PicaOptions {
  @scala.inline
  def apply(): PicaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicaOptions]
  }
  @scala.inline
  implicit class PicaOptionsOps[Self <: PicaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
  }
  
}

