package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapCardViewBatchEditApi extends js.Object {
  val instance: js.Any = js.native
  def addNewCard(): Unit = js.native
  def deleteCard(visibleIndex: Double): Unit = js.native
  def deleteCardByKey(key: js.Any): Unit = js.native
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  def getDeletedCardIndices(): js.Array[Double] = js.native
  def getInsertedCardIndices(): js.Array[Double] = js.native
  def isDeletedCard(visibleIndex: Double): Boolean = js.native
  def isNewCard(visibleIndex: Double): Boolean = js.native
  def recoverCard(visibleIndex: Double): Unit = js.native
  def recoverCardByKey(key: js.Any): Unit = js.native
  def validateCard(visibleIndex: Double): Boolean = js.native
  def validateCards(validateOnlyModified: Boolean): Boolean = js.native
}

object BootstrapCardViewBatchEditApi {
  @scala.inline
  def apply(
    addNewCard: () => Unit,
    deleteCard: Double => Unit,
    deleteCardByKey: js.Any => Unit,
    getCardVisibleIndices: Boolean => js.Array[Double],
    getDeletedCardIndices: () => js.Array[Double],
    getInsertedCardIndices: () => js.Array[Double],
    instance: js.Any,
    isDeletedCard: Double => Boolean,
    isNewCard: Double => Boolean,
    recoverCard: Double => Unit,
    recoverCardByKey: js.Any => Unit,
    validateCard: Double => Boolean,
    validateCards: Boolean => Boolean
  ): BootstrapCardViewBatchEditApi = {
    val __obj = js.Dynamic.literal(addNewCard = js.Any.fromFunction0(addNewCard), deleteCard = js.Any.fromFunction1(deleteCard), deleteCardByKey = js.Any.fromFunction1(deleteCardByKey), getCardVisibleIndices = js.Any.fromFunction1(getCardVisibleIndices), getDeletedCardIndices = js.Any.fromFunction0(getDeletedCardIndices), getInsertedCardIndices = js.Any.fromFunction0(getInsertedCardIndices), instance = instance.asInstanceOf[js.Any], isDeletedCard = js.Any.fromFunction1(isDeletedCard), isNewCard = js.Any.fromFunction1(isNewCard), recoverCard = js.Any.fromFunction1(recoverCard), recoverCardByKey = js.Any.fromFunction1(recoverCardByKey), validateCard = js.Any.fromFunction1(validateCard), validateCards = js.Any.fromFunction1(validateCards))
    __obj.asInstanceOf[BootstrapCardViewBatchEditApi]
  }
  @scala.inline
  implicit class BootstrapCardViewBatchEditApiOps[Self <: BootstrapCardViewBatchEditApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNewCard(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewCard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteCard(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteCardByKey(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCardByKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCardVisibleIndices(value: Boolean => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCardVisibleIndices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeletedCardIndices(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeletedCardIndices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInsertedCardIndices(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertedCardIndices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeletedCard(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeletedCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNewCard(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecoverCard(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecoverCardByKey(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverCardByKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateCard(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateCards(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCards")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

