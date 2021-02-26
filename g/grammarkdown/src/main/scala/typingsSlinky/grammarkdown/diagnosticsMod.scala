package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.anon.Detailed
import typingsSlinky.grammarkdown.anon.DetailedMessage
import typingsSlinky.grammarkdown.lineOffsetMapMod.LineOffsetMap
import typingsSlinky.grammarkdown.nodesMod.Node
import typingsSlinky.grammarkdown.nodesMod.SourceFile
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind
import typingsSlinky.grammarkdown.typesMod.Position
import typingsSlinky.grammarkdown.typesMod.Range
import typingsSlinky.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("grammarkdown/dist/diagnostics", "DiagnosticMessages")
  @js.native
  class DiagnosticMessages () extends StObject {
    def this(lineOffsetMap: LineOffsetMap) = this()
    
    var compareDiagnostics: js.Any = js.native
    
    def copyFrom(other: DiagnosticMessages): Unit = js.native
    
    def count(): Double = js.native
    
    var deduplicateDiagnostics: js.Any = js.native
    
    var detailedDiagnosticMessages: js.Any = js.native
    
    var diagnostics: js.Any = js.native
    
    var diagnosticsArguments: js.Any = js.native
    
    var diagnosticsLength: js.Any = js.native
    
    var diagnosticsNode: js.Any = js.native
    
    var diagnosticsPos: js.Any = js.native
    
    def forEach(callback: js.Function2[/* message */ String, /* diagnosticIndex */ Double, Unit]): Unit = js.native
    
    def getDiagnostic(diagnosticIndex: Double): js.UndefOr[Diagnostic] = js.native
    
    def getDiagnosticArguments(diagnosticIndex: Double): js.UndefOr[js.Array[_]] = js.native
    
    var getDiagnosticCode: js.Any = js.native
    
    var getDiagnosticErrorLevel: js.Any = js.native
    
    def getDiagnosticFilename(diagnosticIndex: Double): js.UndefOr[String] = js.native
    def getDiagnosticFilename(diagnosticIndex: Double, raw: Boolean): js.UndefOr[String] = js.native
    
    def getDiagnosticInfo(diagnosticIndex: Double): js.UndefOr[DiagnosticInfo] = js.native
    def getDiagnosticInfo(diagnosticIndex: Double, options: DetailedMessage): js.UndefOr[DiagnosticInfo] = js.native
    
    def getDiagnosticInfos(): js.Array[DiagnosticInfo] = js.native
    def getDiagnosticInfos(options: DetailedMessage): js.Array[DiagnosticInfo] = js.native
    
    def getDiagnosticInfosForSourceFile(sourceFile: SourceFile): js.Array[DiagnosticInfo] = js.native
    def getDiagnosticInfosForSourceFile(sourceFile: SourceFile, options: DetailedMessage): js.Array[DiagnosticInfo] = js.native
    
    var getDiagnosticLength: js.Any = js.native
    
    def getDiagnosticNode(diagnosticIndex: Double): js.UndefOr[Node[SyntaxKind]] = js.native
    
    var getDiagnosticPos: js.Any = js.native
    
    def getDiagnosticPosition(diagnosticIndex: Double): js.UndefOr[Position] = js.native
    def getDiagnosticPosition(diagnosticIndex: Double, raw: Boolean): js.UndefOr[Position] = js.native
    
    def getDiagnosticRange(diagnosticIndex: Double): js.UndefOr[Range] = js.native
    def getDiagnosticRange(diagnosticIndex: Double, raw: Boolean): js.UndefOr[Range] = js.native
    
    def getDiagnosticSourceFile(diagnosticIndex: Double): js.UndefOr[SourceFile] = js.native
    
    def getMessage(diagnosticIndex: Double): String = js.native
    def getMessage(diagnosticIndex: Double, options: Detailed): String = js.native
    
    var getSortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[js.UndefOr[DiagnosticInfo], Unit, _]] = js.native
    
    var lineOffsetMap: js.Any = js.native
    
    def report(pos: Double, message: Diagnostic, args: js.Any*): Unit = js.native
    
    var reportDiagnostic: js.Any = js.native
    
    def reportNode(sourceFile: js.UndefOr[scala.Nothing], node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
    def reportNode(sourceFile: SourceFile, node: Node[SyntaxKind], message: Diagnostic, args: js.Any*): Unit = js.native
    
    def setSourceFile(sourceFile: SourceFile): Unit = js.native
    
    var simpleDiagnosticMessages: js.Any = js.native
    
    def size: Double = js.native
    
    var sortDiagnostics: js.Any = js.native
    
    var sortedAndDeduplicatedDiagnosticIndices: js.Any = js.native
    
    var sourceFiles: js.Any = js.native
    
    var sourceFilesDiagnosticOffset: js.Any = js.native
    
    def values(): Generator[js.UndefOr[DiagnosticInfo], Unit, _] = js.native
  }
  
  object Diagnostics {
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Argument_0_cannot_be_specified_multiple_times")
    @js.native
    def Argument0CannotBeSpecifiedMultipleTimes: Diagnostic = js.native
    
    @scala.inline
    def Argument0CannotBeSpecifiedMultipleTimes_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Argument_0_cannot_be_specified_multiple_times")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Cannot_find_name_0_")
    @js.native
    def CannotFindName0: Diagnostic = js.native
    
    @scala.inline
    def CannotFindName0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cannot_find_name_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Constant_expected")
    @js.native
    def ConstantExpected: Diagnostic = js.native
    
    @scala.inline
    def ConstantExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Digit_expected")
    @js.native
    def DigitExpected: Diagnostic = js.native
    
    @scala.inline
    def DigitExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Digit_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Duplicate_identifier_0_")
    @js.native
    def DuplicateIdentifier0: Diagnostic = js.native
    
    @scala.inline
    def DuplicateIdentifier0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplicate_identifier_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Duplicate_terminal_0_")
    @js.native
    def DuplicateTerminal0: Diagnostic = js.native
    
    @scala.inline
    def DuplicateTerminal0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Duplicate_terminal_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.HTML_trivia_not_allowed_here")
    @js.native
    def HTMLTriviaNotAllowedHere: Diagnostic = js.native
    
    @scala.inline
    def HTMLTriviaNotAllowedHere_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML_trivia_not_allowed_here")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Invalid_character")
    @js.native
    def InvalidCharacter: Diagnostic = js.native
    
    @scala.inline
    def InvalidCharacter_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid_character")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Invalid_escape_sequence")
    @js.native
    def InvalidEscapeSequence: Diagnostic = js.native
    
    @scala.inline
    def InvalidEscapeSequence_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid_escape_sequence")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Obsolete_0_")
    @js.native
    def Obsolete0: Diagnostic = js.native
    
    @scala.inline
    def Obsolete0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Obsolete_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Parameter_0_is_unused")
    @js.native
    def Parameter0IsUnused: Diagnostic = js.native
    
    @scala.inline
    def Parameter0IsUnused_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter_0_is_unused")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_0_does_not_have_a_parameter_named_1_")
    @js.native
    def Production0DoesNotHaveAParameterNamed1: Diagnostic = js.native
    
    @scala.inline
    def Production0DoesNotHaveAParameterNamed1_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_0_does_not_have_a_parameter_named_1_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_0_is_missing_parameter_1_All_definitions_of_production_0_must_specify_the_same_formal_parameters")
    @js.native
    def Production0IsMissingParameter1AllDefinitionsOfProduction0MustSpecifyTheSameFormalParameters: Diagnostic = js.native
    
    @scala.inline
    def Production0IsMissingParameter1AllDefinitionsOfProduction0MustSpecifyTheSameFormalParameters_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_0_is_missing_parameter_1_All_definitions_of_production_0_must_specify_the_same_formal_parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Production_expected")
    @js.native
    def ProductionExpected: Diagnostic = js.native
    
    @scala.inline
    def ProductionExpected_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Production_expected")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.There_is_no_argument_given_for_parameter_0_")
    @js.native
    def ThereIsNoArgumentGivenForParameter0: Diagnostic = js.native
    
    @scala.inline
    def ThereIsNoArgumentGivenForParameter0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("There_is_no_argument_given_for_parameter_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unexpected_token_0_")
    @js.native
    def UnexpectedToken0: Diagnostic = js.native
    
    @scala.inline
    def UnexpectedToken0_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unexpected_token_0_")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unterminated_identifier_literal")
    @js.native
    def UnterminatedIdentifierLiteral: Diagnostic = js.native
    
    @scala.inline
    def UnterminatedIdentifierLiteral_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unterminated_identifier_literal")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics.Unterminated_string_literal")
    @js.native
    def UnterminatedStringLiteral: Diagnostic = js.native
    
    @scala.inline
    def UnterminatedStringLiteral_=(x: Diagnostic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unterminated_string_literal")(x.asInstanceOf[js.Any])
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics._0_expected")
    @js.native
    val `0Expected`: Diagnostic = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "Diagnostics._0_or_1_")
    @js.native
    val `0Or1`: Diagnostic = js.native
  }
  
  @JSImport("grammarkdown/dist/diagnostics", "LineMap")
  @js.native
  class LineMap protected () extends StObject {
    def this(text: String) = this()
    
    var computeLineStarts: js.Any = js.native
    
    def formatOffset(pos: Double): String = js.native
    
    def lineCount: Double = js.native
    
    var lineStarts: js.Any = js.native
    
    def offsetAt(position: Position): Double = js.native
    
    def positionAt(offset: Double): Position = js.native
    
    var text: js.Any = js.native
  }
  
  @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages")
  @js.native
  class NullDiagnosticMessages () extends DiagnosticMessages {
    def this(lineOffsetMap: LineOffsetMap) = this()
  }
  /* static members */
  object NullDiagnosticMessages {
    
    @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grammarkdown/dist/diagnostics", "NullDiagnosticMessages._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("grammarkdown/dist/diagnostics", "formatList")
  @js.native
  def formatList(tokens: js.Array[SyntaxKind | String]): String = js.native
  
  @JSImport("grammarkdown/dist/diagnostics", "formatString")
  @js.native
  def formatString(format: String): String = js.native
  @JSImport("grammarkdown/dist/diagnostics", "formatString")
  @js.native
  def formatString(format: String, args: js.Any*): String = js.native
  @JSImport("grammarkdown/dist/diagnostics", "formatString")
  @js.native
  def formatString(format: String, args: js.Array[_]): String = js.native
  
  @js.native
  trait Diagnostic extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
    
    var warning: js.UndefOr[Boolean] = js.native
  }
  object Diagnostic {
    
    @scala.inline
    def apply(code: Double, message: String): Diagnostic = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    @scala.inline
    implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait DiagnosticInfo extends StObject {
    
    var code: Double = js.native
    
    var diagnosticIndex: Double = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var formattedMessage: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var messageArguments: js.UndefOr[js.Array[_]] = js.native
    
    var node: js.UndefOr[Node[SyntaxKind]] = js.native
    
    var pos: Double = js.native
    
    var range: js.UndefOr[Range] = js.native
    
    var sourceFile: js.UndefOr[SourceFile] = js.native
    
    var warning: Boolean = js.native
  }
  object DiagnosticInfo {
    
    @scala.inline
    def apply(code: Double, diagnosticIndex: Double, message: String, pos: Double, warning: Boolean): DiagnosticInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticInfo]
    }
    
    @scala.inline
    implicit class DiagnosticInfoMutableBuilder[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticIndex(value: Double): Self = StObject.set(x, "diagnosticIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFormattedMessage(value: String): Self = StObject.set(x, "formattedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedMessageUndefined: Self = StObject.set(x, "formattedMessage", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageArguments(value: js.Array[_]): Self = StObject.set(x, "messageArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageArgumentsUndefined: Self = StObject.set(x, "messageArguments", js.undefined)
      
      @scala.inline
      def setMessageArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "messageArguments", js.Array(value :_*))
      
      @scala.inline
      def setNode(value: Node[SyntaxKind]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
