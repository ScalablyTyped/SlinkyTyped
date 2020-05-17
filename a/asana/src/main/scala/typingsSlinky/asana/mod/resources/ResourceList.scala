package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.anon.AsanaBaseUrl
import typingsSlinky.asana.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceList[T /* <: Resource */] extends js.Object {
  var _dispatcher: AsanaBaseUrl = js.native
  var _response: Data[T] = js.native
  var data: js.Array[T] = js.native
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): typingsSlinky.bluebird.mod.^[ResourceList[T] | Null] = js.native
}

object ResourceList {
  @scala.inline
  def apply[T](
    _dispatcher: AsanaBaseUrl,
    _response: Data[T],
    data: js.Array[T],
    nextPage: () => typingsSlinky.bluebird.mod.^[ResourceList[T] | Null]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[ResourceList[T]]
  }
  @scala.inline
  implicit class ResourceListOps[Self[t] <: ResourceList[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_dispatcher(value: AsanaBaseUrl): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_response(value: Data[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPage(value: () => typingsSlinky.bluebird.mod.^[ResourceList[T] | Null]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

