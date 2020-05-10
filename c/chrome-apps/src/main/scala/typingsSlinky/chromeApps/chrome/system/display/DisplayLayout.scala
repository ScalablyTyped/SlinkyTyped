package typingsSlinky.chromeApps.chrome.system.display

import typingsSlinky.chromeApps.AnonBOTTOM
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM
import typingsSlinky.chromeApps.chromeAppsStrings.LEFT
import typingsSlinky.chromeApps.chromeAppsStrings.RIGHT
import typingsSlinky.chromeApps.chromeAppsStrings.TOP
import typingsSlinky.chromeApps.chromeAppsStrings.bottom_
import typingsSlinky.chromeApps.chromeAppsStrings.left_
import typingsSlinky.chromeApps.chromeAppsStrings.right_
import typingsSlinky.chromeApps.chromeAppsStrings.top_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 53
  */
@js.native
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String = js.native
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: integer = js.native
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String = js.native
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum DisplayPosition
    */
  var position: ToStringLiteral[
    AnonBOTTOM, 
    /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
    Exclude[
      /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
      top_ | right_ | bottom_ | left_
    ]
  ] = js.native
}

object DisplayLayout {
  @scala.inline
  def apply(
    id: String,
    offset: integer,
    parentId: String,
    position: ToStringLiteral[
      AnonBOTTOM, 
      /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
      Exclude[
        /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
        top_ | right_ | bottom_ | left_
      ]
    ]
  ): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayLayout]
  }
  @scala.inline
  implicit class DisplayLayoutOps[Self <: DisplayLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(
      value: ToStringLiteral[
          AnonBOTTOM, 
          /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
          Exclude[
            /* keyof chrome-apps.AnonBOTTOM */ TOP | RIGHT | BOTTOM | LEFT, 
            top_ | right_ | bottom_ | left_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

