package typingsSlinky.reactstrap.navLinkMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var innerRef: js.UndefOr[Ref[org.scalajs.dom.raw.HTMLAnchorElement]] = js.undefined
  @JSName("onClick")
  var onClick_NavLinkProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var tag: js.UndefOr[String | ReactComponentClass[_]] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    cssModule: CSSModule = null,
    innerRef: Ref[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    onClick: SyntheticMouseEvent[_] => Unit = null,
    tag: String | ReactComponentClass[_] = null
  ): NavLinkProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
}

