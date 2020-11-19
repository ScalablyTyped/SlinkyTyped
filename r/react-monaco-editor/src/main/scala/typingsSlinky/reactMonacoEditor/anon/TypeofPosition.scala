package typingsSlinky.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.monacoEditor.mod.IPosition
import typingsSlinky.monacoEditor.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPosition extends Instantiable2[/* lineNumber */ Double, /* column */ Double, Position] {
  
  /**
    * A function that compares positions, useful for sorting
    */
  def compare(a: IPosition, b: IPosition): Double = js.native
  
  /**
    * Test if position `a` equals position `b`
    */
  def equals(): Boolean = js.native
  def equals(a: Null, b: IPosition): Boolean = js.native
  def equals(a: IPosition): Boolean = js.native
  def equals(a: IPosition, b: IPosition): Boolean = js.native
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be false.
    */
  def isBefore(a: IPosition, b: IPosition): Boolean = js.native
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be true.
    */
  def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = js.native
  
  /**
    * Test if `obj` is an `IPosition`.
    */
  def isIPosition(obj: js.Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = js.native
  
  /**
    * Create a `Position` from an `IPosition`.
    */
  def lift(pos: IPosition): Position = js.native
}
