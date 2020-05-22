package typingsSlinky.ionicReact.ionTabsMod

import org.scalajs.dom.raw.CustomEvent
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTabs {
  var children: TagMod[Any]
}

object Props {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    onIonTabsDidChange: /* event */ CustomEvent => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    __obj.asInstanceOf[Props]
  }
}

