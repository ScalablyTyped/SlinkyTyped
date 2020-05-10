package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsShapeMultiplicity extends js.Object {
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    */
  var source: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
  /** Defines the target label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var target: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
  /** Sets the type of the multiplicity. Applicable, if the connector is of type &quot;classifier&quot;
    * @Default {ej.datavisualization.Diagram.Multiplicity.OneToOne}
    */
  var `type`: js.UndefOr[Multiplicity | String] = js.native
}

object ConnectorsShapeMultiplicity {
  @scala.inline
  def apply(): ConnectorsShapeMultiplicity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsShapeMultiplicity]
  }
  @scala.inline
  implicit class ConnectorsShapeMultiplicityOps[Self <: ConnectorsShapeMultiplicity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: ConnectorsShapeMultiplicitySource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: ConnectorsShapeMultiplicitySource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Multiplicity | String): Self = {
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

