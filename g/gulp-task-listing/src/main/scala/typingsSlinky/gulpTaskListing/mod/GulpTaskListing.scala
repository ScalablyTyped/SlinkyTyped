package typingsSlinky.gulpTaskListing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GulpTaskListing extends js.Object {
  
  def apply(cb: js.Function): Unit = js.native
  
  def withFilters(subTaskFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
  def withFilters(subTaskFilter: FilterFunction, excludeFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
  def withFilters(subTaskFilter: FilterFunction, excludeFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
  /**
    * Allows for custom filtering of Gulp tasks in the listing
    * 
    * @param subTaskFilter a RegExp or Function returning whether the given task is a subtask
    * @param excludeFilter a RegExp or Function returning whether the given task should be excluded from the listing
    */
  def withFilters(subTaskFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
  def withFilters(subTaskFilter: js.RegExp, excludeFilter: FilterFunction): js.Function1[/* cb */ js.Function, Unit] = js.native
  def withFilters(subTaskFilter: js.RegExp, excludeFilter: js.RegExp): js.Function1[/* cb */ js.Function, Unit] = js.native
}
