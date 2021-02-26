package typingsSlinky.ionicCore

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonItemElement
import typingsSlinky.ionicCore.elementInterfaceMod.AnchorInterface
import typingsSlinky.ionicCore.elementInterfaceMod.ButtonInterface
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.ionicCoreStrings.full
import typingsSlinky.ionicCore.ionicCoreStrings.inset
import typingsSlinky.ionicCore.ionicCoreStrings.none
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("@ionic/core/dist/types/components/item/item", "Item")
  @js.native
  class Item ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * If `true`, a button tag will be rendered and the item will be tappable.
      */
    var button: Boolean = js.native
    
    var canActivate: js.Any = js.native
    
    var clickListener: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MItem(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MItem(): Unit = js.native
    
    var delegateFocus: js.Any = js.native
    
    /**
      * If `true`, a detail arrow will appear on the item. Defaults to `false` unless the `mode`
      * is `ios` and an `href` or `button` property is present.
      */
    var detail: js.UndefOr[Boolean] = js.native
    
    /**
      * The icon to use when `detail` is set to `true`.
      */
    var detailIcon: String = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MItem(): Unit = js.native
    
    var el: HTMLIonItemElement = js.native
    
    var getFirstInput: js.Any = js.native
    
    var hasCover: js.Any = js.native
    
    var isClickable: js.Any = js.native
    
    def itemStyle(ev: CustomEvent): Unit = js.native
    
    var itemStyles: js.Any = js.native
    
    def labelColorChanged(ev: CustomEvent): Unit = js.native
    
    var labelColorStyles: js.Any = js.native
    
    /**
      * How the bottom border should be displayed on the item.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    
    var multipleInputs: Boolean = js.native
    
    @JSName("render")
    def render_MItem(): js.Any = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page using `href`.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    
    var setMultipleInputs: js.Any = js.native
  }
}
