package typingsSlinky.diff2html

import typingsSlinky.diff2html.anon.Content
import typingsSlinky.diff2html.typesMod.DiffFile
import typingsSlinky.diff2html.typesMod.DiffFileName
import typingsSlinky.diff2html.typesMod.DiffLineParts
import typingsSlinky.diff2html.typesMod.DiffStyleType
import typingsSlinky.diff2html.typesMod.LineMatchingType
import typingsSlinky.diff2html.typesMod.LineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderUtilsMod {
  
  @JSImport("diff2html/lib/render-utils", "deconstructLine")
  @js.native
  def deconstructLine(line: String, isCombined: Boolean): DiffLineParts = js.native
  @JSImport("diff2html/lib/render-utils", "deconstructLine")
  @js.native
  def deconstructLine(line: String, isCombined: Boolean, escape: Boolean): DiffLineParts = js.native
  
  object defaultRenderConfig {
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    @scala.inline
    def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    @scala.inline
    def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    @scala.inline
    def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    @scala.inline
    def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("diff2html/lib/render-utils", "diffHighlight")
  @js.native
  def diffHighlight(diffLine1: String, diffLine2: String, isCombined: Boolean): HighlightedLines = js.native
  @JSImport("diff2html/lib/render-utils", "diffHighlight")
  @js.native
  def diffHighlight(diffLine1: String, diffLine2: String, isCombined: Boolean, config: RenderConfig): HighlightedLines = js.native
  
  @JSImport("diff2html/lib/render-utils", "escapeForHtml")
  @js.native
  def escapeForHtml(str: String): String = js.native
  
  @JSImport("diff2html/lib/render-utils", "filenameDiff")
  @js.native
  def filenameDiff(file: DiffFileName): String = js.native
  
  @JSImport("diff2html/lib/render-utils", "getFileIcon")
  @js.native
  def getFileIcon(file: DiffFile): String = js.native
  
  @JSImport("diff2html/lib/render-utils", "getHtmlId")
  @js.native
  def getHtmlId(file: DiffFileName): String = js.native
  
  @JSImport("diff2html/lib/render-utils", "toCSSClass")
  @js.native
  def toCSSClass(lineType: LineType): CSSLineClass = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-ins`
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-del`
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-cntx`
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-info`
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-ins d2h-change`
    - typingsSlinky.diff2html.diff2htmlStrings.`d2h-del d2h-change`
  */
  trait CSSLineClass extends StObject
  
  @js.native
  trait HighlightedLines extends StObject {
    
    var newLine: Content = js.native
    
    var oldLine: Content = js.native
  }
  object HighlightedLines {
    
    @scala.inline
    def apply(newLine: Content, oldLine: Content): HighlightedLines = {
      val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any], oldLine = oldLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightedLines]
    }
    
    @scala.inline
    implicit class HighlightedLinesMutableBuilder[Self <: HighlightedLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewLine(value: Content): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldLine(value: Content): Self = StObject.set(x, "oldLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderConfig extends StObject {
    
    var diffStyle: js.UndefOr[DiffStyleType] = js.native
    
    var matchWordsThreshold: js.UndefOr[Double] = js.native
    
    var matching: js.UndefOr[LineMatchingType] = js.native
    
    var maxLineLengthHighlight: js.UndefOr[Double] = js.native
  }
  object RenderConfig {
    
    @scala.inline
    def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    @scala.inline
    implicit class RenderConfigMutableBuilder[Self <: RenderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffStyle(value: DiffStyleType): Self = StObject.set(x, "diffStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffStyleUndefined: Self = StObject.set(x, "diffStyle", js.undefined)
      
      @scala.inline
      def setMatchWordsThreshold(value: Double): Self = StObject.set(x, "matchWordsThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchWordsThresholdUndefined: Self = StObject.set(x, "matchWordsThreshold", js.undefined)
      
      @scala.inline
      def setMatching(value: LineMatchingType): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
      
      @scala.inline
      def setMaxLineLengthHighlight(value: Double): Self = StObject.set(x, "maxLineLengthHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineLengthHighlightUndefined: Self = StObject.set(x, "maxLineLengthHighlight", js.undefined)
    }
  }
}
