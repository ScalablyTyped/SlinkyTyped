package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: AnonInstantiableKnockoutTemplateAnonymous = js.native
  var domElement: AnonInstantiableKnockoutTemplateSourcesDomElement = js.native
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(
    anonymousTemplate: AnonInstantiableKnockoutTemplateAnonymous,
    domElement: AnonInstantiableKnockoutTemplateSourcesDomElement
  ): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  @scala.inline
  implicit class KnockoutTemplateSourcesOps[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymousTemplate(value: AnonInstantiableKnockoutTemplateAnonymous): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomElement(value: AnonInstantiableKnockoutTemplateSourcesDomElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

