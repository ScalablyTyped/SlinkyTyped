package typingsSlinky.reactInstantsearchDom

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFindResultsState extends js.Object {
  var InstantSearch: ReactComponentClass[_]
  def findResultsState(App: ReactComponentClass[_], props: js.Any): js.Promise[_]
}

object AnonFindResultsState {
  @scala.inline
  def apply(
    InstantSearch: ReactComponentClass[_],
    findResultsState: (ReactComponentClass[_], js.Any) => js.Promise[_]
  ): AnonFindResultsState = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch.asInstanceOf[js.Any], findResultsState = js.Any.fromFunction2(findResultsState))
  
    __obj.asInstanceOf[AnonFindResultsState]
  }
}

