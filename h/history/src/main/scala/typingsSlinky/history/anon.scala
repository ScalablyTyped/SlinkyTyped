package typingsSlinky.history

import typingsSlinky.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typingsSlinky.history.createHashHistoryMod.HashHistoryBuildOptions
import typingsSlinky.history.createMemoryHistoryMod.MemoryHistory
import typingsSlinky.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationKey
import typingsSlinky.history.mod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[S](): MemoryHistory[S] = js.native
    def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[S](): History[S] = js.native
    def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallLocation extends StObject {
    
    def apply[S](location: LocationDescriptorObject[S]): Path = js.native
  }
  
  @js.native
  trait FnCallLvRv extends StObject {
    
    def apply[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  }
  
  @js.native
  trait FnCallOptions extends StObject {
    
    def apply[S](): History[S] = js.native
    def apply[S](options: HashHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallPathStateKeyCurrentLocation extends StObject {
    
    def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: S,
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: LocationKey,
      currentLocation: Location[S]
    ): Location[S] = js.native
  }
}
