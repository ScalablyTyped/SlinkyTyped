package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.Location
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/printLocation", JSImport.Namespace)
@js.native
object printLocationMod extends js.Object {
  
  def printLocation(location: Location): String = js.native
  
  def printSourceLocation(source: Source, sourceLocation: SourceLocation): String = js.native
}
