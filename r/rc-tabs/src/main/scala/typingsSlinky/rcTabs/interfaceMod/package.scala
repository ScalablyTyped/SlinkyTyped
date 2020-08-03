package typingsSlinky.rcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type OnTabScroll = js.Function1[/* info */ typingsSlinky.rcTabs.anon.Direction, scala.Unit]
  type RenderTabBar = js.Function2[
    /* props */ js.Any, 
    /* DefaultTabBar */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.facade.ReactElement
  ]
  type TabOffsetMap = typingsSlinky.std.Map[typingsSlinky.react.mod.Key, typingsSlinky.rcTabs.interfaceMod.TabOffset]
  type TabSizeMap = typingsSlinky.std.Map[typingsSlinky.react.mod.Key, typingsSlinky.rcTabs.anon.Height]
}
