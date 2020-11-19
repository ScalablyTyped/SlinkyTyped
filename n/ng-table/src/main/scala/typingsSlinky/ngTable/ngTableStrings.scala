package typingsSlinky.ngTable

import typingsSlinky.ngTable.filterSettingsMod.FilterLayout
import typingsSlinky.ngTable.groupingFuncMod.GroupSort
import typingsSlinky.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableStrings {
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def stack: stack = "stack".asInstanceOf[stack]
  
  @js.native
  sealed trait _empty extends GroupSort
  
  @js.native
  sealed trait asc
    extends GroupSort
       with SortDirection
  
  @js.native
  sealed trait desc
    extends GroupSort
       with SortDirection
  
  @js.native
  sealed trait horizontal extends FilterLayout
  
  @js.native
  sealed trait stack extends FilterLayout
}
