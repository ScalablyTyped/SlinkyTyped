package typingsSlinky.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.axios.mod.AxiosAdapter
import typingsSlinky.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAdapter extends js.Object {
  var history: StringDictionary[js.Array[AxiosRequestConfig]] = js.native
  @JSName("onAny")
  var onAny_Original: RequestMatcherFunc = js.native
  @JSName("onDelete")
  var onDelete_Original: RequestMatcherFunc = js.native
  @JSName("onGet")
  var onGet_Original: RequestMatcherFunc = js.native
  @JSName("onHead")
  var onHead_Original: RequestMatcherFunc = js.native
  @JSName("onList")
  var onList_Original: RequestMatcherFunc = js.native
  @JSName("onOptions")
  var onOptions_Original: RequestMatcherFunc = js.native
  @JSName("onPatch")
  var onPatch_Original: RequestMatcherFunc = js.native
  @JSName("onPost")
  var onPost_Original: RequestMatcherFunc = js.native
  @JSName("onPut")
  var onPut_Original: RequestMatcherFunc = js.native
  def adapter(): AxiosAdapter = js.native
  def onAny(): RequestHandler = js.native
  def onAny(matcher: String): RequestHandler = js.native
  def onAny(matcher: String, body: String): RequestHandler = js.native
  def onAny(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: js.RegExp): RequestHandler = js.native
  def onAny(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onAny(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(): RequestHandler = js.native
  def onDelete(matcher: String): RequestHandler = js.native
  def onDelete(matcher: String, body: String): RequestHandler = js.native
  def onDelete(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: js.RegExp): RequestHandler = js.native
  def onDelete(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onDelete(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(): RequestHandler = js.native
  def onGet(matcher: String): RequestHandler = js.native
  def onGet(matcher: String, body: String): RequestHandler = js.native
  def onGet(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: js.RegExp): RequestHandler = js.native
  def onGet(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onGet(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(): RequestHandler = js.native
  def onHead(matcher: String): RequestHandler = js.native
  def onHead(matcher: String, body: String): RequestHandler = js.native
  def onHead(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: js.RegExp): RequestHandler = js.native
  def onHead(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onHead(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(): RequestHandler = js.native
  def onList(matcher: String): RequestHandler = js.native
  def onList(matcher: String, body: String): RequestHandler = js.native
  def onList(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: js.RegExp): RequestHandler = js.native
  def onList(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onList(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onOptions(): RequestHandler = js.native
  def onOptions(matcher: String): RequestHandler = js.native
  def onOptions(matcher: String, body: String): RequestHandler = js.native
  def onOptions(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onOptions(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: js.RegExp): RequestHandler = js.native
  def onOptions(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onOptions(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onOptions(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(): RequestHandler = js.native
  def onPatch(matcher: String): RequestHandler = js.native
  def onPatch(matcher: String, body: String): RequestHandler = js.native
  def onPatch(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: js.RegExp): RequestHandler = js.native
  def onPatch(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onPatch(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(): RequestHandler = js.native
  def onPost(matcher: String): RequestHandler = js.native
  def onPost(matcher: String, body: String): RequestHandler = js.native
  def onPost(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: js.RegExp): RequestHandler = js.native
  def onPost(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onPost(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(): RequestHandler = js.native
  def onPut(matcher: String): RequestHandler = js.native
  def onPut(matcher: String, body: String): RequestHandler = js.native
  def onPut(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: js.RegExp): RequestHandler = js.native
  def onPut(matcher: js.RegExp, body: String): RequestHandler = js.native
  def onPut(matcher: js.RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: js.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: js.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def reset(): Unit = js.native
  def resetHandlers(): Unit = js.native
  def resetHistory(): Unit = js.native
  def restore(): Unit = js.native
}

