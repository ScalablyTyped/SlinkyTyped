package typingsSlinky.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaPhantomJS_ extends js.Object {
  var columns: Double = js.native
  var mochaStartWait: Double = js.native
  var output: js.Any = js.native
  var startTime: js.Date = js.native
  var url: String = js.native
  def customizeMocha(options: MochaPhantomJSOptions): Unit = js.native
  def run(): Unit = js.native
}

object MochaPhantomJS_ {
  @scala.inline
  def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Unit,
    mochaStartWait: Double,
    output: js.Any,
    run: () => Unit,
    startTime: js.Date,
    url: String
  ): MochaPhantomJS_ = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJS_]
  }
  @scala.inline
  implicit class MochaPhantomJS_Ops[Self <: MochaPhantomJS_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomizeMocha(value: MochaPhantomJSOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeMocha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMochaStartWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mochaStartWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

