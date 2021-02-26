package typingsSlinky.rmcTabs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcGesture.mod.IGestureStatus
import typingsSlinky.rmcTabs.anon.OnPanMove
import typingsSlinky.rmcTabs.anon.ReadonlychildrenReactNode
import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("rmc-tabs/lib/Tabs", "StateType")
  @js.native
  class StateType ()
    extends typingsSlinky.rmcTabs.tabsBaseMod.StateType {
    
    var contentPos: js.UndefOr[String] = js.native
    
    var isMoving: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("rmc-tabs/lib/Tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
    def this(props: PropsType) = this()
    
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
    
    var layout: HTMLDivElement = js.native
    
    var onPan: OnPanMove = js.native
    
    def onSwipe(status: IGestureStatus): Unit = js.native
    
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
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType
    extends typingsSlinky.rmcTabs.propsTypeMod.PropsType {
    
    /** prefix class | default: rmc-tabs */
    var prefixCls: js.UndefOr[String] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
