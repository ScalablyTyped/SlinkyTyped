package typingsSlinky.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceMod {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.TagMod
  import slinky.web.SyntheticAnimationEvent
  import slinky.web.SyntheticTransitionEvent
  import typingsSlinky.rcDashMenu.Anon_DomEventKey
  import typingsSlinky.rcDashMenu.Anon_Hover
  import typingsSlinky.rcDashMenu.Anon_Item
  import typingsSlinky.rcDashMenu.rcDashMenuBooleans.`false`
  import typingsSlinky.react.reactMod.CSSProperties
  import typingsSlinky.react.reactMod.Key
  import typingsSlinky.react.reactMod.ReactInstance
  import typingsSlinky.std.Record

  type AnimationType = String | (Record[String, js.Any])
  type BuiltinPlacements = Record[String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ Key, Unit]
  type HoverEventHandler = js.Function1[/* info */ Anon_Hover, Unit]
  type LegacyFunctionRef = js.Function1[/* node */ ReactInstance, Unit]
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ Anon_DomEventKey, Unit]
  type MotionEventHandler = js.Function2[
    /* element */ HTMLElement, 
    /* event */ js.UndefOr[SyntheticTransitionEvent[HTMLElement] | SyntheticAnimationEvent[HTMLElement]], 
    js.UndefOr[CSSProperties | `false` | Null | Unit]
  ]
  type MotionNameObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in rc-menu.rc-menu/lib/interface.MotionStatus | rc-menu.rc-menu/lib/interface.MotionActiveStatus ]:? string}
    */ typingsSlinky.rcDashMenu.rcDashMenuStrings.MotionNameObject with js.Any
  type OpenAnimation = String | (Record[String, js.Any])
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Anon_Item, Unit]
  type RenderIconType = TagMod[Any] | (js.Function1[/* props */ js.Any, TagMod[Any]])
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  type TransitionNameType = String
}
