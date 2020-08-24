package typingsSlinky.antd.components

import typingsSlinky.antd.collapsePanelMod.CollapsePanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsePanel {
  @JSImport("antd/lib/collapse/CollapsePanel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps_1625560543 = new SharedBuilder_CollapsePanelProps_1625560543(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CollapsePanel.type): SharedBuilder_CollapsePanelProps_1625560543 = new SharedBuilder_CollapsePanelProps_1625560543(js.Array(this.component, js.Dictionary.empty))()
}

