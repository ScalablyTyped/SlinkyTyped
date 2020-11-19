package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupable extends ISortable {
  
  /** Adds GroupBy clause to the query.
    @param collapse If true, only information about the groups is retrieved, otherwise items are also retrieved.
    @param groupLimit Return only first N groups */
  def GroupBy(fieldInternalName: js.Any): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: js.Any, collapse: js.UndefOr[scala.Nothing], groupLimit: Double): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: js.Any, collapse: Boolean): IGroupedQuery = js.native
  def GroupBy(fieldInternalName: js.Any, collapse: Boolean, groupLimit: Double): IGroupedQuery = js.native
}
