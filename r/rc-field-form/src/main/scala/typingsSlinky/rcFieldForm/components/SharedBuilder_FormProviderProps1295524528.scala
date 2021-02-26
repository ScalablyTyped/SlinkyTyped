package typingsSlinky.rcFieldForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.formContextMod.FormChangeInfo
import typingsSlinky.rcFieldForm.formContextMod.FormFinishInfo
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FormProviderProps1295524528 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def onFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): this.type = set("onFormChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): this.type = set("onFormFinish", js.Any.fromFunction2(value))
  
  @scala.inline
  def validateMessages(value: ValidateMessages): this.type = set("validateMessages", value.asInstanceOf[js.Any])
}
