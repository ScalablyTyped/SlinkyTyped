package typingsSlinky.rxJquery

import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def ajaxAsObservable[T](settings: JQueryAjaxSettings): Observable[RxJQueryAjaxResult[T]] = js.native
  def getAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]] = js.native
  def getJSONAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]] = js.native
  def getScriptAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]] = js.native
  def postAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(
    ajaxAsObservable: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[js.Any]],
    getAsObservable: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]],
    getJSONAsObservable: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]],
    getScriptAsObservable: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]],
    postAsObservable: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(ajaxAsObservable = js.Any.fromFunction1(ajaxAsObservable), getAsObservable = js.Any.fromFunction3(getAsObservable), getJSONAsObservable = js.Any.fromFunction2(getJSONAsObservable), getScriptAsObservable = js.Any.fromFunction2(getScriptAsObservable), postAsObservable = js.Any.fromFunction3(postAsObservable))
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxAsObservable(value: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxAsObservable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsObservable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetJSONAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJSONAsObservable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetScriptAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptAsObservable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPostAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postAsObservable")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

