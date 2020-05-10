package typingsSlinky.materialUiStyles.getStylesCreatorGetStylesCreatorMod

import typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends js.Object {
  var themingEnabled: Boolean = js.native
  def create(theme: Theme, name: String): StyleRules[Props, ClassKey] = js.native
}

object StylesCreator {
  @scala.inline
  def apply[Theme, Props, ClassKey](create: (Theme, String) => StyleRules[Props, ClassKey], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
  }
  @scala.inline
  implicit class StylesCreatorOps[Self[theme, props, classkey] <: StylesCreator[theme, props, classkey], Theme, Props, ClassKey] (val x: Self[Theme, Props, ClassKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme, Props, ClassKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme, Props, ClassKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Theme, Props, ClassKey]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Theme, Props, ClassKey]) with Other]
    @scala.inline
    def withCreate(value: (Theme, String) => StyleRules[Props, ClassKey]): Self[Theme, Props, ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withThemingEnabled(value: Boolean): Self[Theme, Props, ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

