package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same source and target systems
  */
@js.native
trait ConceptMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceVersion'.
    */
  var _sourceVersion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'targetVersion'.
    */
  var _targetVersion: js.UndefOr[Element] = js.native
  /**
    * Mappings for a concept from the source set
    */
  var element: js.Array[ConceptMapGroupElement] = js.native
  /**
    * Code System (if value set crosses code systems)
    */
  var source: js.UndefOr[uri] = js.native
  /**
    * Specific version of the  code system
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * System of the target (if necessary)
    */
  var target: js.UndefOr[uri] = js.native
  /**
    * Specific version of the  code system
    */
  var targetVersion: js.UndefOr[String] = js.native
  /**
    * When no match in the mappings
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.native
}

object ConceptMapGroup {
  @scala.inline
  def apply(element: js.Array[ConceptMapGroupElement]): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroup]
  }
  @scala.inline
  implicit class ConceptMapGroupOps[Self <: ConceptMapGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: js.Array[ConceptMapGroupElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_source(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(js.undefined)
        ret
    }
    @scala.inline
    def with_sourceVersion(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def with_target(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_target: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_target")(js.undefined)
        ret
    }
    @scala.inline
    def with_targetVersion(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_targetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: uri): Self = {
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
    def withSourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: uri): Self = {
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
    def withTargetVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmapped(value: ConceptMapGroupUnmapped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmapped")(js.undefined)
        ret
    }
  }
  
}

