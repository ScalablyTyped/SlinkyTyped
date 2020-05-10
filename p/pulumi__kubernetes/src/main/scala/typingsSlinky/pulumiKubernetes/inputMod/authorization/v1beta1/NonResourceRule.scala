package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceRule holds information that describes a rule for the non-resource
  */
@js.native
trait NonResourceRule extends js.Object {
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path.  "*" means all.
    */
  var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch,
    * head, options.  "*" means all.
    */
  var verbs: Input[js.Array[Input[String]]] = js.native
}

object NonResourceRule {
  @scala.inline
  def apply(verbs: Input[js.Array[Input[String]]]): NonResourceRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceRule]
  }
  @scala.inline
  implicit class NonResourceRuleOps[Self <: NonResourceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonResourceURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceURLs")(js.undefined)
        ret
    }
  }
  
}

