package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectSearchResults extends js.Object {
  val Count: Double = js.native
  val MoreResults: Boolean = js.native
  def Clone(): IObjectSearchResults = js.native
  def GetAsObjectVersions(): IObjectVersions = js.native
  def GetScoreOfObject(ObjVer: IObjVer): Double = js.native
  def Item(Index: Double): IObjectVersion = js.native
  def ScoreAt(Index: Double): Double = js.native
  def Sort(ObjectComparer: IObjectComparer): Unit = js.native
  def SortByScore(Ascending: Boolean): Unit = js.native
}

object IObjectSearchResults {
  @scala.inline
  def apply(
    Clone: () => IObjectSearchResults,
    Count: Double,
    GetAsObjectVersions: () => IObjectVersions,
    GetScoreOfObject: IObjVer => Double,
    Item: Double => IObjectVersion,
    MoreResults: Boolean,
    ScoreAt: Double => Double,
    Sort: IObjectComparer => Unit,
    SortByScore: Boolean => Unit
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetAsObjectVersions = js.Any.fromFunction0(GetAsObjectVersions), GetScoreOfObject = js.Any.fromFunction1(GetScoreOfObject), Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], ScoreAt = js.Any.fromFunction1(ScoreAt), Sort = js.Any.fromFunction1(Sort), SortByScore = js.Any.fromFunction1(SortByScore))
    __obj.asInstanceOf[IObjectSearchResults]
  }
  @scala.inline
  implicit class IObjectSearchResultsOps[Self <: IObjectSearchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjectSearchResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAsObjectVersions(value: () => IObjectVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsObjectVersions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScoreOfObject(value: IObjVer => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetScoreOfObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScoreAt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScoreAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: IObjectComparer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortByScore(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortByScore")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

