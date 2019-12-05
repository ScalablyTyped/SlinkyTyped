package typingsSlinky.gestalt.gestaltMod

import typingsSlinky.gestalt.Anon_ActiveTabIndex
import typingsSlinky.gestalt.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeTabIndex: Double
  var tabs: js.Array[Anon_Href]
  def onChange(args: Anon_ActiveTabIndex): Unit
}

object TabsProps {
  @scala.inline
  def apply(activeTabIndex: Double, onChange: Anon_ActiveTabIndex => Unit, tabs: js.Array[Anon_Href]): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsProps]
  }
}

