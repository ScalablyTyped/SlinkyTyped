package typingsSlinky.aureliaTemplating.mod

import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStaticViewConfig extends js.Object {
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
    ])
  ] = js.native
  var template: String | HTMLTemplateElement = js.native
}

object IStaticViewConfig {
  @scala.inline
  def apply(template: String | HTMLTemplateElement): IStaticViewConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
  @scala.inline
  implicit class IStaticViewConfigOps[Self <: IStaticViewConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: String | HTMLTemplateElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependenciesFunction0(value: () => js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDependencies(
      value: js.Array[js.Function] | (js.Function0[
          js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
  }
  
}

