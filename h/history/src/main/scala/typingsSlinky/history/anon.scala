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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
    def apply[S](): MemoryHistory[S] = js.native
    def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply[S](): History[S] = js.native
    def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallLocation extends js.Object {
    def apply[S](location: LocationDescriptorObject[S]): Path = js.native
  }
  
  @js.native
  trait FnCallLvRv extends js.Object {
    def apply[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  }
  
  @js.native
  trait FnCallOptions extends js.Object {
    def apply[S](): History[S] = js.native
    def apply[S](options: HashHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallPathStateKeyCurrentLocation extends js.Object {
    def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  }
  
}

