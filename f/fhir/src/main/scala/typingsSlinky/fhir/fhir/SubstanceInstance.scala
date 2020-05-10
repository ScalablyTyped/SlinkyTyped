package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this describes a specific package/container of the substance
  */
@js.native
trait SubstanceInstance extends BackboneElement {
  /**
    * Contains extended information for property 'expiry'.
    */
  var _expiry: js.UndefOr[Element] = js.native
  /**
    * When no longer valid to use
    */
  var expiry: js.UndefOr[dateTime] = js.native
  /**
    * Identifier of the package/container
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Amount of substance in the package
    */
  var quantity: js.UndefOr[Quantity] = js.native
}

object SubstanceInstance {
  @scala.inline
  def apply(): SubstanceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceInstance]
  }
  @scala.inline
  implicit class SubstanceInstanceOps[Self <: SubstanceInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_expiry(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_expiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiry(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

