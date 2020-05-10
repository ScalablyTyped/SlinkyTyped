package typingsSlinky.gulpUseref.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalStreams: js.UndefOr[js.Array[ReadWriteStream]] = js.native
  var base: js.UndefOr[String] = js.native
  var noAssets: js.UndefOr[Boolean] = js.native
  var noconcat: js.UndefOr[Boolean] = js.native
  var searchPath: js.UndefOr[String | js.Array[String]] = js.native
  var transformPath: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.native
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
    def withAdditionalStreams(value: js.Array[ReadWriteStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAssets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withNoconcat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noconcat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoconcat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noconcat")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPath(value: /* filePath */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.undefined)
        ret
    }
  }
  
}

