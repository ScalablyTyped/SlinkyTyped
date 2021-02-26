package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Body
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgramBuilder extends StObject {
  
  def apply(body: js.Array[StatementKind]): Program = js.native
  
  def from(params: Body): Program = js.native
}
