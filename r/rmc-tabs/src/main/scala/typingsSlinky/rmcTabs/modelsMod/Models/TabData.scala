package typingsSlinky.rmcTabs.modelsMod.Models

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabData
  extends /** for user's custom extends */
/* key */ StringDictionary[js.Any] {
  var key: js.UndefOr[String] = js.undefined
  var title: TagMod[Any]
}

object TabData {
  @scala.inline
  def apply(
    title: TagMod[Any],
    StringDictionary: /** for user's custom extends */
  /* key */ StringDictionary[js.Any] = null,
    key: String = null
  ): TabData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabData]
  }
}

