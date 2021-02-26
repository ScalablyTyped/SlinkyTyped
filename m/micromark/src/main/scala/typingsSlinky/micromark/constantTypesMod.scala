package typingsSlinky.micromark

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.micromark.micromarkStrings.atxHeading
import typingsSlinky.micromark.micromarkStrings.atxHeadingSequence
import typingsSlinky.micromark.micromarkStrings.atxHeadingText
import typingsSlinky.micromark.micromarkStrings.autolink
import typingsSlinky.micromark.micromarkStrings.autolinkEmail
import typingsSlinky.micromark.micromarkStrings.autolinkMarker
import typingsSlinky.micromark.micromarkStrings.autolinkProtocol
import typingsSlinky.micromark.micromarkStrings.blockQuote
import typingsSlinky.micromark.micromarkStrings.blockQuoteMarker
import typingsSlinky.micromark.micromarkStrings.blockQuotePrefix
import typingsSlinky.micromark.micromarkStrings.blockQuotePrefixWhitespace
import typingsSlinky.micromark.micromarkStrings.characterEscape
import typingsSlinky.micromark.micromarkStrings.characterEscapeValue
import typingsSlinky.micromark.micromarkStrings.characterReference
import typingsSlinky.micromark.micromarkStrings.characterReferenceMarker
import typingsSlinky.micromark.micromarkStrings.characterReferenceMarkerHexadecimal
import typingsSlinky.micromark.micromarkStrings.characterReferenceMarkerNumeric
import typingsSlinky.micromark.micromarkStrings.characterReferenceValue
import typingsSlinky.micromark.micromarkStrings.chunkContent
import typingsSlinky.micromark.micromarkStrings.chunkFlow
import typingsSlinky.micromark.micromarkStrings.chunkString
import typingsSlinky.micromark.micromarkStrings.chunkText
import typingsSlinky.micromark.micromarkStrings.codeFenced
import typingsSlinky.micromark.micromarkStrings.codeFencedFence
import typingsSlinky.micromark.micromarkStrings.codeFencedFenceInfo
import typingsSlinky.micromark.micromarkStrings.codeFencedFenceMeta
import typingsSlinky.micromark.micromarkStrings.codeFencedFenceSequence
import typingsSlinky.micromark.micromarkStrings.codeFlowValue
import typingsSlinky.micromark.micromarkStrings.codeIndented
import typingsSlinky.micromark.micromarkStrings.codeText
import typingsSlinky.micromark.micromarkStrings.codeTextData
import typingsSlinky.micromark.micromarkStrings.codeTextPadding
import typingsSlinky.micromark.micromarkStrings.codeTextSequence
import typingsSlinky.micromark.micromarkStrings.content
import typingsSlinky.micromark.micromarkStrings.data
import typingsSlinky.micromark.micromarkStrings.definition
import typingsSlinky.micromark.micromarkStrings.definitionDestination
import typingsSlinky.micromark.micromarkStrings.definitionDestinationLiteral
import typingsSlinky.micromark.micromarkStrings.definitionDestinationLiteralMarker
import typingsSlinky.micromark.micromarkStrings.definitionDestinationRaw
import typingsSlinky.micromark.micromarkStrings.definitionDestinationString
import typingsSlinky.micromark.micromarkStrings.definitionLabel
import typingsSlinky.micromark.micromarkStrings.definitionLabelMarker
import typingsSlinky.micromark.micromarkStrings.definitionLabelString
import typingsSlinky.micromark.micromarkStrings.definitionMarker
import typingsSlinky.micromark.micromarkStrings.definitionTitle
import typingsSlinky.micromark.micromarkStrings.definitionTitleMarker
import typingsSlinky.micromark.micromarkStrings.definitionTitleString
import typingsSlinky.micromark.micromarkStrings.emphasis
import typingsSlinky.micromark.micromarkStrings.emphasisSequence
import typingsSlinky.micromark.micromarkStrings.emphasisText
import typingsSlinky.micromark.micromarkStrings.escapeMarker
import typingsSlinky.micromark.micromarkStrings.hardBreakEscape
import typingsSlinky.micromark.micromarkStrings.hardBreakTrailing
import typingsSlinky.micromark.micromarkStrings.htmlFlow
import typingsSlinky.micromark.micromarkStrings.htmlFlowData
import typingsSlinky.micromark.micromarkStrings.htmlText
import typingsSlinky.micromark.micromarkStrings.htmlTextData
import typingsSlinky.micromark.micromarkStrings.image
import typingsSlinky.micromark.micromarkStrings.label
import typingsSlinky.micromark.micromarkStrings.labelEnd
import typingsSlinky.micromark.micromarkStrings.labelImage
import typingsSlinky.micromark.micromarkStrings.labelImageMarker
import typingsSlinky.micromark.micromarkStrings.labelLink
import typingsSlinky.micromark.micromarkStrings.labelMarker
import typingsSlinky.micromark.micromarkStrings.labelText
import typingsSlinky.micromark.micromarkStrings.lineEnding
import typingsSlinky.micromark.micromarkStrings.lineEndingBlank
import typingsSlinky.micromark.micromarkStrings.linePrefix
import typingsSlinky.micromark.micromarkStrings.lineSuffix
import typingsSlinky.micromark.micromarkStrings.link
import typingsSlinky.micromark.micromarkStrings.listItemIndent
import typingsSlinky.micromark.micromarkStrings.listItemMarker
import typingsSlinky.micromark.micromarkStrings.listItemPrefix
import typingsSlinky.micromark.micromarkStrings.listItemPrefixWhitespace
import typingsSlinky.micromark.micromarkStrings.listItemValue
import typingsSlinky.micromark.micromarkStrings.listOrdered
import typingsSlinky.micromark.micromarkStrings.listUnordered
import typingsSlinky.micromark.micromarkStrings.paragraph
import typingsSlinky.micromark.micromarkStrings.reference
import typingsSlinky.micromark.micromarkStrings.referenceMarker
import typingsSlinky.micromark.micromarkStrings.referenceString
import typingsSlinky.micromark.micromarkStrings.resource
import typingsSlinky.micromark.micromarkStrings.resourceDestination
import typingsSlinky.micromark.micromarkStrings.resourceDestinationLiteral
import typingsSlinky.micromark.micromarkStrings.resourceDestinationLiteralMarker
import typingsSlinky.micromark.micromarkStrings.resourceDestinationRaw
import typingsSlinky.micromark.micromarkStrings.resourceDestinationString
import typingsSlinky.micromark.micromarkStrings.resourceMarker
import typingsSlinky.micromark.micromarkStrings.resourceTitle
import typingsSlinky.micromark.micromarkStrings.resourceTitleMarker
import typingsSlinky.micromark.micromarkStrings.resourceTitleString
import typingsSlinky.micromark.micromarkStrings.setextHeading
import typingsSlinky.micromark.micromarkStrings.setextHeadingLine
import typingsSlinky.micromark.micromarkStrings.setextHeadingLineSequence
import typingsSlinky.micromark.micromarkStrings.setextHeadingText
import typingsSlinky.micromark.micromarkStrings.strong
import typingsSlinky.micromark.micromarkStrings.strongSequence
import typingsSlinky.micromark.micromarkStrings.strongText
import typingsSlinky.micromark.micromarkStrings.thematicBreak
import typingsSlinky.micromark.micromarkStrings.thematicBreakSequence
import typingsSlinky.micromark.micromarkStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantTypesMod extends Shortcut {
  
  @JSImport("micromark/lib/constant/types", JSImport.Default)
  @js.native
  val default: Types = js.native
  
  type Type = String
  
  @js.native
  trait Types extends StObject {
    
    var atxHeading: typingsSlinky.micromark.micromarkStrings.atxHeading = js.native
    
    var atxHeadingSequence: typingsSlinky.micromark.micromarkStrings.atxHeadingSequence = js.native
    
    var atxHeadingText: typingsSlinky.micromark.micromarkStrings.atxHeadingText = js.native
    
    var autolink: typingsSlinky.micromark.micromarkStrings.autolink = js.native
    
    var autolinkEmail: typingsSlinky.micromark.micromarkStrings.autolinkEmail = js.native
    
    var autolinkMarker: typingsSlinky.micromark.micromarkStrings.autolinkMarker = js.native
    
    var autolinkProtocol: typingsSlinky.micromark.micromarkStrings.autolinkProtocol = js.native
    
    var blockQuote: typingsSlinky.micromark.micromarkStrings.blockQuote = js.native
    
    var blockQuoteMarker: typingsSlinky.micromark.micromarkStrings.blockQuoteMarker = js.native
    
    var blockQuotePrefix: typingsSlinky.micromark.micromarkStrings.blockQuotePrefix = js.native
    
    var blockQuotePrefixWhitespace: typingsSlinky.micromark.micromarkStrings.blockQuotePrefixWhitespace = js.native
    
    var characterEscape: typingsSlinky.micromark.micromarkStrings.characterEscape = js.native
    
    var characterEscapeValue: typingsSlinky.micromark.micromarkStrings.characterEscapeValue = js.native
    
    var characterReference: typingsSlinky.micromark.micromarkStrings.characterReference = js.native
    
    var characterReferenceMarker: typingsSlinky.micromark.micromarkStrings.characterReferenceMarker = js.native
    
    var characterReferenceMarkerHexadecimal: typingsSlinky.micromark.micromarkStrings.characterReferenceMarkerHexadecimal = js.native
    
    var characterReferenceMarkerNumeric: typingsSlinky.micromark.micromarkStrings.characterReferenceMarkerNumeric = js.native
    
    var characterReferenceValue: typingsSlinky.micromark.micromarkStrings.characterReferenceValue = js.native
    
    var chunkContent: typingsSlinky.micromark.micromarkStrings.chunkContent = js.native
    
    var chunkFlow: typingsSlinky.micromark.micromarkStrings.chunkFlow = js.native
    
    var chunkString: typingsSlinky.micromark.micromarkStrings.chunkString = js.native
    
    var chunkText: typingsSlinky.micromark.micromarkStrings.chunkText = js.native
    
    var codeFenced: typingsSlinky.micromark.micromarkStrings.codeFenced = js.native
    
    var codeFencedFence: typingsSlinky.micromark.micromarkStrings.codeFencedFence = js.native
    
    var codeFencedFenceInfo: typingsSlinky.micromark.micromarkStrings.codeFencedFenceInfo = js.native
    
    var codeFencedFenceMeta: typingsSlinky.micromark.micromarkStrings.codeFencedFenceMeta = js.native
    
    var codeFencedFenceSequence: typingsSlinky.micromark.micromarkStrings.codeFencedFenceSequence = js.native
    
    var codeFlowValue: typingsSlinky.micromark.micromarkStrings.codeFlowValue = js.native
    
    var codeIndented: typingsSlinky.micromark.micromarkStrings.codeIndented = js.native
    
    var codeText: typingsSlinky.micromark.micromarkStrings.codeText = js.native
    
    var codeTextData: typingsSlinky.micromark.micromarkStrings.codeTextData = js.native
    
    var codeTextPadding: typingsSlinky.micromark.micromarkStrings.codeTextPadding = js.native
    
    var codeTextSequence: typingsSlinky.micromark.micromarkStrings.codeTextSequence = js.native
    
    var content: typingsSlinky.micromark.micromarkStrings.content = js.native
    
    var data: typingsSlinky.micromark.micromarkStrings.data = js.native
    
    var definition: typingsSlinky.micromark.micromarkStrings.definition = js.native
    
    var definitionDestination: typingsSlinky.micromark.micromarkStrings.definitionDestination = js.native
    
    var definitionDestinationLiteral: typingsSlinky.micromark.micromarkStrings.definitionDestinationLiteral = js.native
    
    var definitionDestinationLiteralMarker: typingsSlinky.micromark.micromarkStrings.definitionDestinationLiteralMarker = js.native
    
    var definitionDestinationRaw: typingsSlinky.micromark.micromarkStrings.definitionDestinationRaw = js.native
    
    var definitionDestinationString: typingsSlinky.micromark.micromarkStrings.definitionDestinationString = js.native
    
    var definitionLabel: typingsSlinky.micromark.micromarkStrings.definitionLabel = js.native
    
    var definitionLabelMarker: typingsSlinky.micromark.micromarkStrings.definitionLabelMarker = js.native
    
    var definitionLabelString: typingsSlinky.micromark.micromarkStrings.definitionLabelString = js.native
    
    var definitionMarker: typingsSlinky.micromark.micromarkStrings.definitionMarker = js.native
    
    var definitionTitle: typingsSlinky.micromark.micromarkStrings.definitionTitle = js.native
    
    var definitionTitleMarker: typingsSlinky.micromark.micromarkStrings.definitionTitleMarker = js.native
    
    var definitionTitleString: typingsSlinky.micromark.micromarkStrings.definitionTitleString = js.native
    
    var emphasis: typingsSlinky.micromark.micromarkStrings.emphasis = js.native
    
    var emphasisSequence: typingsSlinky.micromark.micromarkStrings.emphasisSequence = js.native
    
    var emphasisText: typingsSlinky.micromark.micromarkStrings.emphasisText = js.native
    
    var escapeMarker: typingsSlinky.micromark.micromarkStrings.escapeMarker = js.native
    
    var hardBreakEscape: typingsSlinky.micromark.micromarkStrings.hardBreakEscape = js.native
    
    var hardBreakTrailing: typingsSlinky.micromark.micromarkStrings.hardBreakTrailing = js.native
    
    var htmlFlow: typingsSlinky.micromark.micromarkStrings.htmlFlow = js.native
    
    var htmlFlowData: typingsSlinky.micromark.micromarkStrings.htmlFlowData = js.native
    
    var htmlText: typingsSlinky.micromark.micromarkStrings.htmlText = js.native
    
    var htmlTextData: typingsSlinky.micromark.micromarkStrings.htmlTextData = js.native
    
    var image: typingsSlinky.micromark.micromarkStrings.image = js.native
    
    var label: typingsSlinky.micromark.micromarkStrings.label = js.native
    
    var labelEnd: typingsSlinky.micromark.micromarkStrings.labelEnd = js.native
    
    var labelImage: typingsSlinky.micromark.micromarkStrings.labelImage = js.native
    
    var labelImageMarker: typingsSlinky.micromark.micromarkStrings.labelImageMarker = js.native
    
    var labelLink: typingsSlinky.micromark.micromarkStrings.labelLink = js.native
    
    var labelMarker: typingsSlinky.micromark.micromarkStrings.labelMarker = js.native
    
    var labelText: typingsSlinky.micromark.micromarkStrings.labelText = js.native
    
    var lineEnding: typingsSlinky.micromark.micromarkStrings.lineEnding = js.native
    
    var lineEndingBlank: typingsSlinky.micromark.micromarkStrings.lineEndingBlank = js.native
    
    var linePrefix: typingsSlinky.micromark.micromarkStrings.linePrefix = js.native
    
    var lineSuffix: typingsSlinky.micromark.micromarkStrings.lineSuffix = js.native
    
    var link: typingsSlinky.micromark.micromarkStrings.link = js.native
    
    var listItemIndent: typingsSlinky.micromark.micromarkStrings.listItemIndent = js.native
    
    var listItemMarker: typingsSlinky.micromark.micromarkStrings.listItemMarker = js.native
    
    var listItemPrefix: typingsSlinky.micromark.micromarkStrings.listItemPrefix = js.native
    
    var listItemPrefixWhitespace: typingsSlinky.micromark.micromarkStrings.listItemPrefixWhitespace = js.native
    
    var listItemValue: typingsSlinky.micromark.micromarkStrings.listItemValue = js.native
    
    var listOrdered: typingsSlinky.micromark.micromarkStrings.listOrdered = js.native
    
    var listUnordered: typingsSlinky.micromark.micromarkStrings.listUnordered = js.native
    
    var paragraph: typingsSlinky.micromark.micromarkStrings.paragraph = js.native
    
    var reference: typingsSlinky.micromark.micromarkStrings.reference = js.native
    
    var referenceMarker: typingsSlinky.micromark.micromarkStrings.referenceMarker = js.native
    
    var referenceString: typingsSlinky.micromark.micromarkStrings.referenceString = js.native
    
    var resource: typingsSlinky.micromark.micromarkStrings.resource = js.native
    
    var resourceDestination: typingsSlinky.micromark.micromarkStrings.resourceDestination = js.native
    
    var resourceDestinationLiteral: typingsSlinky.micromark.micromarkStrings.resourceDestinationLiteral = js.native
    
    var resourceDestinationLiteralMarker: typingsSlinky.micromark.micromarkStrings.resourceDestinationLiteralMarker = js.native
    
    var resourceDestinationRaw: typingsSlinky.micromark.micromarkStrings.resourceDestinationRaw = js.native
    
    var resourceDestinationString: typingsSlinky.micromark.micromarkStrings.resourceDestinationString = js.native
    
    var resourceMarker: typingsSlinky.micromark.micromarkStrings.resourceMarker = js.native
    
    var resourceTitle: typingsSlinky.micromark.micromarkStrings.resourceTitle = js.native
    
    var resourceTitleMarker: typingsSlinky.micromark.micromarkStrings.resourceTitleMarker = js.native
    
    var resourceTitleString: typingsSlinky.micromark.micromarkStrings.resourceTitleString = js.native
    
    var setextHeading: typingsSlinky.micromark.micromarkStrings.setextHeading = js.native
    
    var setextHeadingLine: typingsSlinky.micromark.micromarkStrings.setextHeadingLine = js.native
    
    var setextHeadingLineSequence: typingsSlinky.micromark.micromarkStrings.setextHeadingLineSequence = js.native
    
    var setextHeadingText: typingsSlinky.micromark.micromarkStrings.setextHeadingText = js.native
    
    var strong: typingsSlinky.micromark.micromarkStrings.strong = js.native
    
    var strongSequence: typingsSlinky.micromark.micromarkStrings.strongSequence = js.native
    
    var strongText: typingsSlinky.micromark.micromarkStrings.strongText = js.native
    
    var thematicBreak: typingsSlinky.micromark.micromarkStrings.thematicBreak = js.native
    
    var thematicBreakSequence: typingsSlinky.micromark.micromarkStrings.thematicBreakSequence = js.native
    
    var whitespace: typingsSlinky.micromark.micromarkStrings.whitespace = js.native
  }
  object Types {
    
    @scala.inline
    def apply(
      atxHeading: atxHeading,
      atxHeadingSequence: atxHeadingSequence,
      atxHeadingText: atxHeadingText,
      autolink: autolink,
      autolinkEmail: autolinkEmail,
      autolinkMarker: autolinkMarker,
      autolinkProtocol: autolinkProtocol,
      blockQuote: blockQuote,
      blockQuoteMarker: blockQuoteMarker,
      blockQuotePrefix: blockQuotePrefix,
      blockQuotePrefixWhitespace: blockQuotePrefixWhitespace,
      characterEscape: characterEscape,
      characterEscapeValue: characterEscapeValue,
      characterReference: characterReference,
      characterReferenceMarker: characterReferenceMarker,
      characterReferenceMarkerHexadecimal: characterReferenceMarkerHexadecimal,
      characterReferenceMarkerNumeric: characterReferenceMarkerNumeric,
      characterReferenceValue: characterReferenceValue,
      chunkContent: chunkContent,
      chunkFlow: chunkFlow,
      chunkString: chunkString,
      chunkText: chunkText,
      codeFenced: codeFenced,
      codeFencedFence: codeFencedFence,
      codeFencedFenceInfo: codeFencedFenceInfo,
      codeFencedFenceMeta: codeFencedFenceMeta,
      codeFencedFenceSequence: codeFencedFenceSequence,
      codeFlowValue: codeFlowValue,
      codeIndented: codeIndented,
      codeText: codeText,
      codeTextData: codeTextData,
      codeTextPadding: codeTextPadding,
      codeTextSequence: codeTextSequence,
      content: content,
      data: data,
      definition: definition,
      definitionDestination: definitionDestination,
      definitionDestinationLiteral: definitionDestinationLiteral,
      definitionDestinationLiteralMarker: definitionDestinationLiteralMarker,
      definitionDestinationRaw: definitionDestinationRaw,
      definitionDestinationString: definitionDestinationString,
      definitionLabel: definitionLabel,
      definitionLabelMarker: definitionLabelMarker,
      definitionLabelString: definitionLabelString,
      definitionMarker: definitionMarker,
      definitionTitle: definitionTitle,
      definitionTitleMarker: definitionTitleMarker,
      definitionTitleString: definitionTitleString,
      emphasis: emphasis,
      emphasisSequence: emphasisSequence,
      emphasisText: emphasisText,
      escapeMarker: escapeMarker,
      hardBreakEscape: hardBreakEscape,
      hardBreakTrailing: hardBreakTrailing,
      htmlFlow: htmlFlow,
      htmlFlowData: htmlFlowData,
      htmlText: htmlText,
      htmlTextData: htmlTextData,
      image: image,
      label: label,
      labelEnd: labelEnd,
      labelImage: labelImage,
      labelImageMarker: labelImageMarker,
      labelLink: labelLink,
      labelMarker: labelMarker,
      labelText: labelText,
      lineEnding: lineEnding,
      lineEndingBlank: lineEndingBlank,
      linePrefix: linePrefix,
      lineSuffix: lineSuffix,
      link: link,
      listItemIndent: listItemIndent,
      listItemMarker: listItemMarker,
      listItemPrefix: listItemPrefix,
      listItemPrefixWhitespace: listItemPrefixWhitespace,
      listItemValue: listItemValue,
      listOrdered: listOrdered,
      listUnordered: listUnordered,
      paragraph: paragraph,
      reference: reference,
      referenceMarker: referenceMarker,
      referenceString: referenceString,
      resource: resource,
      resourceDestination: resourceDestination,
      resourceDestinationLiteral: resourceDestinationLiteral,
      resourceDestinationLiteralMarker: resourceDestinationLiteralMarker,
      resourceDestinationRaw: resourceDestinationRaw,
      resourceDestinationString: resourceDestinationString,
      resourceMarker: resourceMarker,
      resourceTitle: resourceTitle,
      resourceTitleMarker: resourceTitleMarker,
      resourceTitleString: resourceTitleString,
      setextHeading: setextHeading,
      setextHeadingLine: setextHeadingLine,
      setextHeadingLineSequence: setextHeadingLineSequence,
      setextHeadingText: setextHeadingText,
      strong: strong,
      strongSequence: strongSequence,
      strongText: strongText,
      thematicBreak: thematicBreak,
      thematicBreakSequence: thematicBreakSequence,
      whitespace: whitespace
    ): Types = {
      val __obj = js.Dynamic.literal(atxHeading = atxHeading.asInstanceOf[js.Any], atxHeadingSequence = atxHeadingSequence.asInstanceOf[js.Any], atxHeadingText = atxHeadingText.asInstanceOf[js.Any], autolink = autolink.asInstanceOf[js.Any], autolinkEmail = autolinkEmail.asInstanceOf[js.Any], autolinkMarker = autolinkMarker.asInstanceOf[js.Any], autolinkProtocol = autolinkProtocol.asInstanceOf[js.Any], blockQuote = blockQuote.asInstanceOf[js.Any], blockQuoteMarker = blockQuoteMarker.asInstanceOf[js.Any], blockQuotePrefix = blockQuotePrefix.asInstanceOf[js.Any], blockQuotePrefixWhitespace = blockQuotePrefixWhitespace.asInstanceOf[js.Any], characterEscape = characterEscape.asInstanceOf[js.Any], characterEscapeValue = characterEscapeValue.asInstanceOf[js.Any], characterReference = characterReference.asInstanceOf[js.Any], characterReferenceMarker = characterReferenceMarker.asInstanceOf[js.Any], characterReferenceMarkerHexadecimal = characterReferenceMarkerHexadecimal.asInstanceOf[js.Any], characterReferenceMarkerNumeric = characterReferenceMarkerNumeric.asInstanceOf[js.Any], characterReferenceValue = characterReferenceValue.asInstanceOf[js.Any], chunkContent = chunkContent.asInstanceOf[js.Any], chunkFlow = chunkFlow.asInstanceOf[js.Any], chunkString = chunkString.asInstanceOf[js.Any], chunkText = chunkText.asInstanceOf[js.Any], codeFenced = codeFenced.asInstanceOf[js.Any], codeFencedFence = codeFencedFence.asInstanceOf[js.Any], codeFencedFenceInfo = codeFencedFenceInfo.asInstanceOf[js.Any], codeFencedFenceMeta = codeFencedFenceMeta.asInstanceOf[js.Any], codeFencedFenceSequence = codeFencedFenceSequence.asInstanceOf[js.Any], codeFlowValue = codeFlowValue.asInstanceOf[js.Any], codeIndented = codeIndented.asInstanceOf[js.Any], codeText = codeText.asInstanceOf[js.Any], codeTextData = codeTextData.asInstanceOf[js.Any], codeTextPadding = codeTextPadding.asInstanceOf[js.Any], codeTextSequence = codeTextSequence.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], definitionDestination = definitionDestination.asInstanceOf[js.Any], definitionDestinationLiteral = definitionDestinationLiteral.asInstanceOf[js.Any], definitionDestinationLiteralMarker = definitionDestinationLiteralMarker.asInstanceOf[js.Any], definitionDestinationRaw = definitionDestinationRaw.asInstanceOf[js.Any], definitionDestinationString = definitionDestinationString.asInstanceOf[js.Any], definitionLabel = definitionLabel.asInstanceOf[js.Any], definitionLabelMarker = definitionLabelMarker.asInstanceOf[js.Any], definitionLabelString = definitionLabelString.asInstanceOf[js.Any], definitionMarker = definitionMarker.asInstanceOf[js.Any], definitionTitle = definitionTitle.asInstanceOf[js.Any], definitionTitleMarker = definitionTitleMarker.asInstanceOf[js.Any], definitionTitleString = definitionTitleString.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], emphasisSequence = emphasisSequence.asInstanceOf[js.Any], emphasisText = emphasisText.asInstanceOf[js.Any], escapeMarker = escapeMarker.asInstanceOf[js.Any], hardBreakEscape = hardBreakEscape.asInstanceOf[js.Any], hardBreakTrailing = hardBreakTrailing.asInstanceOf[js.Any], htmlFlow = htmlFlow.asInstanceOf[js.Any], htmlFlowData = htmlFlowData.asInstanceOf[js.Any], htmlText = htmlText.asInstanceOf[js.Any], htmlTextData = htmlTextData.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelEnd = labelEnd.asInstanceOf[js.Any], labelImage = labelImage.asInstanceOf[js.Any], labelImageMarker = labelImageMarker.asInstanceOf[js.Any], labelLink = labelLink.asInstanceOf[js.Any], labelMarker = labelMarker.asInstanceOf[js.Any], labelText = labelText.asInstanceOf[js.Any], lineEnding = lineEnding.asInstanceOf[js.Any], lineEndingBlank = lineEndingBlank.asInstanceOf[js.Any], linePrefix = linePrefix.asInstanceOf[js.Any], lineSuffix = lineSuffix.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], listItemIndent = listItemIndent.asInstanceOf[js.Any], listItemMarker = listItemMarker.asInstanceOf[js.Any], listItemPrefix = listItemPrefix.asInstanceOf[js.Any], listItemPrefixWhitespace = listItemPrefixWhitespace.asInstanceOf[js.Any], listItemValue = listItemValue.asInstanceOf[js.Any], listOrdered = listOrdered.asInstanceOf[js.Any], listUnordered = listUnordered.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceMarker = referenceMarker.asInstanceOf[js.Any], referenceString = referenceString.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceDestination = resourceDestination.asInstanceOf[js.Any], resourceDestinationLiteral = resourceDestinationLiteral.asInstanceOf[js.Any], resourceDestinationLiteralMarker = resourceDestinationLiteralMarker.asInstanceOf[js.Any], resourceDestinationRaw = resourceDestinationRaw.asInstanceOf[js.Any], resourceDestinationString = resourceDestinationString.asInstanceOf[js.Any], resourceMarker = resourceMarker.asInstanceOf[js.Any], resourceTitle = resourceTitle.asInstanceOf[js.Any], resourceTitleMarker = resourceTitleMarker.asInstanceOf[js.Any], resourceTitleString = resourceTitleString.asInstanceOf[js.Any], setextHeading = setextHeading.asInstanceOf[js.Any], setextHeadingLine = setextHeadingLine.asInstanceOf[js.Any], setextHeadingLineSequence = setextHeadingLineSequence.asInstanceOf[js.Any], setextHeadingText = setextHeadingText.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], strongSequence = strongSequence.asInstanceOf[js.Any], strongText = strongText.asInstanceOf[js.Any], thematicBreak = thematicBreak.asInstanceOf[js.Any], thematicBreakSequence = thematicBreakSequence.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtxHeading(value: atxHeading): Self = StObject.set(x, "atxHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtxHeadingSequence(value: atxHeadingSequence): Self = StObject.set(x, "atxHeadingSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtxHeadingText(value: atxHeadingText): Self = StObject.set(x, "atxHeadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolink(value: autolink): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolinkEmail(value: autolinkEmail): Self = StObject.set(x, "autolinkEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolinkMarker(value: autolinkMarker): Self = StObject.set(x, "autolinkMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolinkProtocol(value: autolinkProtocol): Self = StObject.set(x, "autolinkProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockQuote(value: blockQuote): Self = StObject.set(x, "blockQuote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockQuoteMarker(value: blockQuoteMarker): Self = StObject.set(x, "blockQuoteMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockQuotePrefix(value: blockQuotePrefix): Self = StObject.set(x, "blockQuotePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockQuotePrefixWhitespace(value: blockQuotePrefixWhitespace): Self = StObject.set(x, "blockQuotePrefixWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterEscape(value: characterEscape): Self = StObject.set(x, "characterEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterEscapeValue(value: characterEscapeValue): Self = StObject.set(x, "characterEscapeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReference(value: characterReference): Self = StObject.set(x, "characterReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReferenceMarker(value: characterReferenceMarker): Self = StObject.set(x, "characterReferenceMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReferenceMarkerHexadecimal(value: characterReferenceMarkerHexadecimal): Self = StObject.set(x, "characterReferenceMarkerHexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReferenceMarkerNumeric(value: characterReferenceMarkerNumeric): Self = StObject.set(x, "characterReferenceMarkerNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReferenceValue(value: characterReferenceValue): Self = StObject.set(x, "characterReferenceValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkContent(value: chunkContent): Self = StObject.set(x, "chunkContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkFlow(value: chunkFlow): Self = StObject.set(x, "chunkFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkString(value: chunkString): Self = StObject.set(x, "chunkString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkText(value: chunkText): Self = StObject.set(x, "chunkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFenced(value: codeFenced): Self = StObject.set(x, "codeFenced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFencedFence(value: codeFencedFence): Self = StObject.set(x, "codeFencedFence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFencedFenceInfo(value: codeFencedFenceInfo): Self = StObject.set(x, "codeFencedFenceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFencedFenceMeta(value: codeFencedFenceMeta): Self = StObject.set(x, "codeFencedFenceMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFencedFenceSequence(value: codeFencedFenceSequence): Self = StObject.set(x, "codeFencedFenceSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFlowValue(value: codeFlowValue): Self = StObject.set(x, "codeFlowValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeIndented(value: codeIndented): Self = StObject.set(x, "codeIndented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeText(value: codeText): Self = StObject.set(x, "codeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeTextData(value: codeTextData): Self = StObject.set(x, "codeTextData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeTextPadding(value: codeTextPadding): Self = StObject.set(x, "codeTextPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeTextSequence(value: codeTextSequence): Self = StObject.set(x, "codeTextSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinition(value: definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionDestination(value: definitionDestination): Self = StObject.set(x, "definitionDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionDestinationLiteral(value: definitionDestinationLiteral): Self = StObject.set(x, "definitionDestinationLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionDestinationLiteralMarker(value: definitionDestinationLiteralMarker): Self = StObject.set(x, "definitionDestinationLiteralMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionDestinationRaw(value: definitionDestinationRaw): Self = StObject.set(x, "definitionDestinationRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionDestinationString(value: definitionDestinationString): Self = StObject.set(x, "definitionDestinationString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionLabel(value: definitionLabel): Self = StObject.set(x, "definitionLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionLabelMarker(value: definitionLabelMarker): Self = StObject.set(x, "definitionLabelMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionLabelString(value: definitionLabelString): Self = StObject.set(x, "definitionLabelString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionMarker(value: definitionMarker): Self = StObject.set(x, "definitionMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionTitle(value: definitionTitle): Self = StObject.set(x, "definitionTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionTitleMarker(value: definitionTitleMarker): Self = StObject.set(x, "definitionTitleMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionTitleString(value: definitionTitleString): Self = StObject.set(x, "definitionTitleString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasis(value: emphasis): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasisSequence(value: emphasisSequence): Self = StObject.set(x, "emphasisSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasisText(value: emphasisText): Self = StObject.set(x, "emphasisText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeMarker(value: escapeMarker): Self = StObject.set(x, "escapeMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardBreakEscape(value: hardBreakEscape): Self = StObject.set(x, "hardBreakEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardBreakTrailing(value: hardBreakTrailing): Self = StObject.set(x, "hardBreakTrailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFlow(value: htmlFlow): Self = StObject.set(x, "htmlFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFlowData(value: htmlFlowData): Self = StObject.set(x, "htmlFlowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlText(value: htmlText): Self = StObject.set(x, "htmlText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTextData(value: htmlTextData): Self = StObject.set(x, "htmlTextData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelEnd(value: labelEnd): Self = StObject.set(x, "labelEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelImage(value: labelImage): Self = StObject.set(x, "labelImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelImageMarker(value: labelImageMarker): Self = StObject.set(x, "labelImageMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLink(value: labelLink): Self = StObject.set(x, "labelLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelMarker(value: labelMarker): Self = StObject.set(x, "labelMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelText(value: labelText): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEnding(value: lineEnding): Self = StObject.set(x, "lineEnding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEndingBlank(value: lineEndingBlank): Self = StObject.set(x, "lineEndingBlank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinePrefix(value: linePrefix): Self = StObject.set(x, "linePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSuffix(value: lineSuffix): Self = StObject.set(x, "lineSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemIndent(value: listItemIndent): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemMarker(value: listItemMarker): Self = StObject.set(x, "listItemMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemPrefix(value: listItemPrefix): Self = StObject.set(x, "listItemPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemPrefixWhitespace(value: listItemPrefixWhitespace): Self = StObject.set(x, "listItemPrefixWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemValue(value: listItemValue): Self = StObject.set(x, "listItemValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListOrdered(value: listOrdered): Self = StObject.set(x, "listOrdered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUnordered(value: listUnordered): Self = StObject.set(x, "listUnordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceMarker(value: referenceMarker): Self = StObject.set(x, "referenceMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceString(value: referenceString): Self = StObject.set(x, "referenceString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceDestination(value: resourceDestination): Self = StObject.set(x, "resourceDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceDestinationLiteral(value: resourceDestinationLiteral): Self = StObject.set(x, "resourceDestinationLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceDestinationLiteralMarker(value: resourceDestinationLiteralMarker): Self = StObject.set(x, "resourceDestinationLiteralMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceDestinationRaw(value: resourceDestinationRaw): Self = StObject.set(x, "resourceDestinationRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceDestinationString(value: resourceDestinationString): Self = StObject.set(x, "resourceDestinationString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceMarker(value: resourceMarker): Self = StObject.set(x, "resourceMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTitle(value: resourceTitle): Self = StObject.set(x, "resourceTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTitleMarker(value: resourceTitleMarker): Self = StObject.set(x, "resourceTitleMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTitleString(value: resourceTitleString): Self = StObject.set(x, "resourceTitleString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextHeading(value: setextHeading): Self = StObject.set(x, "setextHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextHeadingLine(value: setextHeadingLine): Self = StObject.set(x, "setextHeadingLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextHeadingLineSequence(value: setextHeadingLineSequence): Self = StObject.set(x, "setextHeadingLineSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextHeadingText(value: setextHeadingText): Self = StObject.set(x, "setextHeadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrong(value: strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongSequence(value: strongSequence): Self = StObject.set(x, "strongSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongText(value: strongText): Self = StObject.set(x, "strongText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThematicBreak(value: thematicBreak): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThematicBreakSequence(value: thematicBreakSequence): Self = StObject.set(x, "thematicBreakSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespace(value: whitespace): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Types
  
  /* This means you don't have to write `default`, but can instead just say `constantTypesMod.foo` */
  override def _to: Types = default
}
