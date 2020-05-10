package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantAssociation extends BaseElement {
  var innerParticipantRef: Participant = js.native
  var outerParticipantRef: Participant = js.native
}

object ParticipantAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerParticipantRef: Participant,
    outerParticipantRef: Participant
  ): ParticipantAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerParticipantRef = innerParticipantRef.asInstanceOf[js.Any], outerParticipantRef = outerParticipantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantAssociation]
  }
  @scala.inline
  implicit class ParticipantAssociationOps[Self <: ParticipantAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerParticipantRef(value: Participant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerParticipantRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterParticipantRef(value: Participant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerParticipantRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

