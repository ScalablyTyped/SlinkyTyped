package typingsSlinky.rmcTabs.tabsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.rmcTabs.anon.OnPanMove
import typingsSlinky.rmcTabs.anon.ReadonlychildrenReactNode
import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends typingsSlinky.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
  def this(props: PropsType) = this()
  var layout: HTMLDivElement = js.native
  var onPan: OnPanMove = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean): String = js.native
  def getContentPosByIndex(index: Double, isVertical: Boolean, useLeft: Boolean): String = js.native
  def goToTab(
    index: Double,
    force: js.UndefOr[scala.Nothing],
    usePaged: js.UndefOr[scala.Nothing],
    props: ReadonlychildrenReactNode
  ): Boolean = js.native
  def goToTab(index: Double, force: js.UndefOr[scala.Nothing], usePaged: Boolean): Boolean = js.native
  def goToTab(
    index: Double,
    force: js.UndefOr[scala.Nothing],
    usePaged: Boolean,
    props: ReadonlychildrenReactNode
  ): Boolean = js.native
  def goToTab(
    index: Double,
    force: Boolean,
    usePaged: js.UndefOr[scala.Nothing],
    props: ReadonlychildrenReactNode
  ): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, usePaged: Boolean, props: ReadonlychildrenReactNode): Boolean = js.native
  def onSwipe(
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGestureStatus */ js.Any
  ): Unit = js.native
  def renderContent(): ReactElement = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[ReactElement]
    ]
  ): ReactElement = js.native
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

