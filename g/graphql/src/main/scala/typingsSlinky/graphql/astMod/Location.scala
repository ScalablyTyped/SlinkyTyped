package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.anon.End
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/ast", "Location")
@js.native
class Location protected () extends js.Object {
  def this(startToken: Token, endToken: Token, source: Source) = this()
  
  /**
    * The character offset at which this Node ends.
    */
  val end: Double = js.native
  
  /**
    * The Token at which this Node ends.
    */
  val endToken: Token = js.native
  
  /**
    * The Source document the AST represents.
    */
  val source: Source = js.native
  
  /**
    * The character offset at which this Node begins.
    */
  val start: Double = js.native
  
  /**
    * The Token at which this Node begins.
    */
  val startToken: Token = js.native
  
  def toJSON(): End = js.native
}
