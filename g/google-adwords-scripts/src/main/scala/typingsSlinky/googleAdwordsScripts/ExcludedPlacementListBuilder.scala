package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedPlacementListBuilder[ExcludedPlacementList] extends AdWordsBuilder[ExcludedPlacementList] {
  def withName(name: String): ExcludedPlacementListBuilder[ExcludedPlacementList] = js.native
}

object ExcludedPlacementListBuilder {
  @scala.inline
  def apply[ExcludedPlacementList](
    build: () => AdWordsOperation[ExcludedPlacementList],
    withName: String => ExcludedPlacementListBuilder[ExcludedPlacementList]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
  @scala.inline
  implicit class ExcludedPlacementListBuilderOps[Self[excludedplacementlist] <: ExcludedPlacementListBuilder[excludedplacementlist], ExcludedPlacementList] (val x: Self[ExcludedPlacementList]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExcludedPlacementList] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExcludedPlacementList]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExcludedPlacementList] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExcludedPlacementList] with Other]
    @scala.inline
    def withWithName(value: String => ExcludedPlacementListBuilder[ExcludedPlacementList]): Self[ExcludedPlacementList] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

