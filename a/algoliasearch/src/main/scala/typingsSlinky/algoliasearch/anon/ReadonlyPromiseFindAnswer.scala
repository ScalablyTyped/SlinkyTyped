package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.FindAnswersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>> */
@js.native
trait ReadonlyPromiseFindAnswer extends js.Object {
  
  def `catch`[TResult](): js.Promise[FindAnswersResponse[js.Object] | TResult] = js.native
  
  def `finally`(): js.Promise[FindAnswersResponse[js.Object]] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseFindAnswer {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[FindAnswersResponse[js.Object] | js.Any],
    `finally`: () => js.Promise[FindAnswersResponse[js.Object]],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseFindAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseFindAnswer]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseFindAnswerOps[Self <: ReadonlyPromiseFindAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatch(value: () => js.Promise[FindAnswersResponse[js.Object] | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[FindAnswersResponse[js.Object]]): Self = this.set("finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
}
