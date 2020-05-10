package typingsSlinky.materialUiStyles

import slinky.core.facade.ReactRef
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClasses[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var classes: ClassNameMap[ClassKeyOfStyles[StylesType]] = js.native
  var innerRef: js.UndefOr[Ref[_]] = js.native
}

object AnonClasses {
  @scala.inline
  def apply[StylesType](classes: ClassNameMap[ClassKeyOfStyles[StylesType]]): AnonClasses[StylesType] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses[StylesType]]
  }
  @scala.inline
  implicit class AnonClassesOps[Self[stylestype] <: AnonClasses[stylestype], StylesType] (val x: Self[StylesType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StylesType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StylesType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StylesType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StylesType] with Other]
    @scala.inline
    def withClasses(value: ClassNameMap[ClassKeyOfStyles[StylesType]]): Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[_]): Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[_]): Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
  }
  
}

