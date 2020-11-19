package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.CardDismissDelay
import typingsSlinky.officeUiFabricReact.anon.CompactCardHeight
import typingsSlinky.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typingsSlinky.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
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
import typingsSlinky.officeUiFabricReact.plainCardTypesMod.IPlainCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/HoverCard", JSImport.Namespace)
@js.native
object libHoverCardMod extends js.Object {
  
  val ExpandingCard: ReactComponentClass[IExpandingCardProps] = js.native
  
  val HoverCard: ReactComponentClass[IHoverCardProps] = js.native
  
  val PlainCard: ReactComponentClass[IPlainCardProps] = js.native
  
  @js.native
  object DirectionalHint extends js.Object {
    
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    var bottomAutoEdge: `7` = js.native
    
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    var bottomCenter: `5` = js.native
    
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    var bottomLeftEdge: `4` = js.native
    
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    var bottomRightEdge: `6` = js.native
    
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    var leftBottomEdge: `10` = js.native
    
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    var leftCenter: `9` = js.native
    
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    var leftTopEdge: `8` = js.native
    
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    var rightBottomEdge: `13` = js.native
    
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    var rightCenter: `12` = js.native
    
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    var rightTopEdge: `11` = js.native
    
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    var topAutoEdge: `3` = js.native
    
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    var topCenter: `1` = js.native
    
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    var topLeftEdge: `0` = js.native
    
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    var topRightEdge: `2` = js.native
  }
  
  @js.native
  class ExpandingCardBase protected ()
    extends typingsSlinky.officeUiFabricReact.hoverCardMod.ExpandingCardBase {
    def this(props: IExpandingCardProps) = this()
  }
  /* static members */
  @js.native
  object ExpandingCardBase extends js.Object {
    
    var defaultProps: CompactCardHeight = js.native
  }
  
  @js.native
  object ExpandingCardMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode with Double
      ] = js.native
    
    /* 0 */ val compact: typingsSlinky.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.compact with Double = js.native
    
    /* 1 */ val expanded: typingsSlinky.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.expanded with Double = js.native
  }
  
  @js.native
  class HoverCardBase protected ()
    extends typingsSlinky.officeUiFabricReact.hoverCardMod.HoverCardBase {
    def this(props: IHoverCardProps) = this()
  }
  /* static members */
  @js.native
  object HoverCardBase extends js.Object {
    
    var defaultProps: CardDismissDelay = js.native
  }
  
  @js.native
  object HoverCardType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeUiFabricReact.hoverCardTypesMod.HoverCardType with String] = js.native
    
    /* "ExpandingCard" */ val expanding: typingsSlinky.officeUiFabricReact.hoverCardTypesMod.HoverCardType.expanding with String = js.native
    
    /* "PlainCard" */ val plain: typingsSlinky.officeUiFabricReact.hoverCardTypesMod.HoverCardType.plain with String = js.native
  }
  
  @js.native
  object OpenCardMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.hoverCardTypesMod.OpenCardMode with Double] = js.native
    
    /* 1 */ val hotKey: typingsSlinky.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hotKey with Double = js.native
    
    /* 0 */ val hover: typingsSlinky.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hover with Double = js.native
  }
  
  @js.native
  class PlainCardBase protected ()
    extends typingsSlinky.officeUiFabricReact.hoverCardMod.PlainCardBase {
    def this(props: IPlainCardProps) = this()
  }
}
