package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource
  * requests to the Authorizer interface
  */
@js.native
trait NonResourceAttributes extends js.Object {
  /**
    * Path is the URL path of the request
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * Verb is the standard HTTP verb
    */
  var verb: js.UndefOr[Input[String]] = js.native
}

object NonResourceAttributes {
  @scala.inline
  def apply(): NonResourceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonResourceAttributes]
  }
  @scala.inline
  implicit class NonResourceAttributesOps[Self <: NonResourceAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
  }
  
}

