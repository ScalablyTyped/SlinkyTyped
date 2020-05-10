package typingsSlinky.brotliWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The target asset name. Defaults to `'[path].br[query]'`.
    *
    * - `[file]` is replaced with the original asset file name.
    * - `[fileWithoutExt]` is replaced with the file name minus its extension, e.g. the `style` of `style.css`.
    * - `[ext]` is replaced with the file name extension, e.g. the `css` of `style.css`.
    * - `[path]` is replaced with the path of the original asset.
    * - `[query]` is replaced with the query.
    */
  var asset: js.UndefOr[String] = js.native
  /**
    * Remove original files that were compressed with brotli. Default: `false`.
    */
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.native
  /**
    * Only assets that compress better that this ratio are processed. Defaults to `0.8`.
    */
  var minRatio: js.UndefOr[Double] = js.native
  /**
    * All assets matching this RegExp are processed. Defaults to every asset.
    */
  var test: js.UndefOr[js.RegExp] = js.native
  /**
    * Only assets bigger than this size (in bytes) are processed. Defaults to `0`.
    */
  var threshold: js.UndefOr[Double] = js.native
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
    def withAsset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOriginalAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOriginalAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOriginalAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOriginalAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

