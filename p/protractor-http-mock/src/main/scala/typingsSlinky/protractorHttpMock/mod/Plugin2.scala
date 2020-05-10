package typingsSlinky.protractorHttpMock.mod

import typingsSlinky.protractorHttpMock.mod.requests.PostData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin for custom matching logic with 2 generic types.
  */
@js.native
trait Plugin2[T1, T2] extends js.Object {
  /**
    * Match function.
    * Return a truthy value to indicate successfull match.
    *
    * @param mockRequest The mock to compare request with.
    * @param requestConfig The request object to compare mock with.
    */
  def `match`[O /* <: PostData[T1, T2] */](mockRequest: O, requestConfig: O): Boolean = js.native
}

object Plugin2 {
  @scala.inline
  def apply[T1, T2](`match`: (js.Any, js.Any) => Boolean): Plugin2[T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin2[T1, T2]]
  }
  @scala.inline
  implicit class Plugin2Ops[Self[t1, t2] <: Plugin2[t1, t2], T1, T2] (val x: Self[T1, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2]) with Other]
    @scala.inline
    def withMatch(value: (js.Any, js.Any) => Boolean): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

