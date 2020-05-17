package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.events

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMutationEvent extends XEvent {
  val AttrChange: AttrChangeType = js.native
  val AttrName: String = js.native
  val NewValue: String = js.native
  val PrevValue: String = js.native
  val RelatedNode: XNode = js.native
  def getAttrChange(): AttrChangeType = js.native
  def getAttrName(): String = js.native
  def getNewValue(): String = js.native
  def getPrevValue(): String = js.native
  def getRelatedNode(): XNode = js.native
  def initMutationEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    relatedNodeArg: XNode,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: AttrChangeType
  ): Unit = js.native
}

object XMutationEvent {
  @scala.inline
  def apply(
    AttrChange: AttrChangeType,
    AttrName: String,
    Bubbles: Boolean,
    Cancelable: Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    NewValue: String,
    PrevValue: String,
    RelatedNode: XNode,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    acquire: () => Unit,
    getAttrChange: () => AttrChangeType,
    getAttrName: () => String,
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getNewValue: () => String,
    getPrevValue: () => String,
    getRelatedNode: () => XNode,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMutationEvent: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XMutationEvent = {
    val __obj = js.Dynamic.literal(AttrChange = AttrChange.asInstanceOf[js.Any], AttrName = AttrName.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], PrevValue = PrevValue.asInstanceOf[js.Any], RelatedNode = RelatedNode.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttrChange = js.Any.fromFunction0(getAttrChange), getAttrName = js.Any.fromFunction0(getAttrName), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getNewValue = js.Any.fromFunction0(getNewValue), getPrevValue = js.Any.fromFunction0(getPrevValue), getRelatedNode = js.Any.fromFunction0(getRelatedNode), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XMutationEvent]
  }
  @scala.inline
  implicit class XMutationEventOps[Self <: XMutationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrChange(value: AttrChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttrChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttrName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrevValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedNode(value: XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttrChange(value: () => AttrChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttrName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNewValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrevValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRelatedNode(value: () => XNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelatedNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitMutationEvent(value: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initMutationEvent")(js.Any.fromFunction8(value))
        ret
    }
  }
  
}

