package typingsSlinky.knockstrap

import typingsSlinky.knockstrap.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutTemplateSources extends js.Object {
  var stringTemplate: Instantiable = js.native
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(stringTemplate: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(stringTemplate = stringTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  @scala.inline
  implicit class KnockoutTemplateSourcesOps[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStringTemplate(value: Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

