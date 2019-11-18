package typingsSlinky.history.historyMod

import typingsSlinky.history.Fn_CurrentLocation
import typingsSlinky.history.Fn_Lv
import typingsSlinky.history.Fn_Options
import typingsSlinky.history.Fn_OptionsHashHistoryBuildOptions
import typingsSlinky.history.Fn_OptionsLocationState
import typingsSlinky.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typingsSlinky.history.createHashHistoryMod.HashHistoryBuildOptions
import typingsSlinky.history.createMemoryHistoryMod.MemoryHistory
import typingsSlinky.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  @JSName("createBrowserHistory")
  var createBrowserHistory_Original: Fn_Options = js.native
  @JSName("createHashHistory")
  var createHashHistory_Original: Fn_OptionsHashHistoryBuildOptions = js.native
  @JSName("createLocation")
  var createLocation_Original: Fn_CurrentLocation = js.native
  @JSName("createMemoryHistory")
  var createMemoryHistory_Original: Fn_OptionsLocationState = js.native
  @JSName("createPath")
  var createPath_Original: js.Function1[/* location */ LocationDescriptorObject[LocationState], Path] = js.native
  @JSName("locationsAreEqual")
  var locationsAreEqual_Original: Fn_Lv = js.native
  @JSName("parsePath")
  var parsePath_Original: js.Function1[/* path */ Path, Location[LocationState]] = js.native
  def createBrowserHistory[S](): History[S] = js.native
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  def createHashHistory[S](): History[S] = js.native
  def createHashHistory[S](options: HashHistoryBuildOptions): History[S] = js.native
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  def createMemoryHistory[S](): MemoryHistory[S] = js.native
  def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  def createPath(location: LocationDescriptorObject[LocationState]): Path = js.native
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
}

