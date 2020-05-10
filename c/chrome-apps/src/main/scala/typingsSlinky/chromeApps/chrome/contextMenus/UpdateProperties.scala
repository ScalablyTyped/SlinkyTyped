package typingsSlinky.chromeApps.chrome.contextMenus

import typingsSlinky.chromeApps.AnonALL
import typingsSlinky.chromeApps.AnonCHECKBOX
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.ALL
import typingsSlinky.chromeApps.chromeAppsStrings.AUDIO
import typingsSlinky.chromeApps.chromeAppsStrings.BROWSER_ACTION
import typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX
import typingsSlinky.chromeApps.chromeAppsStrings.EDITABLE
import typingsSlinky.chromeApps.chromeAppsStrings.FRAME
import typingsSlinky.chromeApps.chromeAppsStrings.IMAGE
import typingsSlinky.chromeApps.chromeAppsStrings.LAUNCHER
import typingsSlinky.chromeApps.chromeAppsStrings.LINK
import typingsSlinky.chromeApps.chromeAppsStrings.NORMAL
import typingsSlinky.chromeApps.chromeAppsStrings.PAGE
import typingsSlinky.chromeApps.chromeAppsStrings.PAGE_ACTION
import typingsSlinky.chromeApps.chromeAppsStrings.RADIO
import typingsSlinky.chromeApps.chromeAppsStrings.SELECTION
import typingsSlinky.chromeApps.chromeAppsStrings.SEPARATOR
import typingsSlinky.chromeApps.chromeAppsStrings.VIDEO
import typingsSlinky.chromeApps.chromeAppsStrings.all__
import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.browser_action_
import typingsSlinky.chromeApps.chromeAppsStrings.checkbox_
import typingsSlinky.chromeApps.chromeAppsStrings.editable_
import typingsSlinky.chromeApps.chromeAppsStrings.frame_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.launcher_
import typingsSlinky.chromeApps.chromeAppsStrings.link_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.page_
import typingsSlinky.chromeApps.chromeAppsStrings.page_action_
import typingsSlinky.chromeApps.chromeAppsStrings.radio_
import typingsSlinky.chromeApps.chromeAppsStrings.selection_
import typingsSlinky.chromeApps.chromeAppsStrings.separator_
import typingsSlinky.chromeApps.chromeAppsStrings.video_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  /** @see ContextType */
  var contexts: js.UndefOr[
    js.Array[
      ToStringLiteral[
        AnonALL, 
        /* keyof chrome-apps.AnonALL */ ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
        Exclude[
          /* keyof chrome-apps.AnonALL */ ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
          browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
        ]
      ]
    ]
  ] = js.native
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Information sent when a context menu item is clicked.
    * @since Chrome 44
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.native
  /** Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[integer | String] = js.native
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  /** @see ItemType */
  var `type`: js.UndefOr[
    ToStringLiteral[
      AnonCHECKBOX, 
      /* keyof chrome-apps.AnonCHECKBOX */ NORMAL | CHECKBOX | RADIO | SEPARATOR, 
      Exclude[
        /* keyof chrome-apps.AnonCHECKBOX */ NORMAL | CHECKBOX | RADIO | SEPARATOR, 
        normal_ | checkbox_ | radio_ | separator_
      ]
    ]
  ] = js.native
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object UpdateProperties {
  @scala.inline
  def apply(): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProperties]
  }
  @scala.inline
  implicit class UpdatePropertiesOps[Self <: UpdateProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withContexts(
      value: js.Array[
          ToStringLiteral[
            AnonALL, 
            /* keyof chrome-apps.AnonALL */ ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
            Exclude[
              /* keyof chrome-apps.AnonALL */ ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentUrlPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentUrlPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrlPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: /* info */ OnClickData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUrlPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUrlPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrlPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: ToStringLiteral[
          AnonCHECKBOX, 
          /* keyof chrome-apps.AnonCHECKBOX */ NORMAL | CHECKBOX | RADIO | SEPARATOR, 
          Exclude[
            /* keyof chrome-apps.AnonCHECKBOX */ NORMAL | CHECKBOX | RADIO | SEPARATOR, 
            normal_ | checkbox_ | radio_ | separator_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

