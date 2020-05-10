package typingsSlinky.brace.mod

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenIterator extends js.Object {
  /**
    * Returns the current tokenized string.
    **/
  def getCurrentToken(): TokenInfo = js.native
  /**
    * Returns the current column.
    **/
  def getCurrentTokenColumn(): Double = js.native
  /**
    * Returns the current row.
    **/
  def getCurrentTokenRow(): Double = js.native
  /**
    * Tokenizes all the items from the current point to the row prior in the document.
    **/
  def stepBackward(): js.Array[String] = js.native
  /**
    * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
    **/
  def stepForward(): String = js.native
}

@JSImport("brace", "TokenIterator")
@js.native
object TokenIterator
  extends /**
  * Creates a new token iterator object. The inital token index is set to the provided row and column coordinates.
  * @param session The session to associate with
  * @param initialRow The row to start the tokenizing at
  * @param initialColumn The column to start the tokenizing at
  **/
Instantiable3[
      /* session */ IEditSession, 
      /* initialRow */ Double, 
      /* initialColumn */ Double, 
      TokenIterator
    ]

