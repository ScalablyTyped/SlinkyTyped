package typingsSlinky.reactBootstrapTypeahead.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  /* 	Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.native
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean = js.native
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[TagMod[Any]] = js.native
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[TagMod[Any]] = js.native
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.native
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit = js.native
}

object AsyncTypeaheadProps {
  @scala.inline
  def apply[T](isLoading: Boolean, onSearch: String => Unit, options: js.Array[T]): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1(onSearch), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
  @scala.inline
  implicit class AsyncTypeaheadPropsOps[Self[t] <: AsyncTypeaheadProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsLoading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSearch(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptTextReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromptText(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptText")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTextReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchText(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCache(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCache: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(js.undefined)
        ret
    }
  }
  
}

