package typingsSlinky.jeeJsf.jsf.ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * space seperated list of client identifiers
    */
  var execute: js.UndefOr[String] = js.native
  /**
    * client behavior event name from the request parameter
    */
  @JSName("javax.faces.behavior.event")
  var javaxDotfacesDotbehaviorDotevent: js.UndefOr[js.Any] = js.native
  /**
    * function to callback for error
    * @param callback the callback function
    */
  var onerror: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.native
  /**
    * function to callback for event
    * @param callback the callback function
    */
  var onevent: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.native
  /**
    * object containing parameters to include in the request
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * space seperated list of client identifiers
    */
  var render: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaxDotfacesDotbehaviorDotevent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javax.faces.behavior.event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaxDotfacesDotbehaviorDotevent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javax.faces.behavior.event")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnevent(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onevent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnevent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onevent")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

