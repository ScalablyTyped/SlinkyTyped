package typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod

import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Derived
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Generated
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Source
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashCompiler.libCoreGraphQLIRMod.SourceLocation
  - typings.relayDashCompiler.libCoreGraphQLIRMod.GeneratedLocation
  - typings.relayDashCompiler.libCoreGraphQLIRMod.DerivedLocation
  - typings.relayDashCompiler.libCoreGraphQLIRMod.UnknownLocation
*/
trait Location extends js.Object

object Location {
  @scala.inline
  def SourceLocation(end: Double, kind: Source, source: typingsSlinky.graphql.graphqlMod.Source, start: Double): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def GeneratedLocation(kind: Generated): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def DerivedLocation(kind: Derived, source: Location): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def UnknownLocation(kind: Unknown): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

