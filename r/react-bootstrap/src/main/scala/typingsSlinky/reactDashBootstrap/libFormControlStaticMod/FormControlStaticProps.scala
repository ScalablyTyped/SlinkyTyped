package typingsSlinky.reactDashBootstrap.libFormControlStaticMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlStaticProps
  extends AllHTMLAttributes[FormControlStatic]
     with ClassAttributes[FormControlStatic] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object FormControlStaticProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormControlStatic] = null,
    ClassAttributes: ClassAttributes[FormControlStatic] = null,
    bsClass: String = null,
    componentClass: ReactComponentClass[_] = null
  ): FormControlStaticProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlStaticProps]
  }
}

