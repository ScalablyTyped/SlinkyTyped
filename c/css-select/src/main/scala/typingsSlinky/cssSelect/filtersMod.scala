package typingsSlinky.cssSelect

import typingsSlinky.cssSelect.typesMod.CompiledQuery
import typingsSlinky.cssSelect.typesMod.InternalOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersMod {
  
  @JSImport("css-select/lib/pseudo-selectors/filters", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  type Filter = js.Function4[
    /* next */ CompiledQuery[js.Any], 
    /* text */ String, 
    /* options */ InternalOptions[js.Any, js.Any], 
    /* context */ js.UndefOr[js.Array[js.Any]], 
    CompiledQuery[js.Any]
  ]
}
