package typingsSlinky.parse.nodeMod

import typingsSlinky.parse.mod.global.Parse.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that is used to access all of the children of a many-to-many relationship.
  * Each instance of Parse.Relation is associated with a particular parent object and key.
  */
@JSImport("parse/node", "Relation")
@js.native
class Relation[S /* <: typingsSlinky.parse.mod.global.Parse.Object[Attributes] */, T /* <: typingsSlinky.parse.mod.global.Parse.Object[Attributes] */] ()
  extends typingsSlinky.parse.mod.Relation[S, T] {
  def this(parent: S) = this()
  def this(parent: S, key: String) = this()
  def this(parent: js.UndefOr[scala.Nothing], key: String) = this()
}
