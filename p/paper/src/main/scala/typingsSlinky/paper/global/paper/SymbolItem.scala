package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A symbol item represents an instance of a symbol which has been
  * placed in a Paper.js project.
  */
@JSGlobal("paper.SymbolItem")
@js.native
class SymbolItem protected ()
  extends typingsSlinky.paper.paper.SymbolItem {
  def this(definition: typingsSlinky.paper.paper.Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: typingsSlinky.paper.paper.SymbolDefinition) = this()
  def this(definition: typingsSlinky.paper.paper.Item, point: typingsSlinky.paper.paper.Point) = this()
  def this(definition: typingsSlinky.paper.paper.SymbolDefinition, point: typingsSlinky.paper.paper.Point) = this()
}

