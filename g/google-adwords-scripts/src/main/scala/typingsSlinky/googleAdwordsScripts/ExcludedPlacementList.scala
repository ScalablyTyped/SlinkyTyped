package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shared Sets
@js.native
trait ExcludedPlacementList extends AdWordsEntity {
  def addExcludedPlacement(url: String): Unit = js.native
  def addExcludedPlacements(urls: js.Array[String]): Unit = js.native
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement] = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def setName(name: String): Unit = js.native
}

object ExcludedPlacementList {
  @scala.inline
  def apply(
    addExcludedPlacement: String => Unit,
    addExcludedPlacements: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    excludedPlacements: () => AdWordsSelector[SharedExcludedPlacement],
    getId: () => Double,
    getName: () => String,
    setName: String => Unit
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1(addExcludedPlacement), addExcludedPlacements = js.Any.fromFunction1(addExcludedPlacements), campaigns = js.Any.fromFunction0(campaigns), excludedPlacements = js.Any.fromFunction0(excludedPlacements), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
  @scala.inline
  implicit class ExcludedPlacementListOps[Self <: ExcludedPlacementList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddExcludedPlacement(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExcludedPlacement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddExcludedPlacements(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExcludedPlacements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCampaigns(value: () => AdWordsSelector[Campaign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaigns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedPlacements(value: () => AdWordsSelector[SharedExcludedPlacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPlacements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

