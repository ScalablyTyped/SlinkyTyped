package typingsSlinky.antd.badgeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(prefixCls: String): String = js.native
  def getBadgeClassName(prefixCls: String, direction: String): String = js.native
  def getDisplayCount(): String | Double | Null = js.native
  def getNumberedDisplayCount(): String | Double | Null = js.native
  def getScrollNumberTitle(): js.UndefOr[String | Double] = js.native
  def getStyleWithOffset(): js.UndefOr[CSSProperties] = js.native
  def hasStatus(): Boolean = js.native
  def isDot(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isZero(): Boolean = js.native
  def renderBadge(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderBadgeNumber(prefixCls: String, scrollNumberPrefixCls: String): ReactElement | Null = js.native
  def renderDisplayComponent(): js.UndefOr[ReactElement] = js.native
  def renderStatusText(prefixCls: String): ReactElement | Null = js.native
}

