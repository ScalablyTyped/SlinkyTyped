package typingsSlinky.cliBox

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cliBox.anon.Fullscreen
import typingsSlinky.cliBox.anon.Height
import typingsSlinky.cliBox.anon.PartialMarks
import typingsSlinky.cliBox.cliBoxStrings.bottom
import typingsSlinky.cliBox.cliBoxStrings.center
import typingsSlinky.cliBox.cliBoxStrings.left
import typingsSlinky.cliBox.cliBoxStrings.middle
import typingsSlinky.cliBox.cliBoxStrings.right
import typingsSlinky.cliBox.cliBoxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-box", JSImport.Namespace)
  @js.native
  val ^ : BoxConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cli-box", JSImport.Namespace)
  @js.native
  class Class protected () extends Box {
    def this(options: String) = this()
    def this(options: Options) = this()
    def this(options: String, text: String) = this()
    def this(options: String, text: Text) = this()
    def this(options: Options, text: String) = this()
    def this(options: Options, text: Text) = this()
  }
  
  @js.native
  trait Box extends StObject {
    
    var options: Fullscreen = js.native
    
    var settings: Height = js.native
    
    def stringify(): String = js.native
  }
  object Box {
    
    @scala.inline
    def apply(options: Fullscreen, settings: Height, stringify: () => String): Box = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Fullscreen): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Height): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: () => String): Self = StObject.set(x, "stringify", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BoxConstructor
    extends Instantiable1[(/* options */ Options) | (/* options */ String), Box]
       with Instantiable2[
          (/* options */ Options) | (/* options */ String), 
          (/* text */ String) | (/* text */ Text), 
          Box
        ] {
    
    def apply(options: String): Box = js.native
    def apply(options: String, text: String): Box = js.native
    def apply(options: String, text: Text): Box = js.native
    def apply(options: Options): Box = js.native
    def apply(options: Options, text: String): Box = js.native
    def apply(options: Options, text: Text): Box = js.native
    
    var defaults: typingsSlinky.cliBox.anon.Marks = js.native
  }
  
  /* Inlined std.Record<cli-box.cli-box.MarksKeys, string> */
  @js.native
  trait Marks extends StObject {
    
    var b: String = js.native
    
    var e: String = js.native
    
    var n: String = js.native
    
    @JSName("ne")
    var ne_FMarks: String = js.native
    
    var nw: String = js.native
    
    var s: String = js.native
    
    var se: String = js.native
    
    var sw: String = js.native
    
    var w: String = js.native
  }
  object Marks {
    
    @scala.inline
    def apply(
      b: String,
      e: String,
      n: String,
      ne_ : String,
      nw: String,
      s: String,
      se: String,
      sw: String,
      w: String
    ): Marks = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marks]
    }
    
    @scala.inline
    implicit class MarksMutableBuilder[Self <: Marks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cliBox.cliBoxStrings.nw
    - typingsSlinky.cliBox.cliBoxStrings.n
    - typingsSlinky.cliBox.cliBoxStrings.ne
    - typingsSlinky.cliBox.cliBoxStrings.e
    - typingsSlinky.cliBox.cliBoxStrings.se
    - typingsSlinky.cliBox.cliBoxStrings.s
    - typingsSlinky.cliBox.cliBoxStrings.sw
    - typingsSlinky.cliBox.cliBoxStrings.w
    - typingsSlinky.cliBox.cliBoxStrings.b
  */
  trait MarksKeys extends StObject
  object MarksKeys {
    
    @scala.inline
    def b: typingsSlinky.cliBox.cliBoxStrings.b = "b".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.b]
    
    @scala.inline
    def e: typingsSlinky.cliBox.cliBoxStrings.e = "e".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.e]
    
    @scala.inline
    def n: typingsSlinky.cliBox.cliBoxStrings.n = "n".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.n]
    
    @scala.inline
    def ne: typingsSlinky.cliBox.cliBoxStrings.ne = "ne".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.ne]
    
    @scala.inline
    def nw: typingsSlinky.cliBox.cliBoxStrings.nw = "nw".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.nw]
    
    @scala.inline
    def s: typingsSlinky.cliBox.cliBoxStrings.s = "s".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.s]
    
    @scala.inline
    def se: typingsSlinky.cliBox.cliBoxStrings.se = "se".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.se]
    
    @scala.inline
    def sw: typingsSlinky.cliBox.cliBoxStrings.sw = "sw".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.sw]
    
    @scala.inline
    def w: typingsSlinky.cliBox.cliBoxStrings.w = "w".asInstanceOf[typingsSlinky.cliBox.cliBoxStrings.w]
  }
  
  @js.native
  trait Options extends StObject {
    
    var fullscreen: js.UndefOr[Boolean] = js.native
    
    var h: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var marks: js.UndefOr[PartialMarks] = js.native
    
    var stringify: js.UndefOr[Boolean] = js.native
    
    var w: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMarks(value: PartialMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var autoEOL: js.UndefOr[Boolean] = js.native
    
    var hAlign: js.UndefOr[left | middle | right] = js.native
    
    var stretch: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var vAlign: js.UndefOr[top | center | bottom] = js.native
  }
  object Text {
    
    @scala.inline
    def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEOL(value: Boolean): Self = StObject.set(x, "autoEOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEOLUndefined: Self = StObject.set(x, "autoEOL", js.undefined)
      
      @scala.inline
      def setHAlign(value: left | middle | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVAlign(value: top | center | bottom): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  type _To = BoxConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BoxConstructor = ^
}
