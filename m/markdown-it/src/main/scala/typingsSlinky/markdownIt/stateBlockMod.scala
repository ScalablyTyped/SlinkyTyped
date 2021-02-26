package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.tokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateBlockMod {
  
  @JSImport("markdown-it/lib/rules_block/state_block", JSImport.Namespace)
  @js.native
  class ^ protected () extends StateBlock {
    def this(src: String, md: MarkdownIt, env: js.Any, tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.markdownIt.markdownItStrings.blockquote
    - typingsSlinky.markdownIt.markdownItStrings.list
    - typingsSlinky.markdownIt.markdownItStrings.root
    - typingsSlinky.markdownIt.markdownItStrings.paragraph
    - typingsSlinky.markdownIt.markdownItStrings.reference
  */
  trait ParentType extends StObject
  object ParentType {
    
    @scala.inline
    def blockquote: typingsSlinky.markdownIt.markdownItStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.markdownIt.markdownItStrings.blockquote]
    
    @scala.inline
    def list: typingsSlinky.markdownIt.markdownItStrings.list = "list".asInstanceOf[typingsSlinky.markdownIt.markdownItStrings.list]
    
    @scala.inline
    def paragraph: typingsSlinky.markdownIt.markdownItStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.markdownIt.markdownItStrings.paragraph]
    
    @scala.inline
    def reference: typingsSlinky.markdownIt.markdownItStrings.reference = "reference".asInstanceOf[typingsSlinky.markdownIt.markdownItStrings.reference]
    
    @scala.inline
    def root: typingsSlinky.markdownIt.markdownItStrings.root = "root".asInstanceOf[typingsSlinky.markdownIt.markdownItStrings.root]
  }
  
  @js.native
  trait StateBlock extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typingsSlinky.markdownIt.tokenMod.^
      ] = js.native
    
    /**
      * line begin offsets for fast jumps
      */
    var bMarks: js.Array[Double] = js.native
    
    // block parser variables
    /**
      * required block content indent (for example, if we are
      * inside a list, it would be positioned after list marker)
      */
    var blkIndent: Double = js.native
    
    /**
      * An amount of virtual spaces (tabs expanded) between beginning
      * of each line (bMarks) and real beginning of that line.
      *
      * It exists only as a hack because blockquotes override bMarks
      * losing information in the process.
      *
      * It's used only when expanding tabs, you can think about it as
      * an initial tab length, e.g. bsCount=21 applied to string `\t123`
      * means first tab should be expanded to 4-21%4 === 3 spaces.
      */
    var bsCount: js.Array[Double] = js.native
    
    /**
      * indent of the current dd block (-1 if there isn't any)
      */
    var ddIndent: Double = js.native
    
    /**
      * line end offsets for fast jumps
      */
    var eMarks: js.Array[Double] = js.native
    
    var env: js.Any = js.native
    
    /**
      * cut lines range from source.
      */
    def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
    
    def isEmpty(line: Double): Boolean = js.native
    
    var level: Double = js.native
    
    /**
      * line index in src
      */
    var line: Double = js.native
    
    /**
      * lines count
      */
    var lineMax: Double = js.native
    
    /**
      * indent of the current list block (-1 if there isn't any)
      */
    var listIndent: Double = js.native
    
    /**
      * link to parser instance
      */
    var md: MarkdownIt = js.native
    
    /**
      * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
      * used in lists to determine if they interrupt a paragraph
      */
    var parentType: ParentType = js.native
    
    /**
      * Push new token to "stream".
      */
    def push(`type`: String, tag: String, nesting: Nesting): typingsSlinky.markdownIt.tokenMod.^ = js.native
    
    /**
      * renderer
      */
    var result: String = js.native
    
    /**
      * indents for each line (tabs expanded)
      */
    var sCount: js.Array[Double] = js.native
    
    /**
      * Skip char codes from given position
      */
    def skipChars(pos: Double, code: Double): Double = js.native
    
    /**
      * Skip char codes reverse from given position - 1
      */
    def skipCharsBack(pos: Double, code: Double, min: Double): Double = js.native
    
    def skipEmptyLines(from: Double): Double = js.native
    
    /**
      * Skip spaces from given position.
      */
    def skipSpaces(pos: Double): Double = js.native
    
    /**
      * Skip spaces from given position in reverse.
      */
    def skipSpacesBack(pos: Double, min: Double): Double = js.native
    
    var src: String = js.native
    
    /**
      * offsets of the first non-space characters (tabs not expanded)
      */
    var tShift: js.Array[Double] = js.native
    
    /**
      * loose/tight mode for lists
      */
    var tight: Boolean = js.native
    
    //
    // Internal state vartiables
    //
    var tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
  }
  object StateBlock {
    
    @scala.inline
    def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typingsSlinky.markdownIt.tokenMod.^
        ],
      bMarks: js.Array[Double],
      blkIndent: Double,
      bsCount: js.Array[Double],
      ddIndent: Double,
      eMarks: js.Array[Double],
      env: js.Any,
      getLines: (Double, Double, Double, Boolean) => String,
      isEmpty: Double => Boolean,
      level: Double,
      line: Double,
      lineMax: Double,
      listIndent: Double,
      md: MarkdownIt,
      parentType: ParentType,
      push: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^,
      result: String,
      sCount: js.Array[Double],
      skipChars: (Double, Double) => Double,
      skipCharsBack: (Double, Double, Double) => Double,
      skipEmptyLines: Double => Double,
      skipSpaces: Double => Double,
      skipSpacesBack: (Double, Double) => Double,
      src: String,
      tShift: js.Array[Double],
      tight: Boolean,
      tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]
    ): StateBlock = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], bsCount = bsCount.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], listIndent = listIndent.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), result = result.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipCharsBack = js.Any.fromFunction3(skipCharsBack), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), skipSpacesBack = js.Any.fromFunction2(skipSpacesBack), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateBlock]
    }
    
    @scala.inline
    implicit class StateBlockMutableBuilder[Self <: StateBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBMarks(value: js.Array[Double]): Self = StObject.set(x, "bMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBMarksVarargs(value: Double*): Self = StObject.set(x, "bMarks", js.Array(value :_*))
      
      @scala.inline
      def setBlkIndent(value: Double): Self = StObject.set(x, "blkIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsCount(value: js.Array[Double]): Self = StObject.set(x, "bsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsCountVarargs(value: Double*): Self = StObject.set(x, "bsCount", js.Array(value :_*))
      
      @scala.inline
      def setDdIndent(value: Double): Self = StObject.set(x, "ddIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEMarks(value: js.Array[Double]): Self = StObject.set(x, "eMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEMarksVarargs(value: Double*): Self = StObject.set(x, "eMarks", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLines(value: (Double, Double, Double, Boolean) => String): Self = StObject.set(x, "getLines", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIsEmpty(value: Double => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineMax(value: Double): Self = StObject.set(x, "lineMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListIndent(value: Double): Self = StObject.set(x, "listIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentType(value: ParentType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCount(value: js.Array[Double]): Self = StObject.set(x, "sCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCountVarargs(value: Double*): Self = StObject.set(x, "sCount", js.Array(value :_*))
      
      @scala.inline
      def setSkipChars(value: (Double, Double) => Double): Self = StObject.set(x, "skipChars", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkipCharsBack(value: (Double, Double, Double) => Double): Self = StObject.set(x, "skipCharsBack", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSkipEmptyLines(value: Double => Double): Self = StObject.set(x, "skipEmptyLines", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipSpaces(value: Double => Double): Self = StObject.set(x, "skipSpaces", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipSpacesBack(value: (Double, Double) => Double): Self = StObject.set(x, "skipSpacesBack", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTShift(value: js.Array[Double]): Self = StObject.set(x, "tShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTShiftVarargs(value: Double*): Self = StObject.set(x, "tShift", js.Array(value :_*))
      
      @scala.inline
      def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typingsSlinky.markdownIt.tokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: typingsSlinky.markdownIt.tokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value :_*))
    }
  }
}
