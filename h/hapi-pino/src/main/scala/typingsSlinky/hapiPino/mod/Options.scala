package typingsSlinky.hapiPino.mod

import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiPino.anon.Dictkey
import typingsSlinky.hapiPino.anon.keyinLevelstring
import typingsSlinky.hapiPino.hapiPinoBooleans.`false`
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import typingsSlinky.pino.mod.Level
import typingsSlinky.pino.mod.Logger
import typingsSlinky.pino.mod.PrettyOptions
import typingsSlinky.pino.mod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allTags: js.UndefOr[Level] = js.native
  var getChildBindings: js.UndefOr[js.Function1[/* req */ Request, Dictkey]] = js.native
  var ignorePaths: js.UndefOr[js.Array[String]] = js.native
  var instance: js.UndefOr[Logger] = js.native
  var level: js.UndefOr[Level] = js.native
  var logEvents: js.UndefOr[js.Array[String] | `false` | Null] = js.native
  var logPayload: js.UndefOr[Boolean] = js.native
  var logRequestComplete: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.native
  var logRequestStart: js.UndefOr[Boolean | (js.Function1[/* req */ Request, Boolean])] = js.native
  var logRouteTags: js.UndefOr[Boolean] = js.native
  var mergeHapiLogData: js.UndefOr[Boolean] = js.native
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.native
  var serializers: js.UndefOr[Serializers] = js.native
  var stream: js.UndefOr[WriteStream] = js.native
  var tags: js.UndefOr[keyinLevelstring] = js.native
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
    def withAllTags(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTags")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildBindings(value: /* req */ Request => Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildBindings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLogEvents(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withLogEventsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEvents")(null)
        ret
    }
    @scala.inline
    def withLogPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withLogRequestCompleteFunction1(value: /* req */ Request => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogRequestComplete(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogRequestComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withLogRequestStartFunction1(value: /* req */ Request => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogRequestStart(value: Boolean | (js.Function1[/* req */ Request, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogRequestStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRequestStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLogRouteTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRouteTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogRouteTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRouteTags")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeHapiLogData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeHapiLogData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeHapiLogData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeHapiLogData")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean | PrettyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withRedact(value: js.Array[String] | redactOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redact")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializers(value: Serializers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WriteStream): Self = {
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
    @scala.inline
    def withTags(value: keyinLevelstring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

