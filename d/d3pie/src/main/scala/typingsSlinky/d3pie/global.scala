package typingsSlinky.d3pie

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.d3pie.d3pie.ID3PieChart
import typingsSlinky.d3pie.d3pie.ID3PieClass
import typingsSlinky.d3pie.d3pie.ID3PieOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object d3pie extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("d3pie")
    @js.native
    class ^ protected () extends ID3PieChart {
      def this(id: String, options: ID3PieOptions) = this()
      def this(id: HTMLElement, options: ID3PieOptions) = this()
    }
    
    @JSGlobal("d3pie")
    @js.native
    val ^ : ID3PieClass = js.native
    
    type _To = ID3PieClass
    
    /* This means you don't have to write `^`, but can instead just say `d3pie.foo` */
    override def _to: ID3PieClass = ^
  }
}
