package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Comments
import typingsSlinky.astTypes.kindsMod.ProgramKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBuilder extends StObject {
  
  def apply(program: ProgramKind): File = js.native
  def apply(program: ProgramKind, name: String): File = js.native
  
  def from(params: Comments): File = js.native
}
