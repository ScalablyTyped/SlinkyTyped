package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links this graph makes rules about
  */
@js.native
trait GraphDefinitionLink extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sliceName'.
    */
  var _sliceName: js.UndefOr[Element] = js.native
  /**
    * Why this link is specified
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Maximum occurrences for this link
    */
  var max: js.UndefOr[String] = js.native
  /**
    * Minimum occurrences for this link
    */
  var min: js.UndefOr[integer] = js.native
  /**
    * Path in the resource that contains the link
    */
  var path: String = js.native
  /**
    * Which slice (if profiled)
    */
  var sliceName: js.UndefOr[String] = js.native
  /**
    * Potential target for the link
    */
  var target: js.Array[GraphDefinitionLinkTarget] = js.native
}

object GraphDefinitionLink {
  @scala.inline
  def apply(path: String, target: js.Array[GraphDefinitionLinkTarget]): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLink]
  }
  @scala.inline
  implicit class GraphDefinitionLinkOps[Self <: GraphDefinitionLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[GraphDefinitionLinkTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
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
    def with_max(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_max")(js.undefined)
        ret
    }
    @scala.inline
    def with_min(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_min")(js.undefined)
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def with_sliceName(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sliceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sliceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sliceName")(js.undefined)
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
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceName")(js.undefined)
        ret
    }
  }
  
}

