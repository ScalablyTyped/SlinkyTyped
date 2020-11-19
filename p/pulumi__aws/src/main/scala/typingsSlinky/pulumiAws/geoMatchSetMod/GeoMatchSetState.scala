package typingsSlinky.pulumiAws.geoMatchSetMod

import typingsSlinky.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMatchSetState extends js.Object {
  
  /**
    * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]] = js.native
  
  /**
    * The name or description of the Geo Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object GeoMatchSetState {
  
  @scala.inline
  def apply(): GeoMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchSetState]
  }
  
  @scala.inline
  implicit class GeoMatchSetStateOps[Self <: GeoMatchSetState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeoMatchConstraintsVarargs(value: Input[GeoMatchSetGeoMatchConstraint]*): Self = this.set("geoMatchConstraints", js.Array(value :_*))
    
    @scala.inline
    def setGeoMatchConstraints(value: Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]): Self = this.set("geoMatchConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchConstraints: Self = this.set("geoMatchConstraints", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
