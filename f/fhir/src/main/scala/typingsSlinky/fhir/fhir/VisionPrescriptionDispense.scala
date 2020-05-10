package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vision supply authorization
  */
@js.native
trait VisionPrescriptionDispense extends BackboneElement {
  /**
    * Contains extended information for property 'add'.
    */
  var _add: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'axis'.
    */
  var _axis: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'backCurve'.
    */
  var _backCurve: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'base'.
    */
  var _base: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'brand'.
    */
  var _brand: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'cylinder'.
    */
  var _cylinder: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'diameter'.
    */
  var _diameter: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eye'.
    */
  var _eye: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'power'.
    */
  var _power: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'prism'.
    */
  var _prism: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sphere'.
    */
  var _sphere: js.UndefOr[Element] = js.native
  /**
    * Lens add
    */
  var add: js.UndefOr[decimal] = js.native
  /**
    * Lens axis
    */
  var axis: js.UndefOr[integer] = js.native
  /**
    * Contact lens back curvature
    */
  var backCurve: js.UndefOr[decimal] = js.native
  /**
    * up | down | in | out
    */
  var base: js.UndefOr[code] = js.native
  /**
    * Brand required
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Color required
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Lens cylinder
    */
  var cylinder: js.UndefOr[decimal] = js.native
  /**
    * Contact lens diameter
    */
  var diameter: js.UndefOr[decimal] = js.native
  /**
    * Lens wear duration
    */
  var duration: js.UndefOr[Quantity] = js.native
  /**
    * right | left
    */
  var eye: js.UndefOr[code] = js.native
  /**
    * Notes for coatings
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Contact lens power
    */
  var power: js.UndefOr[decimal] = js.native
  /**
    * Lens prism
    */
  var prism: js.UndefOr[decimal] = js.native
  /**
    * Product to be supplied
    */
  var product: js.UndefOr[CodeableConcept] = js.native
  /**
    * Lens sphere
    */
  var sphere: js.UndefOr[decimal] = js.native
}

object VisionPrescriptionDispense {
  @scala.inline
  def apply(): VisionPrescriptionDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisionPrescriptionDispense]
  }
  @scala.inline
  implicit class VisionPrescriptionDispenseOps[Self <: VisionPrescriptionDispense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_add(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_add: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_add")(js.undefined)
        ret
    }
    @scala.inline
    def with_axis(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_axis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axis")(js.undefined)
        ret
    }
    @scala.inline
    def with_backCurve(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_backCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_backCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_backCurve")(js.undefined)
        ret
    }
    @scala.inline
    def with_base(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_base")(js.undefined)
        ret
    }
    @scala.inline
    def with_brand(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_brand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_brand")(js.undefined)
        ret
    }
    @scala.inline
    def with_color(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_color")(js.undefined)
        ret
    }
    @scala.inline
    def with_cylinder(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cylinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cylinder")(js.undefined)
        ret
    }
    @scala.inline
    def with_diameter(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_diameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diameter")(js.undefined)
        ret
    }
    @scala.inline
    def with_eye(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eye")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_eye: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eye")(js.undefined)
        ret
    }
    @scala.inline
    def with_power(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_power: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_power")(js.undefined)
        ret
    }
    @scala.inline
    def with_prism(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_prism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prism")(js.undefined)
        ret
    }
    @scala.inline
    def with_sphere(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sphere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sphere")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBackCurve(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withBase(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCylinder(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCylinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameter(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEye(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eye")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEye: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eye")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPower(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(js.undefined)
        ret
    }
    @scala.inline
    def withPrism(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prism")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withSphere(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSphere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(js.undefined)
        ret
    }
  }
  
}

