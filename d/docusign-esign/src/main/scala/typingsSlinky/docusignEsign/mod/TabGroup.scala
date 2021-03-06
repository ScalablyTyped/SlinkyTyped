package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabGroup extends StObject {
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.native
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are placed. When **true**, the text string in a document must match the case of the
    * `anchorString` property for an anchor tab to be created. The default value is **false**.
    *
    * For example, when set to **true**, if the anchor string is `DocuSign`, then `DocuSign` will match but `Docusign`, `docusign`, `DoCuSiGn`,
    * etc. will not match. When set to **false**, `DocuSign`, `Docusign`, `docusign`, `DoCuSiGn`, etc. will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    */
  var anchorCaseSensitive: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorCaseSensitive` property is editable.
    */
  var anchorCaseSensitiveMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are aligned in relation to the anchor text. Possible values are :
    *
    * - `left`: Aligns the left side of the tab with the beginning of the first character of the matching anchor word. This is the default value.
    * - `right`: Aligns the tab’s left side with the last character of the matching anchor word.
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.
    */
  var anchorHorizontalAlignmentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.
    */
  var anchorIgnoreIfNotPresentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the text string in a document must match the value of the `anchorString` property in its entirety for an [anchor tab][AnchorTab] to be created.
    * The default value is **false**.
    *
    * For example, when set to **true**, if the input is `man` then `man` will match but `manpower`, `fireman`, and `penmanship`
    * will not. When set to **false**, if the input is `man` then `man`, `manpower`, `fireman`, and `penmanship` will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTab]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorMatchWholeWord: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorMatchWholeWord` property is editable.
    */
  var anchorMatchWholeWordMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the string to find in the document and use as the basis for tab placement.
    */
  var anchorString: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorString` property is editable.
    */
  var anchorStringMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersion: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorUnits` property is editable.
    */
  var anchorUnitsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorXOffset` property is editable.
    */
  var anchorXOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorYOffset` property is editable.
    */
  var anchorYOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * For conditional fields this is the `tabLabel` of the parent tab that controls this tab's visibility.
    */
  var conditionalParentLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentLabel` property is editable.
    */
  var conditionalParentLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
    *
    * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use "on" as the value to show that the parent tab is active.
    *
    */
  var conditionalParentValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentValue` property is editable.
    */
  var conditionalParentValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The DocuSign-generated custom tab id for the custom tab to be applied. This can only be used when adding new tabs for a recipient.
    * When used, the new tab inherits all the custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `customTabId` property is editable.
    */
  var customTabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentId` property is editable.
    */
  var documentIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * An integer specifying the order in which the guided form HTML should render. The order is relative to the `formPageLabel`, the group by which to place the guided form HTML block.
    */
  var formOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formOrder` property is editable.
    */
  var formOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A string specifying the group in which to place the guided form HTML. Each group displays as a separate guided forms page in the signing experience.
    */
  var formPageLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formPageLabel` property is editable.
    */
  var formPageLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An integer specifying the order in which to present the guided form pages.
    */
  var formPageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fromPageNumber` property is editable.
    */
  var formPageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A unique identifier for a tab group. To assign a tab to the `tabGroup`, you assign the `TabGroupLabel` to the `tab.TabGroupLabels` array.
    */
  var groupLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `groupLabel` property is editable.
    */
  var groupLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The rule that is selected by default when a user is adding validation for a tab group in the UI.
    */
  var groupRule: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `groupRule` property is editable.
    */
  var groupRuleMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `height` property is editable.
    */
  var heightMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The maximum number of tabs within the `tabGroup` that should be checked, populated, or signed. This property is used for validation.
    */
  var maximumAllowed: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `maximumAllowed` property is editable.
    */
  var maximumAllowedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.native
  
  var mergeFieldXml: js.UndefOr[String] = js.native
  
  /**
    * The minimum number of of tabs within the `tabGroup` that should be checked, populated, or signed. This property is used for validation.
    */
  var minimumRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `minimumRequired` property is editable.
    */
  var minimumRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The page number being accessed.
    */
  var pageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientIdGuid` property is editable.
    */
  var recipientIdGuidMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `recipientId` property is editable.
    */
  var recipientIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var smartContractInformation: js.UndefOr[SmartContractInformation] = js.native
  
  /**
    * The status of the tab. Possible values are:
    *
    * - `active`: The tab is active, but the recipient has not yet interacted with it.
    * - `signed`: The recipient signed the tab.
    * - `declined`: The recipient declined the envelope.
    * - `na`: Used when the `status` property is not applicable to the tab type. (For example, a tab that has the `tabType` `SignerAttachmentOptional`).
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An array of tab group labels that uniquely identify tab groups. To assign a tab to a `tabGroup`, you assign the `TabGroupLabel` to the `Tab.TabGroupLabels` array.
    */
  var tabGroupLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `tabGroupLabels` property is editable.
    */
  var tabGroupLabelsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A positive integer that sets the order the tab is navigated to during signing.
    *
    * Tabs on a page are navigated to in ascending order, starting with the lowest number and moving to the highest.
    * If two or more tabs have the same `tabOrder` value, the normal auto-navigation setting behavior for the envelope is used.
    */
  var tabOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabOrder` property is editable.
    */
  var tabOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The scope of the tab group. Possible values are:
    *
    * - `document`
    * - `envelope` (default)
    */
  var tabScope: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabScope` property is editable.
    */
  var tabScopeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Indicates the type of tab (for example, `signHere` or `initialHere`).
    */
  var tabType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabType` property is editable.
    */
  var tabTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateLocked` property is editable.
    */
  var templateLockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateRequired` property is editable.
    */
  var templateRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `toolTip` property is editable.
    */
  var toolTipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * The message displayed if the custom tab fails input validation (either custom of embedded).
    */
  var validationMessage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationMessage` property is editable.
    */
  var validationMessageMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `width` property is editable.
    */
  var widthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `xPosition` property is editable.
    */
  var xPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `yPosition` property is editable.
    */
  var yPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object TabGroup {
  
  @scala.inline
  def apply(): TabGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabGroup]
  }
  
  @scala.inline
  implicit class TabGroupMutableBuilder[Self <: TabGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharacters(value: String): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersMetadataUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", js.undefined)
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitive(value: String): Self = StObject.set(x, "anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorCaseSensitiveMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorCaseSensitiveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorCaseSensitiveMetadataUndefined: Self = StObject.set(x, "anchorCaseSensitiveMetadata", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitiveUndefined: Self = StObject.set(x, "anchorCaseSensitive", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignment(value: String): Self = StObject.set(x, "anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorHorizontalAlignmentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorHorizontalAlignmentMetadataUndefined: Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignmentUndefined: Self = StObject.set(x, "anchorHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresent(value: String): Self = StObject.set(x, "anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentMetadataUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresent", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWord(value: String): Self = StObject.set(x, "anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorMatchWholeWordMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorMatchWholeWordMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorMatchWholeWordMetadataUndefined: Self = StObject.set(x, "anchorMatchWholeWordMetadata", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWordUndefined: Self = StObject.set(x, "anchorMatchWholeWord", js.undefined)
    
    @scala.inline
    def setAnchorString(value: String): Self = StObject.set(x, "anchorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorStringMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorStringMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorStringMetadataUndefined: Self = StObject.set(x, "anchorStringMetadata", js.undefined)
    
    @scala.inline
    def setAnchorStringUndefined: Self = StObject.set(x, "anchorString", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersion(value: String): Self = StObject.set(x, "anchorTabProcessorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTabProcessorVersionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorTabProcessorVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTabProcessorVersionMetadataUndefined: Self = StObject.set(x, "anchorTabProcessorVersionMetadata", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersionUndefined: Self = StObject.set(x, "anchorTabProcessorVersion", js.undefined)
    
    @scala.inline
    def setAnchorUnits(value: String): Self = StObject.set(x, "anchorUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUnitsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorUnitsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUnitsMetadataUndefined: Self = StObject.set(x, "anchorUnitsMetadata", js.undefined)
    
    @scala.inline
    def setAnchorUnitsUndefined: Self = StObject.set(x, "anchorUnits", js.undefined)
    
    @scala.inline
    def setAnchorXOffset(value: String): Self = StObject.set(x, "anchorXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorXOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXOffsetMetadataUndefined: Self = StObject.set(x, "anchorXOffsetMetadata", js.undefined)
    
    @scala.inline
    def setAnchorXOffsetUndefined: Self = StObject.set(x, "anchorXOffset", js.undefined)
    
    @scala.inline
    def setAnchorYOffset(value: String): Self = StObject.set(x, "anchorYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorYOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYOffsetMetadataUndefined: Self = StObject.set(x, "anchorYOffsetMetadata", js.undefined)
    
    @scala.inline
    def setAnchorYOffsetUndefined: Self = StObject.set(x, "anchorYOffset", js.undefined)
    
    @scala.inline
    def setConditionalParentLabel(value: String): Self = StObject.set(x, "conditionalParentLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentLabelMetadataUndefined: Self = StObject.set(x, "conditionalParentLabelMetadata", js.undefined)
    
    @scala.inline
    def setConditionalParentLabelUndefined: Self = StObject.set(x, "conditionalParentLabel", js.undefined)
    
    @scala.inline
    def setConditionalParentValue(value: String): Self = StObject.set(x, "conditionalParentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentValueMetadataUndefined: Self = StObject.set(x, "conditionalParentValueMetadata", js.undefined)
    
    @scala.inline
    def setConditionalParentValueUndefined: Self = StObject.set(x, "conditionalParentValue", js.undefined)
    
    @scala.inline
    def setCustomTabId(value: String): Self = StObject.set(x, "customTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "customTabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTabIdMetadataUndefined: Self = StObject.set(x, "customTabIdMetadata", js.undefined)
    
    @scala.inline
    def setCustomTabIdUndefined: Self = StObject.set(x, "customTabId", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "documentIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdMetadataUndefined: Self = StObject.set(x, "documentIdMetadata", js.undefined)
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFormOrder(value: String): Self = StObject.set(x, "formOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOrderMetadataUndefined: Self = StObject.set(x, "formOrderMetadata", js.undefined)
    
    @scala.inline
    def setFormOrderUndefined: Self = StObject.set(x, "formOrder", js.undefined)
    
    @scala.inline
    def setFormPageLabel(value: String): Self = StObject.set(x, "formPageLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageLabelMetadataUndefined: Self = StObject.set(x, "formPageLabelMetadata", js.undefined)
    
    @scala.inline
    def setFormPageLabelUndefined: Self = StObject.set(x, "formPageLabel", js.undefined)
    
    @scala.inline
    def setFormPageNumber(value: String): Self = StObject.set(x, "formPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageNumberMetadataUndefined: Self = StObject.set(x, "formPageNumberMetadata", js.undefined)
    
    @scala.inline
    def setFormPageNumberUndefined: Self = StObject.set(x, "formPageNumber", js.undefined)
    
    @scala.inline
    def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "groupLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLabelMetadataUndefined: Self = StObject.set(x, "groupLabelMetadata", js.undefined)
    
    @scala.inline
    def setGroupLabelUndefined: Self = StObject.set(x, "groupLabel", js.undefined)
    
    @scala.inline
    def setGroupRule(value: String): Self = StObject.set(x, "groupRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRuleMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "groupRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRuleMetadataUndefined: Self = StObject.set(x, "groupRuleMetadata", js.undefined)
    
    @scala.inline
    def setGroupRuleUndefined: Self = StObject.set(x, "groupRule", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "heightMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMetadataUndefined: Self = StObject.set(x, "heightMetadata", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaximumAllowed(value: String): Self = StObject.set(x, "maximumAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAllowedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "maximumAllowedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAllowedMetadataUndefined: Self = StObject.set(x, "maximumAllowedMetadata", js.undefined)
    
    @scala.inline
    def setMaximumAllowedUndefined: Self = StObject.set(x, "maximumAllowed", js.undefined)
    
    @scala.inline
    def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = StObject.set(x, "mergeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldUndefined: Self = StObject.set(x, "mergeField", js.undefined)
    
    @scala.inline
    def setMergeFieldXml(value: String): Self = StObject.set(x, "mergeFieldXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldXmlUndefined: Self = StObject.set(x, "mergeFieldXml", js.undefined)
    
    @scala.inline
    def setMinimumRequired(value: String): Self = StObject.set(x, "minimumRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "minimumRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredMetadataUndefined: Self = StObject.set(x, "minimumRequiredMetadata", js.undefined)
    
    @scala.inline
    def setMinimumRequiredUndefined: Self = StObject.set(x, "minimumRequired", js.undefined)
    
    @scala.inline
    def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberMetadataUndefined: Self = StObject.set(x, "pageNumberMetadata", js.undefined)
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdGuidMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidMetadataUndefined: Self = StObject.set(x, "recipientIdGuidMetadata", js.undefined)
    
    @scala.inline
    def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdMetadataUndefined: Self = StObject.set(x, "recipientIdMetadata", js.undefined)
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setSmartContractInformation(value: SmartContractInformation): Self = StObject.set(x, "smartContractInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartContractInformationUndefined: Self = StObject.set(x, "smartContractInformation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "statusMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMetadataUndefined: Self = StObject.set(x, "statusMetadata", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTabGroupLabels(value: js.Array[String]): Self = StObject.set(x, "tabGroupLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabGroupLabelsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabGroupLabelsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabGroupLabelsMetadataUndefined: Self = StObject.set(x, "tabGroupLabelsMetadata", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsUndefined: Self = StObject.set(x, "tabGroupLabels", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsVarargs(value: String*): Self = StObject.set(x, "tabGroupLabels", js.Array(value :_*))
    
    @scala.inline
    def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdMetadataUndefined: Self = StObject.set(x, "tabIdMetadata", js.undefined)
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    @scala.inline
    def setTabOrder(value: String): Self = StObject.set(x, "tabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOrderMetadataUndefined: Self = StObject.set(x, "tabOrderMetadata", js.undefined)
    
    @scala.inline
    def setTabOrderUndefined: Self = StObject.set(x, "tabOrder", js.undefined)
    
    @scala.inline
    def setTabScope(value: String): Self = StObject.set(x, "tabScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabScopeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabScopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabScopeMetadataUndefined: Self = StObject.set(x, "tabScopeMetadata", js.undefined)
    
    @scala.inline
    def setTabScopeUndefined: Self = StObject.set(x, "tabScope", js.undefined)
    
    @scala.inline
    def setTabType(value: String): Self = StObject.set(x, "tabType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTypeMetadataUndefined: Self = StObject.set(x, "tabTypeMetadata", js.undefined)
    
    @scala.inline
    def setTabTypeUndefined: Self = StObject.set(x, "tabType", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateLockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedMetadataUndefined: Self = StObject.set(x, "templateLockedMetadata", js.undefined)
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredMetadataUndefined: Self = StObject.set(x, "templateRequiredMetadata", js.undefined)
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setToolTipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "toolTipMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipMetadataUndefined: Self = StObject.set(x, "toolTipMetadata", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMessageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "validationMessageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMessageMetadataUndefined: Self = StObject.set(x, "validationMessageMetadata", js.undefined)
    
    @scala.inline
    def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "widthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthMetadataUndefined: Self = StObject.set(x, "widthMetadata", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXPosition(value: String): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "xPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionMetadataUndefined: Self = StObject.set(x, "xPositionMetadata", js.undefined)
    
    @scala.inline
    def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: String): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "yPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionMetadataUndefined: Self = StObject.set(x, "yPositionMetadata", js.undefined)
    
    @scala.inline
    def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}
