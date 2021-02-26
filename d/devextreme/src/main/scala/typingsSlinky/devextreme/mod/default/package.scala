package typingsSlinky.devextreme.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object default {
  
  @scala.inline
  def config(): typingsSlinky.devextreme.mod.DevExpress.globalConfig = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[typingsSlinky.devextreme.mod.DevExpress.globalConfig]
  @scala.inline
  def config(config: typingsSlinky.devextreme.mod.DevExpress.globalConfig): scala.Unit = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def devices: typingsSlinky.devextreme.mod.DevExpress.DevicesObject = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("devices").asInstanceOf[typingsSlinky.devextreme.mod.DevExpress.DevicesObject]
  @scala.inline
  def devices_=(x: typingsSlinky.devextreme.mod.DevExpress.DevicesObject): scala.Unit = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].updateDynamic("devices")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def hideTopOverlay(): scala.Boolean = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hideTopOverlay")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def registerComponent(name: java.lang.String, componentClass: js.Any): scala.Unit = (typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerComponent(name: java.lang.String, namespace: js.Any, componentClass: js.Any): scala.Unit = (typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTemplateEngine(templateEngineName: java.lang.String): scala.Unit = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setTemplateEngine(templateEngineOptions: typingsSlinky.devextreme.anon.Compile): scala.Unit = typingsSlinky.devextreme.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineOptions.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
