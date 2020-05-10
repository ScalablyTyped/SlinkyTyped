package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User Lists
@js.native
trait UserList extends js.Object {
  def close(): Unit = js.native
  def excludedAdGroups(): AdWordsSelector[AdGroup] = js.native
  def excludedCampaigns(): AdWordsSelector[Campaign] = js.native
  def getDescription(): String = js.native
  def getId(): Double = js.native
  def getMembershipLifeSpan(): Double = js.native
  def getName(): String = js.native
  def getSizeForDisplay(): Double = js.native
  def getSizeForSearch(): Double = js.native
  def getSizeRangeForDisplay(): UserListSizeRange = js.native
  def getSizeRangeForSearch(): UserListSizeRange = js.native
  def getType(): UserListType = js.native
  def isClosed(): Boolean = js.native
  def isEligibleForDisplay(): Boolean = js.native
  def isEligibleForSearch(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def open(): Unit = js.native
  def setDescription(description: String): Unit = js.native
  def setMembershipLifeSpan(membershipLifeSpan: Double): Unit = js.native
  def setName(name: String): Unit = js.native
  def targetedAdGroups(): AdWordsSelector[AdGroup] = js.native
  def targetedCampaigns(): AdWordsSelector[Campaign] = js.native
}

object UserList {
  @scala.inline
  def apply(
    close: () => Unit,
    excludedAdGroups: () => AdWordsSelector[AdGroup],
    excludedCampaigns: () => AdWordsSelector[Campaign],
    getDescription: () => String,
    getId: () => Double,
    getMembershipLifeSpan: () => Double,
    getName: () => String,
    getSizeForDisplay: () => Double,
    getSizeForSearch: () => Double,
    getSizeRangeForDisplay: () => UserListSizeRange,
    getSizeRangeForSearch: () => UserListSizeRange,
    getType: () => UserListType,
    isClosed: () => Boolean,
    isEligibleForDisplay: () => Boolean,
    isEligibleForSearch: () => Boolean,
    isOpen: () => Boolean,
    isReadOnly: () => Boolean,
    open: () => Unit,
    setDescription: String => Unit,
    setMembershipLifeSpan: Double => Unit,
    setName: String => Unit,
    targetedAdGroups: () => AdWordsSelector[AdGroup],
    targetedCampaigns: () => AdWordsSelector[Campaign]
  ): UserList = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), excludedAdGroups = js.Any.fromFunction0(excludedAdGroups), excludedCampaigns = js.Any.fromFunction0(excludedCampaigns), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getMembershipLifeSpan = js.Any.fromFunction0(getMembershipLifeSpan), getName = js.Any.fromFunction0(getName), getSizeForDisplay = js.Any.fromFunction0(getSizeForDisplay), getSizeForSearch = js.Any.fromFunction0(getSizeForSearch), getSizeRangeForDisplay = js.Any.fromFunction0(getSizeRangeForDisplay), getSizeRangeForSearch = js.Any.fromFunction0(getSizeRangeForSearch), getType = js.Any.fromFunction0(getType), isClosed = js.Any.fromFunction0(isClosed), isEligibleForDisplay = js.Any.fromFunction0(isEligibleForDisplay), isEligibleForSearch = js.Any.fromFunction0(isEligibleForSearch), isOpen = js.Any.fromFunction0(isOpen), isReadOnly = js.Any.fromFunction0(isReadOnly), open = js.Any.fromFunction0(open), setDescription = js.Any.fromFunction1(setDescription), setMembershipLifeSpan = js.Any.fromFunction1(setMembershipLifeSpan), setName = js.Any.fromFunction1(setName), targetedAdGroups = js.Any.fromFunction0(targetedAdGroups), targetedCampaigns = js.Any.fromFunction0(targetedCampaigns))
    __obj.asInstanceOf[UserList]
  }
  @scala.inline
  implicit class UserListOps[Self <: UserList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAdGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedCampaigns(value: () => AdWordsSelector[Campaign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedCampaigns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMembershipLifeSpan(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipLifeSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeForDisplay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeForDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeForSearch(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeForSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeRangeForDisplay(value: () => UserListSizeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeRangeForDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeRangeForSearch(value: () => UserListSizeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeRangeForSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => UserListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsClosed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEligibleForDisplay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEligibleForDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEligibleForSearch(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEligibleForSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMembershipLifeSpan(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMembershipLifeSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTargetedAdGroups(value: () => AdWordsSelector[AdGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedAdGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetedCampaigns(value: () => AdWordsSelector[Campaign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedCampaigns")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

