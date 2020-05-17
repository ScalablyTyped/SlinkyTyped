package typingsSlinky.activexLibreoffice.com_.sun.star.formula

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The formula properties provide access to the properties of a formula in a formula generator */
@js.native
trait FormulaProperties extends js.Object {
  /**
    * contains the alignment of the formula.
    * @see HorizontalAlignment
    */
  var Alignment: Double = js.native
  /**
    * contains the base font height in point the formula will be formatted in.
    *
    * All properties containing relative values are related to this value.
    */
  var BaseFontHeight: Double = js.native
  /**
    * contains the baselines offset in respect to the top of the formula rectangle
    * @since OOo 3.4
    */
  var BaseLine: Double = js.native
  /** contains the metric value of the bottom margin of the formula. */
  var BottomMargin: Double = js.native
  /** customized name for fixed font. */
  var CustomFontNameFixed: String = js.native
  /** customized name for sans serif font */
  var CustomFontNameSans: String = js.native
  /** customized name for serif font */
  var CustomFontNameSerif: String = js.native
  /** determines if the customized fixed font is bold. */
  var FontFixedIsBold: Boolean = js.native
  /** determines if the customized fixed font is italic. */
  var FontFixedIsItalic: Boolean = js.native
  /** determines if the font that is used to display functions is bold. */
  var FontFunctionsIsBold: Boolean = js.native
  /** determines if the font that is used to display functions is italic. */
  var FontFunctionsIsItalic: Boolean = js.native
  /** contains the name of the font that is used to display functions contained in the formula. */
  var FontNameFunctions: String = js.native
  /** contains the name of the font that is used to display numbers contained in the formula. */
  var FontNameNumbers: String = js.native
  /** contains the name of the font that is used to display text contained in the formula. */
  var FontNameText: String = js.native
  /** contains the name of the font that is used to display variables contained in the formula. */
  var FontNameVariables: String = js.native
  /** determines if the font that is used to display numbers is bold. */
  var FontNumbersIsBold: Boolean = js.native
  /** determines if the font that is used to display numbers is italic. */
  var FontNumbersIsItalic: Boolean = js.native
  /** determines if the customized sans serif font is bold. */
  var FontSansIsBold: Boolean = js.native
  /** determines if the customized sans serif font is italic. */
  var FontSansIsItalic: Boolean = js.native
  /** determines if the customized serif font is bold. */
  var FontSerifIsBold: Boolean = js.native
  /** determines if the customized serif font is italic. */
  var FontSerifIsItalic: Boolean = js.native
  /** determines if the font that is used to display text is bold. */
  var FontTextIsBold: Boolean = js.native
  /** determines if the font that is used to display text is italic. */
  var FontTextIsItalic: Boolean = js.native
  /** determines if the font that is used to display variables is bold. */
  var FontVariablesIsBold: Boolean = js.native
  /** determines if the font that is used to display variables is italic. */
  var FontVariablesIsItalic: Boolean = js.native
  /** contains the command string of the formula */
  var Formula: String = js.native
  /** decides if all brackets (even those without "left"/"right" modifier) are scaled. */
  var IsScaleAllBrackets: Boolean = js.native
  /** switches into text mode. */
  var IsTextMode: Boolean = js.native
  /** contains the metric value of the left margin of the formula. */
  var LeftMargin: Double = js.native
  /** contains the relative distance of brackets. */
  var RelativeBracketDistance: Double = js.native
  /** contains the relative excess size of brackets. */
  var RelativeBracketExcessSize: Double = js.native
  /**
    * contains the relative height of the font for functions.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightFunctions: Double = js.native
  /**
    * contains the relative height of the font for indices.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightIndices: Double = js.native
  /**
    * contains the relative height of the font for limits.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightLimits: Double = js.native
  /**
    * contains the relative height of the font for operators.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightOperators: Double = js.native
  /**
    * contains the relative height of the font for text.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightText: Double = js.native
  /** contains the relative excess length of a fraction bar. */
  var RelativeFractionBarExcessLength: Double = js.native
  /** contains the relative line weight of a fraction bar. */
  var RelativeFractionBarLineWeight: Double = js.native
  /** contains the relative depth of the denominator of a fraction */
  var RelativeFractionDenominatorDepth: Double = js.native
  /** contains the relative height of the numerator of a fraction. */
  var RelativeFractionNumeratorHeight: Double = js.native
  /** contains the relative superscript of indices. */
  var RelativeIndexSubscript: Double = js.native
  /** contains the relative subscript of indices. */
  var RelativeIndexSuperscript: Double = js.native
  /** contains the relative line spacing. */
  var RelativeLineSpacing: Double = js.native
  /** contains the relative distance of lower limits. */
  var RelativeLowerLimitDistance: Double = js.native
  /** contains the relative column spacing of matrices. */
  var RelativeMatrixColumnSpacing: Double = js.native
  /** contains the relative line spacing of matrices. */
  var RelativeMatrixLineSpacing: Double = js.native
  /** contains the relative excess of operators. */
  var RelativeOperatorExcessSize: Double = js.native
  /** contains the relative spacing of operators. */
  var RelativeOperatorSpacing: Double = js.native
  /** contains the relative root spacing */
  var RelativeRootSpacing: Double = js.native
  /** contains the relative scaling of the bracket excess. */
  var RelativeScaleBracketExcessSize: Double = js.native
  /** contains the relative spacing. */
  var RelativeSpacing: Double = js.native
  /** contains the relative minimum height of the formula. */
  var RelativeSymbolMinimumHeight: Double = js.native
  /** contains the relative primary height of symbols. */
  var RelativeSymbolPrimaryHeight: Double = js.native
  /** contains the relative distance of upper limits */
  var RelativeUpperLimitDistance: Double = js.native
  /** contains the metric value of the right margin of the formula. */
  var RightMargin: Double = js.native
  /** contains the metric value of the top margin of the formula. */
  var TopMargin: Double = js.native
}

object FormulaProperties {
  @scala.inline
  def apply(
    Alignment: Double,
    BaseFontHeight: Double,
    BaseLine: Double,
    BottomMargin: Double,
    CustomFontNameFixed: String,
    CustomFontNameSans: String,
    CustomFontNameSerif: String,
    FontFixedIsBold: Boolean,
    FontFixedIsItalic: Boolean,
    FontFunctionsIsBold: Boolean,
    FontFunctionsIsItalic: Boolean,
    FontNameFunctions: String,
    FontNameNumbers: String,
    FontNameText: String,
    FontNameVariables: String,
    FontNumbersIsBold: Boolean,
    FontNumbersIsItalic: Boolean,
    FontSansIsBold: Boolean,
    FontSansIsItalic: Boolean,
    FontSerifIsBold: Boolean,
    FontSerifIsItalic: Boolean,
    FontTextIsBold: Boolean,
    FontTextIsItalic: Boolean,
    FontVariablesIsBold: Boolean,
    FontVariablesIsItalic: Boolean,
    Formula: String,
    IsScaleAllBrackets: Boolean,
    IsTextMode: Boolean,
    LeftMargin: Double,
    RelativeBracketDistance: Double,
    RelativeBracketExcessSize: Double,
    RelativeFontHeightFunctions: Double,
    RelativeFontHeightIndices: Double,
    RelativeFontHeightLimits: Double,
    RelativeFontHeightOperators: Double,
    RelativeFontHeightText: Double,
    RelativeFractionBarExcessLength: Double,
    RelativeFractionBarLineWeight: Double,
    RelativeFractionDenominatorDepth: Double,
    RelativeFractionNumeratorHeight: Double,
    RelativeIndexSubscript: Double,
    RelativeIndexSuperscript: Double,
    RelativeLineSpacing: Double,
    RelativeLowerLimitDistance: Double,
    RelativeMatrixColumnSpacing: Double,
    RelativeMatrixLineSpacing: Double,
    RelativeOperatorExcessSize: Double,
    RelativeOperatorSpacing: Double,
    RelativeRootSpacing: Double,
    RelativeScaleBracketExcessSize: Double,
    RelativeSpacing: Double,
    RelativeSymbolMinimumHeight: Double,
    RelativeSymbolPrimaryHeight: Double,
    RelativeUpperLimitDistance: Double,
    RightMargin: Double,
    TopMargin: Double
  ): FormulaProperties = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], BaseFontHeight = BaseFontHeight.asInstanceOf[js.Any], BaseLine = BaseLine.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CustomFontNameFixed = CustomFontNameFixed.asInstanceOf[js.Any], CustomFontNameSans = CustomFontNameSans.asInstanceOf[js.Any], CustomFontNameSerif = CustomFontNameSerif.asInstanceOf[js.Any], FontFixedIsBold = FontFixedIsBold.asInstanceOf[js.Any], FontFixedIsItalic = FontFixedIsItalic.asInstanceOf[js.Any], FontFunctionsIsBold = FontFunctionsIsBold.asInstanceOf[js.Any], FontFunctionsIsItalic = FontFunctionsIsItalic.asInstanceOf[js.Any], FontNameFunctions = FontNameFunctions.asInstanceOf[js.Any], FontNameNumbers = FontNameNumbers.asInstanceOf[js.Any], FontNameText = FontNameText.asInstanceOf[js.Any], FontNameVariables = FontNameVariables.asInstanceOf[js.Any], FontNumbersIsBold = FontNumbersIsBold.asInstanceOf[js.Any], FontNumbersIsItalic = FontNumbersIsItalic.asInstanceOf[js.Any], FontSansIsBold = FontSansIsBold.asInstanceOf[js.Any], FontSansIsItalic = FontSansIsItalic.asInstanceOf[js.Any], FontSerifIsBold = FontSerifIsBold.asInstanceOf[js.Any], FontSerifIsItalic = FontSerifIsItalic.asInstanceOf[js.Any], FontTextIsBold = FontTextIsBold.asInstanceOf[js.Any], FontTextIsItalic = FontTextIsItalic.asInstanceOf[js.Any], FontVariablesIsBold = FontVariablesIsBold.asInstanceOf[js.Any], FontVariablesIsItalic = FontVariablesIsItalic.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], IsScaleAllBrackets = IsScaleAllBrackets.asInstanceOf[js.Any], IsTextMode = IsTextMode.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], RelativeBracketDistance = RelativeBracketDistance.asInstanceOf[js.Any], RelativeBracketExcessSize = RelativeBracketExcessSize.asInstanceOf[js.Any], RelativeFontHeightFunctions = RelativeFontHeightFunctions.asInstanceOf[js.Any], RelativeFontHeightIndices = RelativeFontHeightIndices.asInstanceOf[js.Any], RelativeFontHeightLimits = RelativeFontHeightLimits.asInstanceOf[js.Any], RelativeFontHeightOperators = RelativeFontHeightOperators.asInstanceOf[js.Any], RelativeFontHeightText = RelativeFontHeightText.asInstanceOf[js.Any], RelativeFractionBarExcessLength = RelativeFractionBarExcessLength.asInstanceOf[js.Any], RelativeFractionBarLineWeight = RelativeFractionBarLineWeight.asInstanceOf[js.Any], RelativeFractionDenominatorDepth = RelativeFractionDenominatorDepth.asInstanceOf[js.Any], RelativeFractionNumeratorHeight = RelativeFractionNumeratorHeight.asInstanceOf[js.Any], RelativeIndexSubscript = RelativeIndexSubscript.asInstanceOf[js.Any], RelativeIndexSuperscript = RelativeIndexSuperscript.asInstanceOf[js.Any], RelativeLineSpacing = RelativeLineSpacing.asInstanceOf[js.Any], RelativeLowerLimitDistance = RelativeLowerLimitDistance.asInstanceOf[js.Any], RelativeMatrixColumnSpacing = RelativeMatrixColumnSpacing.asInstanceOf[js.Any], RelativeMatrixLineSpacing = RelativeMatrixLineSpacing.asInstanceOf[js.Any], RelativeOperatorExcessSize = RelativeOperatorExcessSize.asInstanceOf[js.Any], RelativeOperatorSpacing = RelativeOperatorSpacing.asInstanceOf[js.Any], RelativeRootSpacing = RelativeRootSpacing.asInstanceOf[js.Any], RelativeScaleBracketExcessSize = RelativeScaleBracketExcessSize.asInstanceOf[js.Any], RelativeSpacing = RelativeSpacing.asInstanceOf[js.Any], RelativeSymbolMinimumHeight = RelativeSymbolMinimumHeight.asInstanceOf[js.Any], RelativeSymbolPrimaryHeight = RelativeSymbolPrimaryHeight.asInstanceOf[js.Any], RelativeUpperLimitDistance = RelativeUpperLimitDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaProperties]
  }
  @scala.inline
  implicit class FormulaPropertiesOps[Self <: FormulaProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseFontHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseFontHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFontNameFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomFontNameFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFontNameSans(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomFontNameSans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFontNameSerif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomFontNameSerif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFixedIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontFixedIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFixedIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontFixedIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFunctionsIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontFunctionsIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFunctionsIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontFunctionsIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNameFunctions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNameFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNameNumbers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNameNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNameText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNameText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNameVariables(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNameVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNumbersIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNumbersIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontNumbersIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontNumbersIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSansIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSansIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSansIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSansIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSerifIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSerifIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSerifIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSerifIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontTextIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontTextIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontTextIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontTextIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontVariablesIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontVariablesIsBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontVariablesIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontVariablesIsItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScaleAllBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsScaleAllBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTextMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTextMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeBracketDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeBracketDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeBracketExcessSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeBracketExcessSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFontHeightFunctions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFontHeightFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFontHeightIndices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFontHeightIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFontHeightLimits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFontHeightLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFontHeightOperators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFontHeightOperators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFontHeightText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFontHeightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFractionBarExcessLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFractionBarExcessLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFractionBarLineWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFractionBarLineWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFractionDenominatorDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFractionDenominatorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFractionNumeratorHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFractionNumeratorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeIndexSubscript(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeIndexSubscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeIndexSuperscript(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeIndexSuperscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeLineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeLowerLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeLowerLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeMatrixColumnSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeMatrixColumnSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeMatrixLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeMatrixLineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeOperatorExcessSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeOperatorExcessSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeOperatorSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeOperatorSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeRootSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeRootSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeScaleBracketExcessSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeScaleBracketExcessSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeSymbolMinimumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeSymbolMinimumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeSymbolPrimaryHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeSymbolPrimaryHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeUpperLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeUpperLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

