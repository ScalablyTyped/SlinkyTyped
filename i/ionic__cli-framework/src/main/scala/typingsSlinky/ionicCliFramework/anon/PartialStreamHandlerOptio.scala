package typingsSlinky.ionicCliFramework.anon

import typingsSlinky.ionicCliFramework.loggerMod.LogRecord
import typingsSlinky.ionicCliFramework.loggerMod.LoggerFormatter
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.StreamHandlerOptions> */
@js.native
trait PartialStreamHandlerOptio extends js.Object {
  var filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  var formatter: js.UndefOr[LoggerFormatter] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
}

object PartialStreamHandlerOptio {
  @scala.inline
  def apply(): PartialStreamHandlerOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStreamHandlerOptio]
  }
  @scala.inline
  implicit class PartialStreamHandlerOptioOps[Self <: PartialStreamHandlerOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* record */ LogRecord => Boolean): Self = {
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
    def withFormatter(value: /* record */ LogRecord => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

