package typingsSlinky.d3Tip

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.d3Array.mod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("d3", "tip")
  @js.native
  def tip(): Tooltip = js.native
  
  @js.native
  trait Tooltip extends StObject {
    
    def attr(name: String): String = js.native
    def attr(name: String, value: Primitive): Tooltip = js.native
    def attr[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def attr[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    
    def destroy(): Tooltip = js.native
    
    def direction(): TooltipDirection = js.native
    def direction(direction: TooltipDirection): Tooltip = js.native
    def direction[Datum](
      func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, TooltipDirection]
    ): Tooltip = js.native
    
    def hide(): Tooltip = js.native
    
    def html(): String = js.native
    def html(content: String): Tooltip = js.native
    def html[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, String]): Tooltip = js.native
    
    def offset(): js.Tuple2[Double, Double] = js.native
    def offset(tuple: js.Tuple2[Double, Double]): Tooltip = js.native
    def offset[Datum](
      func: js.Function3[
          /* datum */ Datum, 
          /* index */ Double, 
          /* outerIndex */ Double, 
          js.Tuple2[Double, Double]
        ]
    ): Tooltip = js.native
    
    def rootElement(): HTMLElement = js.native
    def rootElement(element: HTMLElement): Tooltip = js.native
    def rootElement[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, HTMLElement]): Tooltip = js.native
    
    def show(): Tooltip = js.native
    def show(target: SVGElement): Tooltip = js.native
    def show[Datum](data: js.Array[Datum]): Tooltip = js.native
    def show[Datum](data: js.Array[Datum], target: SVGElement): Tooltip = js.native
    
    def style(name: String): String = js.native
    def style(name: String, value: Primitive): Tooltip = js.native
    def style(name: String, value: Primitive, priority: String): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive],
      priority: String
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ],
      priority: String
    ): Tooltip = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.d3Tip.d3TipStrings.n
    - typingsSlinky.d3Tip.d3TipStrings.s
    - typingsSlinky.d3Tip.d3TipStrings.e
    - typingsSlinky.d3Tip.d3TipStrings.w
    - typingsSlinky.d3Tip.d3TipStrings.nw
    - typingsSlinky.d3Tip.d3TipStrings.ne
    - typingsSlinky.d3Tip.d3TipStrings.sw
    - typingsSlinky.d3Tip.d3TipStrings.se
  */
  trait TooltipDirection extends StObject
  object TooltipDirection {
    
    @scala.inline
    def e: typingsSlinky.d3Tip.d3TipStrings.e = "e".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.e]
    
    @scala.inline
    def n: typingsSlinky.d3Tip.d3TipStrings.n = "n".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.n]
    
    @scala.inline
    def ne: typingsSlinky.d3Tip.d3TipStrings.ne = "ne".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.ne]
    
    @scala.inline
    def nw: typingsSlinky.d3Tip.d3TipStrings.nw = "nw".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.nw]
    
    @scala.inline
    def s: typingsSlinky.d3Tip.d3TipStrings.s = "s".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.s]
    
    @scala.inline
    def se: typingsSlinky.d3Tip.d3TipStrings.se = "se".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.se]
    
    @scala.inline
    def sw: typingsSlinky.d3Tip.d3TipStrings.sw = "sw".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.sw]
    
    @scala.inline
    def w: typingsSlinky.d3Tip.d3TipStrings.w = "w".asInstanceOf[typingsSlinky.d3Tip.d3TipStrings.w]
  }
}
