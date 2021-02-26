package typingsSlinky.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object othersTypesMod {
  
  type Sql = js.Function2[
    /* sqlStr */ String, 
    /* args */ js.UndefOr[StringDictionary[Name | Value]], 
    String | js.Array[String]
  ]
}
