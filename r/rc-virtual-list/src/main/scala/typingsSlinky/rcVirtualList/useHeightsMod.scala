package typingsSlinky.rcVirtualList

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcVirtualList.interfaceMod.GetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Namespace)
@js.native
object useHeightsMod extends js.Object {
  
  def default[T](getKey: GetKey[T]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typingsSlinky.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  def default[T](
    getKey: GetKey[T],
    onItemAdd: js.UndefOr[scala.Nothing],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typingsSlinky.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  def default[T](getKey: GetKey[T], onItemAdd: js.Function1[/* item */ T, Unit]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typingsSlinky.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  def default[T](
    getKey: GetKey[T],
    onItemAdd: js.Function1[/* item */ T, Unit],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typingsSlinky.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
}
