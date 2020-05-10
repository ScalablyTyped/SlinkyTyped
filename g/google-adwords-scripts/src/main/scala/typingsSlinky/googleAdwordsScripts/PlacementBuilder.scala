package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementBuilder[Placement] extends DisplayBuilder[PlacementBuilder[Placement]] {
  def withUrl(url: String): PlacementBuilder[Placement] = js.native
}

object PlacementBuilder {
  @scala.inline
  def apply[Placement](
    build: () => AdWordsOperation[PlacementBuilder[Placement]],
    exclude: () => AdWordsOperation[PlacementBuilder[Placement]],
    withCpc: Double => PlacementBuilder[Placement],
    withCpm: Double => PlacementBuilder[Placement],
    withUrl: String => PlacementBuilder[Placement]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
  @scala.inline
  implicit class PlacementBuilderOps[Self[placement] <: PlacementBuilder[placement], Placement] (val x: Self[Placement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Placement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Placement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Placement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Placement] with Other]
    @scala.inline
    def withWithUrl(value: String => PlacementBuilder[Placement]): Self[Placement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

