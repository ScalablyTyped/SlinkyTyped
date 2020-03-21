package typingsSlinky.reactstrap.navbarTextMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarTextProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var tag: js.UndefOr[String | ReactComponentClass[_]] = js.undefined
}

object NavbarTextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    tag: String | ReactComponentClass[_] = null
  ): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarTextProps]
  }
}

