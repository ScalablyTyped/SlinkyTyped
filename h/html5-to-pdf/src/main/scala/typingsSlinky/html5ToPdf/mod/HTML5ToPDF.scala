package typingsSlinky.html5ToPdf.mod

import typingsSlinky.node.Buffer
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTML5ToPDF extends js.Object {
  def build(): js.Promise[Buffer] = js.native
  def close(): js.Promise[Unit] = js.native
  def includeAssets(): js.Promise[Unit] = js.native
  def parseOptions(options: Options): ParsedOptions = js.native
  def start(): js.Promise[Page] = js.native
}

object HTML5ToPDF {
  @scala.inline
  def apply(
    build: () => js.Promise[Buffer],
    close: () => js.Promise[Unit],
    includeAssets: () => js.Promise[Unit],
    parseOptions: Options => ParsedOptions,
    start: () => js.Promise[Page]
  ): HTML5ToPDF = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), close = js.Any.fromFunction0(close), includeAssets = js.Any.fromFunction0(includeAssets), parseOptions = js.Any.fromFunction1(parseOptions), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[HTML5ToPDF]
  }
  @scala.inline
  implicit class HTML5ToPDFOps[Self <: HTML5ToPDF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => js.Promise[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncludeAssets(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAssets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParseOptions(value: Options => ParsedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => js.Promise[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

