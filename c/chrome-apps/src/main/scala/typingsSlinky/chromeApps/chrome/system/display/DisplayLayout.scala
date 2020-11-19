package typingsSlinky.chromeApps.chrome.system.display

import typingsSlinky.chromeApps.anon.BOTTOM
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    BOTTOM, 
    /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
    Exclude[
      /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
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
      BOTTOM, 
      /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
      Exclude[
        /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(
      value: ToStringLiteral[
          BOTTOM, 
          /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
          Exclude[
            /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typingsSlinky.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
            top_ | right_ | bottom_ | left_
          ]
        ]
    ): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
