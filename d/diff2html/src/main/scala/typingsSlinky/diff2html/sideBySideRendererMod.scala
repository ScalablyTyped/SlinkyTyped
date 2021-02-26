package typingsSlinky.diff2html

import typingsSlinky.diff2html.rematchMod.MatcherFn
import typingsSlinky.diff2html.renderUtilsMod.CSSLineClass
import typingsSlinky.diff2html.renderUtilsMod.RenderConfig
import typingsSlinky.diff2html.typesMod.DiffBlock
import typingsSlinky.diff2html.typesMod.DiffFile
import typingsSlinky.diff2html.typesMod.DiffLine
import typingsSlinky.diff2html.typesMod.DiffLineContent
import typingsSlinky.diff2html.typesMod.DiffLineContext
import typingsSlinky.diff2html.typesMod.DiffLineDeleted
import typingsSlinky.diff2html.typesMod.DiffLineInserted
import typingsSlinky.diff2html.typesMod.DiffStyleType
import typingsSlinky.diff2html.typesMod.LineMatchingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideBySideRendererMod {
  
  @JSImport("diff2html/lib/side-by-side-renderer", JSImport.Default)
  @js.native
  class default protected () extends SideBySideRenderer {
    def this(hoganUtils: typingsSlinky.diff2html.hoganjsUtilsMod.default) = this()
    def this(hoganUtils: typingsSlinky.diff2html.hoganjsUtilsMod.default, config: SideBySideRendererConfig) = this()
  }
  
  object defaultSideBySideRendererConfig {
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    @scala.inline
    def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    @scala.inline
    def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    @scala.inline
    def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    @scala.inline
    def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    @scala.inline
    def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    @scala.inline
    def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
  }
  
  type DiffLineGroups = js.Array[
    js.Tuple3[
      js.Array[DiffLineContext with DiffLineContent], 
      js.Array[DiffLineDeleted with DiffLineContent], 
      js.Array[DiffLineInserted with DiffLineContent]
    ]
  ]
  
  @js.native
  trait DiffPreparedLine extends StObject {
    
    var content: String = js.native
    
    var number: Double = js.native
    
    var prefix: String = js.native
    
    var `type`: CSSLineClass = js.native
  }
  object DiffPreparedLine {
    
    @scala.inline
    def apply(content: String, number: Double, prefix: String, `type`: CSSLineClass): DiffPreparedLine = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffPreparedLine]
    }
    
    @scala.inline
    implicit class DiffPreparedLineMutableBuilder[Self <: DiffPreparedLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CSSLineClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileHtml extends StObject {
    
    var left: String = js.native
    
    var right: String = js.native
  }
  object FileHtml {
    
    @scala.inline
    def apply(left: String, right: String): FileHtml = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileHtml]
    }
    
    @scala.inline
    implicit class FileHtmlMutableBuilder[Self <: FileHtml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SideBySideRenderer extends StObject {
    
    def applyLineGroupping(block: DiffBlock): DiffLineGroups = js.native
    
    def applyRematchMatching(oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine], matcher: MatcherFn[DiffLine]): js.Array[js.Array[js.Array[DiffLine]]] = js.native
    
    val config: js.Any = js.native
    
    def generateEmptyDiff(): FileHtml = js.native
    
    def generateFileHtml(file: DiffFile): FileHtml = js.native
    
    def generateLineHtml(): FileHtml = js.native
    def generateLineHtml(oldLine: js.UndefOr[scala.Nothing], newLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine, newLine: DiffPreparedLine): FileHtml = js.native
    
    def generateSingleHtml(): String = js.native
    def generateSingleHtml(line: DiffPreparedLine): String = js.native
    
    val hoganUtils: js.Any = js.native
    
    def makeFileDiffHtml(file: DiffFile, diffs: FileHtml): String = js.native
    
    def makeHeaderHtml(blockHeader: String): String = js.native
    
    def processChangedLines(isCombined: Boolean, oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine]): FileHtml = js.native
    
    def render(diffFiles: js.Array[DiffFile]): String = js.native
  }
  
  @js.native
  trait SideBySideRendererConfig extends RenderConfig {
    
    var matchingMaxComparisons: js.UndefOr[Double] = js.native
    
    var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.native
    
    var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.native
  }
  object SideBySideRendererConfig {
    
    @scala.inline
    def apply(): SideBySideRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideBySideRendererConfig]
    }
    
    @scala.inline
    implicit class SideBySideRendererConfigMutableBuilder[Self <: SideBySideRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchingMaxComparisons(value: Double): Self = StObject.set(x, "matchingMaxComparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchingMaxComparisonsUndefined: Self = StObject.set(x, "matchingMaxComparisons", js.undefined)
      
      @scala.inline
      def setMaxLineSizeInBlockForComparison(value: Double): Self = StObject.set(x, "maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineSizeInBlockForComparisonUndefined: Self = StObject.set(x, "maxLineSizeInBlockForComparison", js.undefined)
      
      @scala.inline
      def setRenderNothingWhenEmpty(value: Boolean): Self = StObject.set(x, "renderNothingWhenEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderNothingWhenEmptyUndefined: Self = StObject.set(x, "renderNothingWhenEmpty", js.undefined)
    }
  }
}
