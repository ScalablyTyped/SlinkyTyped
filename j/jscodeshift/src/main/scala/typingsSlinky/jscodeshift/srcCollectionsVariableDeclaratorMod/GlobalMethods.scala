package typingsSlinky.jscodeshift.srcCollectionsVariableDeclaratorMod

import typingsSlinky.astDashTypes.genNodesMod.VariableDeclarator
import typingsSlinky.jscodeshift.srcCollectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalMethods extends js.Object {
  /**
    * Finds all variable declarators, optionally filtered by name.
    */
  def findVariableDeclarators(): Collection[VariableDeclarator] = js.native
  def findVariableDeclarators(name: String): Collection[VariableDeclarator] = js.native
}

