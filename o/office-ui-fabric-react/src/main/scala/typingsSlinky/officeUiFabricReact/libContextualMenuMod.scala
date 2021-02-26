package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IMenuItemStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`10`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`11`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`13`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`4`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`5`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`8`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextualMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenu")
  @js.native
  val ContextualMenu: ReactComponentClass[IContextualMenuProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase")
  @js.native
  class ContextualMenuBase protected ()
    extends typingsSlinky.officeUiFabricReact.contextualMenuMod.ContextualMenuBase {
    def this(props: IContextualMenuProps) = this()
  }
  /* static members */
  object ContextualMenuBase {
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase.defaultProps")
    @js.native
    def defaultProps: IContextualMenuProps = js.native
    @scala.inline
    def defaultProps_=(x: IContextualMenuProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItem")
  @js.native
  val ContextualMenuItem: ReactComponentClass[IContextualMenuItemProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItemBase")
  @js.native
  class ContextualMenuItemBase protected ()
    extends typingsSlinky.officeUiFabricReact.contextualMenuMod.ContextualMenuItemBase {
    def this(props: IContextualMenuItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuItemType")
  @js.native
  object ContextualMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType with Double
      ] = js.native
    
    /* 1 */ val Divider: typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Normal with Double = js.native
    
    /* 3 */ val Section: typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Section with Double = js.native
  }
  
  object DirectionalHint {
    
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomAutoEdge")
    @js.native
    def bottomAutoEdge: `7` = js.native
    @scala.inline
    def bottomAutoEdge_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomCenter")
    @js.native
    def bottomCenter: `5` = js.native
    @scala.inline
    def bottomCenter_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomLeftEdge")
    @js.native
    def bottomLeftEdge: `4` = js.native
    @scala.inline
    def bottomLeftEdge_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.bottomRightEdge")
    @js.native
    def bottomRightEdge: `6` = js.native
    @scala.inline
    def bottomRightEdge_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRightEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftBottomEdge")
    @js.native
    def leftBottomEdge: `10` = js.native
    @scala.inline
    def leftBottomEdge_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftCenter")
    @js.native
    def leftCenter: `9` = js.native
    @scala.inline
    def leftCenter_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.leftTopEdge")
    @js.native
    def leftTopEdge: `8` = js.native
    @scala.inline
    def leftTopEdge_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightBottomEdge")
    @js.native
    def rightBottomEdge: `13` = js.native
    @scala.inline
    def rightBottomEdge_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightCenter")
    @js.native
    def rightCenter: `12` = js.native
    @scala.inline
    def rightCenter_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.rightTopEdge")
    @js.native
    def rightTopEdge: `11` = js.native
    @scala.inline
    def rightTopEdge_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topAutoEdge")
    @js.native
    def topAutoEdge: `3` = js.native
    @scala.inline
    def topAutoEdge_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topCenter")
    @js.native
    def topCenter: `1` = js.native
    @scala.inline
    def topCenter_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topLeftEdge")
    @js.native
    def topLeftEdge: `0` = js.native
    @scala.inline
    def topLeftEdge_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/ContextualMenu", "DirectionalHint.topRightEdge")
    @js.native
    def topRightEdge: `2` = js.native
    @scala.inline
    def topRightEdge_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRightEdge")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "canAnyMenuItemsCheck")
  @js.native
  def canAnyMenuItemsCheck(items: js.Array[IContextualMenuItem]): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "getMenuItemStyles")
  @js.native
  def getMenuItemStyles(theme: ITheme): IMenuItemStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "getSubmenuItems")
  @js.native
  def getSubmenuItems(item: IContextualMenuItem): js.UndefOr[js.Array[IContextualMenuItem]] = js.native
}
