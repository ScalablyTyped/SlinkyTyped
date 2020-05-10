package typingsSlinky.concurrently.mod

import typingsSlinky.concurrently.concurrentlyStrings.command
import typingsSlinky.concurrently.concurrentlyStrings.failure
import typingsSlinky.concurrently.concurrentlyStrings.first
import typingsSlinky.concurrently.concurrentlyStrings.index
import typingsSlinky.concurrently.concurrentlyStrings.last
import typingsSlinky.concurrently.concurrentlyStrings.name
import typingsSlinky.concurrently.concurrentlyStrings.none
import typingsSlinky.concurrently.concurrentlyStrings.pid
import typingsSlinky.concurrently.concurrentlyStrings.success
import typingsSlinky.concurrently.concurrentlyStrings.time
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** the default input target when reading from `inputStream`. Default: `0`. */
  var defaultInputTarget: js.UndefOr[Double] = js.native
  /** a Readable stream to read the input from, eg `process.stdin` */
  var inputStream: js.UndefOr[ReadableStream] = js.native
  /** an array of exiting conditions that will cause a process to kill others. Can contain any of success or failure. */
  var killOthers: js.UndefOr[js.Array[success | failure]] = js.native
  /**
    * how many processes should run at once
    * @default 0
    */
  var maxProcesses: js.UndefOr[Double] = js.native
  /**  a Writable stream to write logs to. Default: `process.stdout` */
  var outputStream: js.UndefOr[WritableStream] = js.native
  /**
    * the prefix type to use when logging processes output.
    */
  var prefix: js.UndefOr[index | pid | time | command | name | none | String] = js.native
  /** how many characters to show when prefixing with `command`. Default: `10` */
  var prefixLength: js.UndefOr[Double] = js.native
  /** whether raw mode should be used, meaning strictly process output will be logged, without any prefixes, colouring or extra stuff. */
  var raw: js.UndefOr[Boolean] = js.native
  /** how many milliseconds to wait between process restarts. Default: 0 */
  var restartDelay: js.UndefOr[Double] = js.native
  /** how many attempts to restart a process that dies will be made. Default: `0` */
  var restartTries: js.UndefOr[Double] = js.native
  /** the condition to consider the run was successful. */
  var successCondition: js.UndefOr[first | last] = js.native
  /** a date-fns format to use when prefixing with time. Default: `yyyy-MM-dd HH:mm:ss.ZZZ` */
  var timestampFormat: js.UndefOr[String] = js.native
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
    def withDefaultInputTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInputTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStream(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStream")(js.undefined)
        ret
    }
    @scala.inline
    def withKillOthers(value: js.Array[success | failure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillOthers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killOthers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProcesses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProcesses")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: index | pid | time | command | name | none | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartTries")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCondition(value: first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(js.undefined)
        ret
    }
  }
  
}

