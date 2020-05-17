package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiACLEntry object
  */
@js.native
trait KiiACLEntry extends js.Object {
  /**
    * Get the action that is being permitted/restricted in this entry
    *
    */
  def getAction(): KiiACLAction = js.native
  /**
    * Get whether or not the action is being permitted to the subject
    *
    */
  def getGrant(): Boolean = js.native
  /**
    * Get the subject that is being permitted/restricted in this entry
    *
    */
  def getSubject[T /* <: KiiACLSubject */](): T = js.native
  /**
    * The action that is being permitted/restricted. Possible values:
    * <br><br>
    * KiiACLAction.KiiACLBucketActionCreateObjects,<br>
    * KiiACLAction.KiiACLBucketActionQueryObjects,  <br>
    * KiiACLAction.KiiACLBucketActionDropBucket,<br>
    * KiiACLAction.KiiACLBucketActionReadObjects,<br>
    * KiiACLAction.KiiACLObjectActionRead,<br>
    * KiiACLAction.KiiACLObjectActionWrite,<br>
    * KiiACLAction.KiiACLSubscribeToTopic,<br>
    * KiiACLAction.KiiACLSendMessageToTopic
    *
    * @param value The action being permitted/restricted
    *
    * @throws If the value is not one of the permitted values
    */
  def setAction(value: KiiACLAction): Unit = js.native
  /**
    * Set whether or not the action is being permitted to the subject
    *
    * @param value true if the action is permitted, false otherwise
    *
    * @throws If the value is not a boolean type
    */
  def setGrant(value: Boolean): Unit = js.native
  /**
    * Set the subject to which the action/grant is being applied
    *
    * @param subject instance.
    *
    * @throws If the value is not one of the permitted values
    */
  def setSubject(subject: KiiACLSubject): Unit = js.native
}

object KiiACLEntry {
  @scala.inline
  def apply(
    getAction: () => KiiACLAction,
    getGrant: () => Boolean,
    getSubject: () => js.Any,
    setAction: KiiACLAction => Unit,
    setGrant: Boolean => Unit,
    setSubject: KiiACLSubject => Unit
  ): KiiACLEntry = {
    val __obj = js.Dynamic.literal(getAction = js.Any.fromFunction0(getAction), getGrant = js.Any.fromFunction0(getGrant), getSubject = js.Any.fromFunction0(getSubject), setAction = js.Any.fromFunction1(setAction), setGrant = js.Any.fromFunction1(setGrant), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[KiiACLEntry]
  }
  @scala.inline
  implicit class KiiACLEntryOps[Self <: KiiACLEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAction(value: () => KiiACLAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGrant(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrant")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAction(value: KiiACLAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGrant(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: KiiACLSubject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

