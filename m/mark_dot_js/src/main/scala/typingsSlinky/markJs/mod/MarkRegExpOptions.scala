package typingsSlinky.markJs.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkRegExpOptions extends js.Object {
  var acrossElements: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
  var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  var element: js.UndefOr[String] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ Element, 
      /* term */ String, 
      /* marksSoFar */ Double, 
      /* marksTotal */ Double, 
      Boolean
    ]
  ] = js.native
  var iframes: js.UndefOr[Boolean] = js.native
  var iframesTimeout: js.UndefOr[Double] = js.native
  var ignoreGroups: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Object] = js.native
  var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.native
}

object MarkRegExpOptions {
  @scala.inline
  def apply(): MarkRegExpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkRegExpOptions]
  }
  @scala.inline
  implicit class MarkRegExpOptionsOps[Self <: MarkRegExpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcrossElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcrossElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossElements")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: /* marksTotal */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: /* element */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIframes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(js.undefined)
        ret
    }
    @scala.inline
    def withIframesTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframesTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframesTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframesTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreGroups(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMatch(value: /* term */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(js.undefined)
        ret
    }
  }
  
}

