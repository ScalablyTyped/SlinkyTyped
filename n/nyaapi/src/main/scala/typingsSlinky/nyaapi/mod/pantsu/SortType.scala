package typingsSlinky.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortType extends StObject
@JSImport("nyaapi", "pantsu.SortType")
@js.native
object SortType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortType with Double] = js.native
  
  @js.native
  sealed trait completed extends SortType
  /* 7 */ val completed: typingsSlinky.nyaapi.mod.pantsu.SortType.completed with Double = js.native
  
  @js.native
  sealed trait date extends SortType
  /* 2 */ val date: typingsSlinky.nyaapi.mod.pantsu.SortType.date with Double = js.native
  
  @js.native
  sealed trait downloads extends SortType
  /* 3 */ val downloads: typingsSlinky.nyaapi.mod.pantsu.SortType.downloads with Double = js.native
  
  @js.native
  sealed trait id extends SortType
  /* 0 */ val id: typingsSlinky.nyaapi.mod.pantsu.SortType.id with Double = js.native
  
  @js.native
  sealed trait leechers extends SortType
  /* 6 */ val leechers: typingsSlinky.nyaapi.mod.pantsu.SortType.leechers with Double = js.native
  
  @js.native
  sealed trait name extends SortType
  /* 1 */ val name: typingsSlinky.nyaapi.mod.pantsu.SortType.name with Double = js.native
  
  @js.native
  sealed trait seeders extends SortType
  /* 5 */ val seeders: typingsSlinky.nyaapi.mod.pantsu.SortType.seeders with Double = js.native
  
  @js.native
  sealed trait size extends SortType
  /* 4 */ val size: typingsSlinky.nyaapi.mod.pantsu.SortType.size with Double = js.native
}
