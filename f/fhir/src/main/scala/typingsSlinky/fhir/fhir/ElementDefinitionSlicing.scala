package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This element is sliced - slices follow
  */
@js.native
trait ElementDefinitionSlicing extends Element {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'ordered'.
    */
  var _ordered: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'rules'.
    */
  var _rules: js.UndefOr[Element] = js.native
  /**
    * Text description of how slicing works (or not)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Element values that are used to distinguish the slices
    */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.native
  /**
    * If elements must be in same order as slices
    */
  var ordered: js.UndefOr[Boolean] = js.native
  /**
    * closed | open | openAtEnd
    */
  var rules: code = js.native
}

object ElementDefinitionSlicing {
  @scala.inline
  def apply(rules: code): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
  @scala.inline
  implicit class ElementDefinitionSlicingOps[Self <: ElementDefinitionSlicing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_ordered(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ordered")(js.undefined)
        ret
    }
    @scala.inline
    def with_rules(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rules")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscriminator(value: js.Array[ElementDefinitionSlicingDiscriminator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscriminator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(js.undefined)
        ret
    }
  }
  
}

