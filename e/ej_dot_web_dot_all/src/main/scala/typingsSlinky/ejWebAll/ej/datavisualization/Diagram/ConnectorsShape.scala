package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsShape extends js.Object {
  /** Defines the shape of UMLActivity to connector. Applicable, if the connector is of type UMLActivity
    * @Default {ej.datavisualization.Diagram.UMLActivityFlow.Control}
    */
  var ActivityFlow: js.UndefOr[UMLActivityFlow | String] = js.native
  /** Sets the type of the Association in a BPMN Process
    * @Default {ej.datavisualization.Diagram.AssociationFlows.Default}
    */
  var association: js.UndefOr[AssociationFlows | String] = js.native
  /** Sets the type of the flow in a BPMN Process
    * @Default {ej.datavisualization.Diagram.BPMNFlows.Sequence}
    */
  var flow: js.UndefOr[BPMNFlows | String] = js.native
  /** Sets the type of the message flow. Applicable, if the connector is of type &quot;BPMN&quot;
    * @Default {ej.datavisualization.Diagram.BPMNMessageFlows.Default}
    */
  var message: js.UndefOr[BPMNMessageFlows | String] = js.native
  /** Defines the multiplicity option of the connector
    * @Default {null}
    */
  var multiplicity: js.UndefOr[ConnectorsShapeMultiplicity] = js.native
  /** Defines the role of the connector in a UML Class Diagram. Applicable, if the type of the connector is &quot;classifier&quot;.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Association}
    */
  var relationship: js.UndefOr[ClassifierShapes | String] = js.native
  /** Sets the type of BPMN sequence flow
    * @Default {ej.datavisualization.Diagram.BPMNSequenceFlows.Normal}
    */
  var sequence: js.UndefOr[BPMNSequenceFlows | String] = js.native
  /** Sets the type of the connector
    * @Default {ej.datavisualization.Diagram.ConnectorShapes.BPMN}
    */
  var `type`: js.UndefOr[ConnectorShapes | String] = js.native
}

object ConnectorsShape {
  @scala.inline
  def apply(): ConnectorsShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsShape]
  }
  @scala.inline
  implicit class ConnectorsShapeOps[Self <: ConnectorsShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityFlow(value: UMLActivityFlow | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociation(value: AssociationFlows | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(js.undefined)
        ret
    }
    @scala.inline
    def withFlow(value: BPMNFlows | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: BPMNMessageFlows | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplicity(value: ConnectorsShapeMultiplicity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplicity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplicity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplicity")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: ClassifierShapes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: BPMNSequenceFlows | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ConnectorShapes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

