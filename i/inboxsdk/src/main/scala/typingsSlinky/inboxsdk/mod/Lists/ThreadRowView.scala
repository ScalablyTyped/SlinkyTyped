package typingsSlinky.inboxsdk.mod.Lists

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowView extends js.Object {
  var destroyed: Boolean = js.native
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit = js.native
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit = js.native
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit = js.native
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit = js.native
  def addLabel(labelDescriptor: LabelDescriptor): Unit = js.native
  def getContacts(): js.Array[Contact] = js.native
  def getDateString(): String = js.native
  def getDraftID(): js.Promise[String] = js.native
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): String = js.native
  def getThreadIDAsync(): js.Promise[String] = js.native
  def getThreadIDIfStableAsync(): js.Promise[String | Null] = js.native
  def getVisibleDraftCount(): Double = js.native
  def getVisibleMessageCount(): Double = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): Unit = js.native
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): Unit = js.native
}

object ThreadRowView {
  @scala.inline
  def apply(
    addActionButton: ThreadRowActionButtonDescriptor => Unit,
    addAttachmentIcon: ThreadRowAttachmentIconDescriptor => Unit,
    addButton: ThreadRowButtonDescriptor => Unit,
    addImage: ImageDescriptor => Unit,
    addLabel: LabelDescriptor => Unit,
    destroyed: Boolean,
    getContacts: () => js.Array[Contact],
    getDateString: () => String,
    getDraftID: () => js.Promise[String],
    getSubject: () => String,
    getThreadIDAsync: () => js.Promise[String],
    getThreadIDIfStableAsync: () => js.Promise[String | Null],
    getVisibleDraftCount: () => Double,
    getVisibleMessageCount: () => Double,
    on: (destroy, js.Function0[Unit]) => Unit,
    replaceDate: ThreadRowDateDescriptor => Unit,
    replaceDraftLabel: ThreadRowDraftLabelDescriptor => Unit
  ): ThreadRowView = {
    val __obj = js.Dynamic.literal(addActionButton = js.Any.fromFunction1(addActionButton), addAttachmentIcon = js.Any.fromFunction1(addAttachmentIcon), addButton = js.Any.fromFunction1(addButton), addImage = js.Any.fromFunction1(addImage), addLabel = js.Any.fromFunction1(addLabel), destroyed = destroyed.asInstanceOf[js.Any], getContacts = js.Any.fromFunction0(getContacts), getDateString = js.Any.fromFunction0(getDateString), getDraftID = js.Any.fromFunction0(getDraftID), getSubject = js.Any.fromFunction0(getSubject), getThreadIDAsync = js.Any.fromFunction0(getThreadIDAsync), getThreadIDIfStableAsync = js.Any.fromFunction0(getThreadIDIfStableAsync), getVisibleDraftCount = js.Any.fromFunction0(getVisibleDraftCount), getVisibleMessageCount = js.Any.fromFunction0(getVisibleMessageCount), on = js.Any.fromFunction2(on), replaceDate = js.Any.fromFunction1(replaceDate), replaceDraftLabel = js.Any.fromFunction1(replaceDraftLabel))
    __obj.asInstanceOf[ThreadRowView]
  }
  @scala.inline
  implicit class ThreadRowViewOps[Self <: ThreadRowView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddActionButton(value: ThreadRowActionButtonDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActionButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddAttachmentIcon(value: ThreadRowAttachmentIconDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachmentIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddButton(value: ThreadRowButtonDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddImage(value: ImageDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddLabel(value: LabelDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContacts(value: () => js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContacts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDateString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDraftID(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDraftID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThreadIDAsync(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreadIDAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThreadIDIfStableAsync(value: () => js.Promise[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreadIDIfStableAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleDraftCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleDraftCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleMessageCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleMessageCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (destroy, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplaceDate(value: ThreadRowDateDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceDraftLabel(value: ThreadRowDraftLabelDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDraftLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

