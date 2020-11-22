package typingsSlinky.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/othersTypes", JSImport.Namespace)
@js.native
object othersTypesMod extends js.Object {
  
  type Sql = js.Function2[
    /* sqlStr */ String, 
    /* args */ js.UndefOr[StringDictionary[Name | Value]], 
    String | js.Array[String]
  ]
}
