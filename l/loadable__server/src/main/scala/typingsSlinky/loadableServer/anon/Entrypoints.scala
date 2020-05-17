package typingsSlinky.loadableServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entrypoints extends js.Object {
  /**
  	 * Webpack entrypoints to load (default to `["main"]`)
  	 */
  var entrypoints: js.UndefOr[String | js.Array[String]] = js.native
  /**
  	 * File system used to read files (default to fs)
  	 */
  var inputFileSystem: js.UndefOr[js.Object] = js.native
  /**
  	 * Optional namespace in case of multiple apps on same page
  	 */
  var namespace: js.UndefOr[String] = js.native
  /**
  	 * Optional output path (only for `requireEntrypoint`)
  	 */
  var outputPath: js.UndefOr[String] = js.native
  /**
  	 * Optional public path to override stats.publicPath at runtime
  	 */
  var publicPath: js.UndefOr[String] = js.native
}

object Entrypoints {
  @scala.inline
  def apply(): Entrypoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entrypoints]
  }
  @scala.inline
  implicit class EntrypointsOps[Self <: Entrypoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntrypoints(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFileSystem(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
  }
  
}

