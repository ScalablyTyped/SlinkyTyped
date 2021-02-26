package typingsSlinky.reactEmailEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventCallback = js.Function1[/* data */ js.Object, scala.Unit]
  
  type ExportHtmlCallback = js.Function1[/* data */ typingsSlinky.reactEmailEditor.mod.HtmlExport, scala.Unit]
  
  type FileUploadCallback = js.Function2[
    /* file */ typingsSlinky.reactEmailEditor.mod.FileInfo, 
    /* done */ typingsSlinky.reactEmailEditor.mod.FileUploadDoneCallback, 
    scala.Unit
  ]
  
  type FileUploadDoneCallback = js.Function1[/* data */ typingsSlinky.reactEmailEditor.mod.FileUploadDoneData, scala.Unit]
  
  type SaveDesignCallback = js.Function1[/* data */ typingsSlinky.reactEmailEditor.mod.Design, scala.Unit]
  
  type StringList = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ToolsConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactEmailEditor.mod.ToolConfig]
  
  type Translations = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.Record[java.lang.String, java.lang.String]]
}
