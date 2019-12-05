package typingsSlinky.rmcDashTabs.libTabsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import typingsSlinky.rcDashGesture.rcDashGestureMod.IGestureStatus
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.rmcDashTabs.Anon_Children
import typingsSlinky.rmcDashTabs.Anon_OffsetOnPanEnd
import typingsSlinky.rmcDashTabs.TypeofClassDefaultTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends typingsSlinky.rmcDashTabs.libTabsDotBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var layout: HTMLDivElement = js.native
  var onPan: Anon_OffsetOnPanEnd = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean): String = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean, useLeft: Boolean): String = js.native
  def goToTab(
    index: Double,
    force: Boolean,
    usePaged: js.UndefOr[scala.Nothing],
    props: Anon_Children with PropsType
  ): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean, props: Anon_Children with PropsType): Boolean = js.native
  def onSwipe(status: IGestureStatus): Unit = js.native
  def renderContent(): Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[TagMod[Any]]
    ]
  ): Element = js.native
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofClassDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

