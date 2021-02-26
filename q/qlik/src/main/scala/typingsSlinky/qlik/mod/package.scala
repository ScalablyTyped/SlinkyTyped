package typingsSlinky.qlik

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomPropertyOptions = js.Array[typingsSlinky.qlik.mod.CustomPropertyOption] | js.Function0[js.Array[typingsSlinky.qlik.mod.CustomPropertyOption]]
  
  type Global = js.Any
  
  type NxCellRows = js.Array[typingsSlinky.qlik.mod.NxCell]
  
  type NxMeasureInfo = typingsSlinky.qlik.mod.ColumnInfo
  
  type Paint = js.ThisFunction10[
    /* this */ typingsSlinky.qlik.mod.ExtensionContext, 
    /* $element */ js.UndefOr[typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement]], 
    /* layout */ js.UndefOr[typingsSlinky.qlik.mod.Layout], 
    /* qDimensionInfo */ js.UndefOr[typingsSlinky.qlik.mod.NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[typingsSlinky.qlik.mod.NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCell]], 
    /* measures */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCell]], 
    /* qSize */ js.UndefOr[typingsSlinky.qlik.mod.Size], 
    /* qId */ js.UndefOr[java.lang.String], 
    /* qSelectionInfo */ js.UndefOr[typingsSlinky.qlik.mod.Selectionobject], 
    scala.Unit
  ]
  
  type ShowFunction = js.Function3[
    /* layout */ typingsSlinky.qlik.mod.Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    scala.Boolean | (js.Function1[/* measure */ typingsSlinky.qlik.mod.NxMeasure, scala.Boolean])
  ]
  
  type SupportFunction = js.Function1[/* layout */ typingsSlinky.qlik.mod.Layout, scala.Boolean]
  
  type SupportItem = scala.Boolean | typingsSlinky.qlik.mod.SupportFunction
  
  type VisualizationOptions = typingsSlinky.qlik.mod.VisualizationCommon
  
  @scala.inline
  def callRepository(path: java.lang.String, method: java.lang.String, body: java.lang.String): js.Promise[_] = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("callRepository")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  
  @scala.inline
  def currApp(reference: js.Object): typingsSlinky.qlik.mod.App = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currApp")(reference.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.qlik.mod.App]
  
  @scala.inline
  def getAppList(callback: js.Array[typingsSlinky.qlik.mod.App], config: typingsSlinky.qlik.mod.GetAppConfig): scala.Unit = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAppList")(callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getExtensionList(callback: js.Array[_]): js.Promise[_] = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionList")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[_]]
  
  @scala.inline
  def getGlobal(config: typingsSlinky.qlik.mod.GetGlobalConfig): typingsSlinky.qlik.mod.Global = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.qlik.mod.Global]
  
  @scala.inline
  def openApp(appId: java.lang.String, config: typingsSlinky.qlik.mod.GetAppConfig): typingsSlinky.qlik.mod.App = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(appId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.qlik.mod.App]
  
  @scala.inline
  def registerExtension(id: java.lang.String, impl: typingsSlinky.qlik.mod.Extension, metadata: js.Object): scala.Unit = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerExtension")(id.asInstanceOf[js.Any], impl.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def resize(): scala.Unit = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[scala.Unit]
  @scala.inline
  def resize(ID: java.lang.String): scala.Unit = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resize")(ID.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLanguage(lang: typingsSlinky.qlik.mod.LanguageCodes.ALL): scala.Unit = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setOnError(
    onError: js.Function1[/* error */ typingsSlinky.qlik.mod.Error, scala.Unit],
    onWarning: js.Function1[/* warning */ java.lang.String, scala.Unit]
  ): scala.Unit = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOnError")(onError.asInstanceOf[js.Any], onWarning.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def table(ext: js.Object): scala.Unit = typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def table(ext: js.Object, path: java.lang.String): scala.Unit = (typingsSlinky.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
