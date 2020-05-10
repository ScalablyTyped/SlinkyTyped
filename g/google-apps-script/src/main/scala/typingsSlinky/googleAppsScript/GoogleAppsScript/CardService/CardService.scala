package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CardService provides the ability to create generic cards used across different Google
  * extensibility products, such as Gmail add-ons.
  *
  * Currently you can only use this service to construct Gmail add-ons.
  *
  *     return CardService.newCardBuilder()
  *              .setHeader(CardService.newCardHeader().setTitle("CardTitle"))
  *              .build();
  *
  * Or you can return multiple Cards like so:
  *
  *     return [
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build()
  *     ]
  *
  * The following shows how you could define a card with a header, text, an image and a menu item:
  *
  *     function createWidgetDemoCard() {
  *       return CardService
  *          .newCardBuilder()
  *          .setHeader(
  *              CardService.newCardHeader()
  *                  .setTitle('Widget demonstration')
  *                  .setSubtitle('Check out these widgets')
  *                  .setImageStyle(CardService.ImageStyle.SQUARE)
  *                  .setImageUrl(
  *                      'https://www.example.com/images/headerImage.png'))
  *          .addSection(
  *               CardService.newCardSection()
  *                   .setHeader('Simple widgets')  // optional
  *                   .addWidget(CardService.newTextParagraph().setText(
  *                       'These widgets are display-only. ' +
  *                       'A text paragraph can have multiple lines and ' +
  *                       'formatting.'))
  *                   .addWidget(CardService.newImage().setImageUrl(
  *                       'https://www.example.com/images/mapsImage.png')))
  *          .addCardAction(CardService.newCardAction().setText('Gmail').setOpenLink(
  *              CardService.newOpenLink().setUrl('https://mail.google.com/mail')))
  *          .build();
  *     }
  */
@js.native
trait CardService extends js.Object {
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any = js.native
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any = js.native
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any = js.native
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any = js.native
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any = js.native
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any = js.native
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any = js.native
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any = js.native
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any = js.native
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any = js.native
  def newAction(): Action = js.native
  def newActionResponseBuilder(): ActionResponseBuilder = js.native
  def newAuthorizationAction(): AuthorizationAction = js.native
  def newAuthorizationException(): AuthorizationException = js.native
  def newButtonSet(): ButtonSet = js.native
  def newCardAction(): CardAction = js.native
  def newCardBuilder(): CardBuilder = js.native
  def newCardHeader(): CardHeader = js.native
  def newCardSection(): CardSection = js.native
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder = js.native
  def newImage(): Image = js.native
  def newImageButton(): ImageButton = js.native
  def newKeyValue(): KeyValue = js.native
  def newNavigation(): Navigation = js.native
  def newNotification(): Notification = js.native
  def newOpenLink(): OpenLink = js.native
  def newSelectionInput(): SelectionInput = js.native
  def newSuggestions(): Suggestions = js.native
  def newSuggestionsResponseBuilder(): SuggestionsResponseBuilder = js.native
  def newSwitch(): Switch = js.native
  def newTextButton(): TextButton = js.native
  def newTextInput(): TextInput = js.native
  def newTextParagraph(): TextParagraph = js.native
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder = js.native
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder = js.native
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction = js.native
}

object CardService {
  @scala.inline
  def apply(
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any,
    newAction: () => Action,
    newActionResponseBuilder: () => ActionResponseBuilder,
    newAuthorizationAction: () => AuthorizationAction,
    newAuthorizationException: () => AuthorizationException,
    newButtonSet: () => ButtonSet,
    newCardAction: () => CardAction,
    newCardBuilder: () => CardBuilder,
    newCardHeader: () => CardHeader,
    newCardSection: () => CardSection,
    newComposeActionResponseBuilder: () => ComposeActionResponseBuilder,
    newImage: () => Image,
    newImageButton: () => ImageButton,
    newKeyValue: () => KeyValue,
    newNavigation: () => Navigation,
    newNotification: () => Notification,
    newOpenLink: () => OpenLink,
    newSelectionInput: () => SelectionInput,
    newSuggestions: () => Suggestions,
    newSuggestionsResponseBuilder: () => SuggestionsResponseBuilder,
    newSwitch: () => Switch,
    newTextButton: () => TextButton,
    newTextInput: () => TextInput,
    newTextParagraph: () => TextParagraph,
    newUniversalActionResponseBuilder: () => UniversalActionResponseBuilder,
    newUpdateDraftActionResponseBuilder: () => UpdateDraftActionResponseBuilder,
    newUpdateDraftBodyAction: () => UpdateDraftBodyAction
  ): CardService = {
    val __obj = js.Dynamic.literal(ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any], newAction = js.Any.fromFunction0(newAction), newActionResponseBuilder = js.Any.fromFunction0(newActionResponseBuilder), newAuthorizationAction = js.Any.fromFunction0(newAuthorizationAction), newAuthorizationException = js.Any.fromFunction0(newAuthorizationException), newButtonSet = js.Any.fromFunction0(newButtonSet), newCardAction = js.Any.fromFunction0(newCardAction), newCardBuilder = js.Any.fromFunction0(newCardBuilder), newCardHeader = js.Any.fromFunction0(newCardHeader), newCardSection = js.Any.fromFunction0(newCardSection), newComposeActionResponseBuilder = js.Any.fromFunction0(newComposeActionResponseBuilder), newImage = js.Any.fromFunction0(newImage), newImageButton = js.Any.fromFunction0(newImageButton), newKeyValue = js.Any.fromFunction0(newKeyValue), newNavigation = js.Any.fromFunction0(newNavigation), newNotification = js.Any.fromFunction0(newNotification), newOpenLink = js.Any.fromFunction0(newOpenLink), newSelectionInput = js.Any.fromFunction0(newSelectionInput), newSuggestions = js.Any.fromFunction0(newSuggestions), newSuggestionsResponseBuilder = js.Any.fromFunction0(newSuggestionsResponseBuilder), newSwitch = js.Any.fromFunction0(newSwitch), newTextButton = js.Any.fromFunction0(newTextButton), newTextInput = js.Any.fromFunction0(newTextInput), newTextParagraph = js.Any.fromFunction0(newTextParagraph), newUniversalActionResponseBuilder = js.Any.fromFunction0(newUniversalActionResponseBuilder), newUpdateDraftActionResponseBuilder = js.Any.fromFunction0(newUpdateDraftActionResponseBuilder), newUpdateDraftBodyAction = js.Any.fromFunction0(newUpdateDraftBodyAction))
    __obj.asInstanceOf[CardService]
  }
  @scala.inline
  implicit class CardServiceOps[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.CardService.CardService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposedEmailType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComposedEmailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadIndicator(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenAs(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionInputType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionInputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextButtonStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDraftBodyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDraftBodyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewAction(value: () => Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActionResponseBuilder(value: () => ActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActionResponseBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAuthorizationAction(value: () => AuthorizationAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAuthorizationAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAuthorizationException(value: () => AuthorizationException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAuthorizationException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewButtonSet(value: () => ButtonSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newButtonSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCardAction(value: () => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCardAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCardBuilder(value: () => CardBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCardBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCardHeader(value: () => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCardHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCardSection(value: () => CardSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCardSection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewComposeActionResponseBuilder(value: () => ComposeActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newComposeActionResponseBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImage(value: () => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImageButton(value: () => ImageButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImageButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewKeyValue(value: () => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newKeyValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNavigation(value: () => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNavigation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNotification(value: () => Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOpenLink(value: () => OpenLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOpenLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSelectionInput(value: () => SelectionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectionInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSuggestions(value: () => Suggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSuggestions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSuggestionsResponseBuilder(value: () => SuggestionsResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSuggestionsResponseBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSwitch(value: () => Switch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSwitch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextButton(value: () => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextInput(value: () => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextParagraph(value: () => TextParagraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextParagraph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUniversalActionResponseBuilder(value: () => UniversalActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUniversalActionResponseBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateDraftActionResponseBuilder(value: () => UpdateDraftActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateDraftActionResponseBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateDraftBodyAction(value: () => UpdateDraftBodyAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateDraftBodyAction")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

