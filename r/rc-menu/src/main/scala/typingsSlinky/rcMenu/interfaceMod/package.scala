package typingsSlinky.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type BuiltinPlacements = typingsSlinky.std.Record[java.lang.String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ typingsSlinky.react.mod.Key, scala.Unit]
  type HoverEventHandler = js.Function1[/* info */ typingsSlinky.rcMenu.anon.Hover, scala.Unit]
  type LegacyFunctionRef = js.Function1[/* node */ typingsSlinky.react.mod.ReactInstance, scala.Unit]
  type MenuClickEventHandler = js.Function1[/* info */ typingsSlinky.rcMenu.interfaceMod.MenuInfo, scala.Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ typingsSlinky.rcMenu.anon.Key, scala.Unit]
  type OpenAnimation = java.lang.String | (typingsSlinky.std.Record[java.lang.String, js.Any])
  type OpenEventHandler = js.Function1[
    /* keys */ js.Array[typingsSlinky.react.mod.Key] | typingsSlinky.rcMenu.anon.Open, 
    scala.Unit
  ]
  type RenderIconType = slinky.core.facade.ReactElement | (js.Function1[/* props */ js.Any, slinky.core.facade.ReactElement])
  type SelectEventHandler = js.Function1[/* info */ typingsSlinky.rcMenu.interfaceMod.SelectInfo, scala.Unit]
}
