package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and
  * an operator that relates the scope name and values.
  */
@js.native
trait ScopedResourceSelectorRequirement extends js.Object {
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn,
    * Exists, DoesNotExist.
    */
  val operator: String = js.native
  /**
    * The name of the scope that the selector applies to.
    */
  val scopeName: String = js.native
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be
    * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This
    * array is replaced during a strategic merge patch.
    */
  val values: js.Array[String] = js.native
}

object ScopedResourceSelectorRequirement {
  @scala.inline
  def apply(operator: String, scopeName: String, values: js.Array[String]): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
  @scala.inline
  implicit class ScopedResourceSelectorRequirementOps[Self <: ScopedResourceSelectorRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

